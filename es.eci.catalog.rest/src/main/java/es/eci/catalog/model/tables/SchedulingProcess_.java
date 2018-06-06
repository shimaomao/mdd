/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables;


import es.eci.catalog.model.Keys;
import es.eci.catalog.model.Public;
import es.eci.catalog.model.tables.records.SchedulingProcess_Record;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchedulingProcess_ extends TableImpl<SchedulingProcess_Record> {

    private static final long serialVersionUID = 1509795399;

    /**
     * The reference instance of <code>public.scheduling_process_</code>
     */
    public static final SchedulingProcess_ SCHEDULING_PROCESS_ = new SchedulingProcess_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchedulingProcess_Record> getRecordType() {
        return SchedulingProcess_Record.class;
    }

    /**
     * The column <code>public.scheduling_process_._id_</code>.
     */
    public final TableField<SchedulingProcess_Record, Integer> _ID_ = createField("_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('scheduling_process___id__seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.scheduling_process_.name_</code>.
     */
    public final TableField<SchedulingProcess_Record, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.scheduling_process_.cron_expression_</code>.
     */
    public final TableField<SchedulingProcess_Record, String> CRON_EXPRESSION_ = createField("cron_expression_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.scheduling_process_.script_</code>.
     */
    public final TableField<SchedulingProcess_Record, String> SCRIPT_ = createField("script_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.scheduling_process_._search_</code>.
     */
    public final TableField<SchedulingProcess_Record, Object> _SEARCH_ = createField("_search_", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

    /**
     * The column <code>public.scheduling_process_._types_</code>.
     */
    public final TableField<SchedulingProcess_Record, String[]> _TYPES_ = createField("_types_", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.scheduling_process_._last_modified_</code>.
     */
    public final TableField<SchedulingProcess_Record, String> _LAST_MODIFIED_ = createField("_last_modified_", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.scheduling_process_._version_</code>.
     */
    public final TableField<SchedulingProcess_Record, Integer> _VERSION_ = createField("_version_", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.scheduling_process_</code> table reference
     */
    public SchedulingProcess_() {
        this("scheduling_process_", null);
    }

    /**
     * Create an aliased <code>public.scheduling_process_</code> table reference
     */
    public SchedulingProcess_(String alias) {
        this(alias, SCHEDULING_PROCESS_);
    }

    private SchedulingProcess_(String alias, Table<SchedulingProcess_Record> aliased) {
        this(alias, aliased, null);
    }

    private SchedulingProcess_(String alias, Table<SchedulingProcess_Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SchedulingProcess_Record, Integer> getIdentity() {
        return Keys.IDENTITY_SCHEDULING_PROCESS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SchedulingProcess_Record> getPrimaryKey() {
        return Keys.SCHEDULING_PROCESS__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SchedulingProcess_Record>> getKeys() {
        return Arrays.<UniqueKey<SchedulingProcess_Record>>asList(Keys.SCHEDULING_PROCESS__PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<SchedulingProcess_Record, Integer> getRecordVersion() {
        return _VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchedulingProcess_ as(String alias) {
        return new SchedulingProcess_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchedulingProcess_ rename(String name) {
        return new SchedulingProcess_(name, null);
    }
}