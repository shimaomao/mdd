/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables.records;


import es.eci.catalog.model.tables.SecurityRowLevelPolicy_;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SecurityRowLevelPolicy_Record extends UpdatableRecordImpl<SecurityRowLevelPolicy_Record> implements Record11<Integer, Integer, String, Integer, Integer[], String, String, Object, String[], String, Integer> {

    private static final long serialVersionUID = -1208963840;

    /**
     * Setter for <code>public.security_row_level_policy_._id_</code>.
     */
    public void set_Id_(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._id_</code>.
     */
    public Integer get_Id_() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.security_row_level_policy_._security_role_id_</code>.
     */
    public void set_SecurityRoleId_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._security_role_id_</code>.
     */
    public Integer get_SecurityRoleId_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.security_row_level_policy_.name_</code>.
     */
    public void setName_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_.name_</code>.
     */
    public String getName_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.security_row_level_policy_.entity_</code>.
     */
    public void setEntity_(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_.entity_</code>.
     */
    public Integer getEntity_() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.security_row_level_policy_.operations_</code>.
     */
    public void setOperations_(Integer... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_.operations_</code>.
     */
    public Integer[] getOperations_() {
        return (Integer[]) get(4);
    }

    /**
     * Setter for <code>public.security_row_level_policy_.using_expression_</code>.
     */
    public void setUsingExpression_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_.using_expression_</code>.
     */
    public String getUsingExpression_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.security_row_level_policy_.check_expression_</code>.
     */
    public void setCheckExpression_(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_.check_expression_</code>.
     */
    public String getCheckExpression_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.security_row_level_policy_._search_</code>.
     */
    public void set_Search_(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._search_</code>.
     */
    public Object get_Search_() {
        return (Object) get(7);
    }

    /**
     * Setter for <code>public.security_row_level_policy_._types_</code>.
     */
    public void set_Types_(String... value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._types_</code>.
     */
    public String[] get_Types_() {
        return (String[]) get(8);
    }

    /**
     * Setter for <code>public.security_row_level_policy_._last_modified_</code>.
     */
    public void set_LastModified_(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._last_modified_</code>.
     */
    public String get_LastModified_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.security_row_level_policy_._version_</code>.
     */
    public void set_Version_(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.security_row_level_policy_._version_</code>.
     */
    public Integer get_Version_() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Integer, Integer[], String, String, Object, String[], String, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Integer, Integer[], String, String, Object, String[], String, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._SECURITY_ROLE_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.ENTITY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field5() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.OPERATIONS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.USING_EXPRESSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.CHECK_EXPRESSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field8() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._SEARCH_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field9() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._TYPES_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._LAST_MODIFIED_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._VERSION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return get_Id_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return get_SecurityRoleId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getEntity_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value5() {
        return getOperations_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUsingExpression_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCheckExpression_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value8() {
        return get_Search_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value9() {
        return get_Types_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return get_LastModified_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return get_Version_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value1(Integer value) {
        set_Id_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value2(Integer value) {
        set_SecurityRoleId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value3(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value4(Integer value) {
        setEntity_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value5(Integer... value) {
        setOperations_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value6(String value) {
        setUsingExpression_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value7(String value) {
        setCheckExpression_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value8(Object value) {
        set_Search_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value9(String... value) {
        set_Types_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value10(String value) {
        set_LastModified_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record value11(Integer value) {
        set_Version_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityRowLevelPolicy_Record values(Integer value1, Integer value2, String value3, Integer value4, Integer[] value5, String value6, String value7, Object value8, String[] value9, String value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SecurityRowLevelPolicy_Record
     */
    public SecurityRowLevelPolicy_Record() {
        super(SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_);
    }

    /**
     * Create a detached, initialised SecurityRowLevelPolicy_Record
     */
    public SecurityRowLevelPolicy_Record(Integer _Id_, Integer _SecurityRoleId_, String name_, Integer entity_, Integer[] operations_, String usingExpression_, String checkExpression_, Object _Search_, String[] _Types_, String _LastModified_, Integer _Version_) {
        super(SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_);

        set(0, _Id_);
        set(1, _SecurityRoleId_);
        set(2, name_);
        set(3, entity_);
        set(4, operations_);
        set(5, usingExpression_);
        set(6, checkExpression_);
        set(7, _Search_);
        set(8, _Types_);
        set(9, _LastModified_);
        set(10, _Version_);
    }
}