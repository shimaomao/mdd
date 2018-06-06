/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables;


import es.eci.catalog.model.Keys;
import es.eci.catalog.model.Public;
import es.eci.catalog.model.tables.records.Course_Record;

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
public class Course_ extends TableImpl<Course_Record> {

    private static final long serialVersionUID = -1560775038;

    /**
     * The reference instance of <code>public.course_</code>
     */
    public static final Course_ COURSE_ = new Course_();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Course_Record> getRecordType() {
        return Course_Record.class;
    }

    /**
     * The column <code>public.course_._id_</code>.
     */
    public final TableField<Course_Record, Integer> _ID_ = createField("_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('course___id__seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.course_._teaching_center_id_</code>.
     */
    public final TableField<Course_Record, Integer> _TEACHING_CENTER_ID_ = createField("_teaching_center_id_", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.course_.name_</code>.
     */
    public final TableField<Course_Record, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.course_.cycle_</code>.
     */
    public final TableField<Course_Record, String> CYCLE_ = createField("cycle_", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.course_._search_</code>.
     */
    public final TableField<Course_Record, Object> _SEARCH_ = createField("_search_", org.jooq.impl.DefaultDataType.getDefaultDataType("tsvector"), this, "");

    /**
     * The column <code>public.course_._types_</code>.
     */
    public final TableField<Course_Record, String[]> _TYPES_ = createField("_types_", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>public.course_._last_modified_</code>.
     */
    public final TableField<Course_Record, String> _LAST_MODIFIED_ = createField("_last_modified_", org.jooq.impl.SQLDataType.VARCHAR.defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.course_._version_</code>.
     */
    public final TableField<Course_Record, Integer> _VERSION_ = createField("_version_", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>public.course_</code> table reference
     */
    public Course_() {
        this("course_", null);
    }

    /**
     * Create an aliased <code>public.course_</code> table reference
     */
    public Course_(String alias) {
        this(alias, COURSE_);
    }

    private Course_(String alias, Table<Course_Record> aliased) {
        this(alias, aliased, null);
    }

    private Course_(String alias, Table<Course_Record> aliased, Field<?>[] parameters) {
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
    public Identity<Course_Record, Integer> getIdentity() {
        return Keys.IDENTITY_COURSE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Course_Record> getPrimaryKey() {
        return Keys.COURSE__PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Course_Record>> getKeys() {
        return Arrays.<UniqueKey<Course_Record>>asList(Keys.COURSE__PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<Course_Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Course_Record, ?>>asList(Keys.COURSE___COURSE_MASTER_);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableField<Course_Record, Integer> getRecordVersion() {
        return _VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Course_ as(String alias) {
        return new Course_(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Course_ rename(String name) {
        return new Course_(name, null);
    }
}
