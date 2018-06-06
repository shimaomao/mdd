package providers.postgresql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;
import javax.transaction.UserTransaction;

import org.postgresql.util.PSQLException;

import com.atomikos.datasource.pool.CreateConnectionException;
import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;

import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public final class PostgresqlProvider {
	private static DataSource ds = null;
	
	final static Logger logger = LoggerFactory.getLogger(PostgresqlProvider.class);
	
	public static UserTransaction getUserTransaction() {
		return new UserTransactionImp();
	}
	
	public static DataSource getDataSource(JsonObject config) {
		if (ds == null) {
			//JsonObject postgresqlConfig = ConfigProvider.getConfig().getJsonObject("postgresql");
			JsonObject postgresqlConfig = config.getJsonObject("postgresql");
			JsonObject postgresqlAddress = postgresqlConfig.getJsonObject("address");
			
			try {
				if (postgresqlConfig.getBoolean("enableXa", false)) {
					// Atomikos data source (XA)
					AtomikosDataSourceBean adsb = new AtomikosDataSourceBean();
					adsb.setUniqueResourceName("postgres");
					adsb.setXaDataSourceClassName("org.postgresql.xa.PGXADataSource");
					Properties p = new Properties();
					if (postgresqlConfig.getString("username") != null
							&& !postgresqlConfig.getString("username").equals(""))
						p.setProperty("user", postgresqlConfig.getString("username"));
					if (postgresqlConfig.getString("password") != null
							&& !postgresqlConfig.getString("password").equals(""))
						p.setProperty("password", postgresqlConfig.getString("password"));
					p.setProperty("serverName", postgresqlAddress.getString("host"));
					p.setProperty("portNumber", "" + postgresqlAddress.getInteger("port"));
					p.setProperty("databaseName", postgresqlConfig.getString("dbname"));
					adsb.setXaProperties(p);
					ds = adsb;
				}
				else {
					// Atomikos data source (NON-XA)
					AtomikosNonXADataSourceBean naxds = new AtomikosNonXADataSourceBean();
					naxds.setUniqueResourceName("postgres");
					naxds.setDriverClassName("org.postgresql.Driver");
					naxds.setUrl("jdbc:postgresql://" + postgresqlAddress.getString("host") + ":" + postgresqlAddress.getInteger("port") + "/" + postgresqlConfig.getString("dbname"));
					if (postgresqlConfig.getString("username") != null
							&& !postgresqlConfig.getString("username").equals(""))
						naxds.setUser(postgresqlConfig.getString("username"));
					if (postgresqlConfig.getString("password") != null
							&& !postgresqlConfig.getString("password").equals(""))
						naxds.setPassword(postgresqlConfig.getString("password"));
					naxds.setPoolSize(10);
					ds = naxds;
				}
				
				// Test connection
				ds.getConnection().close();
			}
			catch (SQLException e) {
				if (e.getCause() instanceof CreateConnectionException) {
					if (e.getCause().getCause() instanceof PSQLException) {
						PSQLException psqlException = (PSQLException) e.getCause().getCause();
						String sqlState = psqlException.getSQLState();
						
						// DB does not exist
						if (sqlState.equals("3D000")) {
							try {
								// Create database
								Connection connection = null;
								try {
									connection = DriverManager.getConnection("jdbc:postgresql://" + postgresqlAddress.getString("host") + ":" + postgresqlAddress.getInteger("port") + "/", postgresqlConfig.getString("username"), postgresqlConfig.getString("password"));
									Statement statement = connection.createStatement();
									statement.execute("CREATE DATABASE " + postgresqlConfig.getString("dbname"));
								}
								finally {
									if (connection != null)
										connection.close();
								}
								
								try {
									connection = DriverManager.getConnection("jdbc:postgresql://" + postgresqlAddress.getString("host") + ":" + postgresqlAddress.getInteger("port") + "/" + postgresqlConfig.getString("dbname"), postgresqlConfig.getString("username"), postgresqlConfig.getString("password"));
									Statement statement = connection.createStatement();
									
									// Create regression slot for publishing feed to Kafka
									if (postgresqlConfig.getBoolean("enableDataStreaming", false)) {
										statement.execute("SELECT * FROM pg_create_logical_replication_slot('" + postgresqlConfig.getString("dbname") + "_slot', 'test_decoding')");
									}
									
									BufferedReader br = new BufferedReader(new FileReader(new File(postgresqlConfig.getString("initial.load.script.path"))));
									String line = null;
									StringBuffer sentence = new StringBuffer();
									
									boolean executionDisabled = false;
									
									while ((line = br.readLine()) != null) {
										sentence.append(line);
										
										if (line.contains("$$")) {
											executionDisabled = !executionDisabled;
										}
										
										if (!executionDisabled && line.contains(";")) {
											logger.info(sentence.toString());
											statement.execute(sentence.toString());
											sentence = new StringBuffer();
										}
									}
									br.close();
								}
								finally {
									if (connection != null)
										connection.close();
								}
								
								// Load Data
								ds = getDataSource(config);
							}
							catch (Exception exception) {
								exception.printStackTrace();
							}
						}
					}
					else {
						e.printStackTrace();
					}
				}
			}
		}
		return ds;
	}
	
	public static Connection getConnection(JsonObject config) throws Exception {
		return getDataSource(config).getConnection();
	}
}
