/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables;


import es.eci.catalog.model.Keys;
import es.eci.catalog.model.Public;
import es.eci.catalog.model.tables.records.SecurityRole_Record;

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
public class SecurityRole_ extends TableImpl<SecurityRole_Record> {

    private static final long serialVersionUID = -565464812;

    /**
     * The reference instance of <code>public.security_role_</code>
     */
    public static final SecurityRole_ SECURITY_ROLE_ = new SecurityRole_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecurityRole_Record> getRecordType() {
        return SecurityRole_Record.class;
    }

    /**
     * The column <code>public.security_role_._id_</code>.
     */
    public final TableField<SecurityRole_Record, Integer> _ID_ = createField("_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('security_role___id__seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.security_role_.name_</code>.
     */
    public final TableField<SecurityRole_Record, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.security_role_.comments_</code>.
     */
    public final TableField<SecurityRole_Record, String> COMMENTS_ = createField("comments_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.security_role_._search_</code>.
     */
    public final TableField<SecurityRole_Record, Object> _SEARCH_ = createField("_search_", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

    /**
     * The column <code>public.security_role_._types_</code>.
     */
    public final TableField<SecurityRole_Record, String[]> _TYPES_ = createField("_types_", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.security_role_._last_modified_</code>.
     */
    public final TableField<SecurityRole_Record, String> _LAST_MODIFIED_ = createField("_last_modified_", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.security_role_._version_</code>.
     */
    public final TableField<SecurityRole_Record, Integer> _VERSION_ = createField("_version_", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.security_role_</code> table reference
     */
    public SecurityRole_() {
        this("security_role_", null);
    }

    /**
     * Create an aliased <code>public.security_role_</code> table reference
     */
    public SecurityRole_(String alias) {
        this(alias, SECURITY_ROLE_);
    }

    private SecurityRole_(String alias, Table<SecurityRole_Record> aliased) {
        this(alias, aliased, null);
    }

    private SecurityRole_(String alias, Table<SecurityRole_Record> aliased, Field<?>[] parameters) {
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
    public Identity<SecurityRole_Record, Integer> getIdentity() {
        return Keys.IDENTITY_SECURITY_ROLE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SecurityRole_Record> getPrimaryKey() {
        return Keys.SECURITY_ROLE__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SecurityRole_Record>> getKeys() {
        return Arrays.<UniqueKey<SecurityRole_Record>>asList(Keys.SECURITY_ROLE__PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<SecurityRole_Record, Integer> getRecordVersion() {
        return _VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRole_ as(String alias) {
        return new SecurityRole_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecurityRole_ rename(String name) {
        return new SecurityRole_(name, null);
    }
}
