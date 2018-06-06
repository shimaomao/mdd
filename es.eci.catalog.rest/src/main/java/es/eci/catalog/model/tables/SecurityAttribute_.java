/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables;


import es.eci.catalog.model.Keys;
import es.eci.catalog.model.Public;
import es.eci.catalog.model.tables.records.SecurityAttribute_Record;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class SecurityAttribute_ extends TableImpl<SecurityAttribute_Record> {

    private static final long serialVersionUID = 2005909816;

    /**
     * The reference instance of <code>public.security_attribute_</code>
     */
    public static final SecurityAttribute_ SECURITY_ATTRIBUTE_ = new SecurityAttribute_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SecurityAttribute_Record> getRecordType() {
        return SecurityAttribute_Record.class;
    }

    /**
     * The column <code>public.security_attribute_._id_</code>.
     */
    public final TableField<SecurityAttribute_Record, Integer> _ID_ = createField("_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('security_attribute___id__seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.security_attribute_._security_entity_id_</code>.
     */
    public final TableField<SecurityAttribute_Record, Integer> _SECURITY_ENTITY_ID_ = createField("_security_entity_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.security_attribute_.name_</code>.
     */
    public final TableField<SecurityAttribute_Record, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.security_attribute_._search_</code>.
     */
    public final TableField<SecurityAttribute_Record, Object> _SEARCH_ = createField("_search_", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

    /**
     * The column <code>public.security_attribute_._types_</code>.
     */
    public final TableField<SecurityAttribute_Record, String[]> _TYPES_ = createField("_types_", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.security_attribute_._last_modified_</code>.
     */
    public final TableField<SecurityAttribute_Record, String> _LAST_MODIFIED_ = createField("_last_modified_", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.security_attribute_._version_</code>.
     */
    public final TableField<SecurityAttribute_Record, Integer> _VERSION_ = createField("_version_", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.security_attribute_</code> table reference
     */
    public SecurityAttribute_() {
        this("security_attribute_", null);
    }

    /**
     * Create an aliased <code>public.security_attribute_</code> table reference
     */
    public SecurityAttribute_(String alias) {
        this(alias, SECURITY_ATTRIBUTE_);
    }

    private SecurityAttribute_(String alias, Table<SecurityAttribute_Record> aliased) {
        this(alias, aliased, null);
    }

    private SecurityAttribute_(String alias, Table<SecurityAttribute_Record> aliased, Field<?>[] parameters) {
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
    public Identity<SecurityAttribute_Record, Integer> getIdentity() {
        return Keys.IDENTITY_SECURITY_ATTRIBUTE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SecurityAttribute_Record> getPrimaryKey() {
        return Keys.SECURITY_ATTRIBUTE__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SecurityAttribute_Record>> getKeys() {
        return Arrays.<UniqueKey<SecurityAttribute_Record>>asList(Keys.SECURITY_ATTRIBUTE__PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SecurityAttribute_Record, ?>> getReferences() {
        return Arrays.<ForeignKey<SecurityAttribute_Record, ?>>asList(Keys.SECURITY_ATTRIBUTE___SECURITY_ATTRIBUTE_MASTER_);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<SecurityAttribute_Record, Integer> getRecordVersion() {
        return _VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityAttribute_ as(String alias) {
        return new SecurityAttribute_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SecurityAttribute_ rename(String name) {
        return new SecurityAttribute_(name, null);
    }
}