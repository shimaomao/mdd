/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model.tables.records;


import es.eci.catalog.model.tables.Item_;

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
public class Item_Record extends UpdatableRecordImpl<Item_Record> implements Record11<Integer, String, String, String, Double, Double, Double, Object, String[], String, Integer> {

    private static final long serialVersionUID = -187972334;

    /**
     * Setter for <code>public.item_._id_</code>.
     */
    public void set_Id_(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.item_._id_</code>.
     */
    public Integer get_Id_() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.item_.name_</code>.
     */
    public void setName_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.item_.name_</code>.
     */
    public String getName_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.item_.description_</code>.
     */
    public void setDescription_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.item_.description_</code>.
     */
    public String getDescription_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.item_.code_</code>.
     */
    public void setCode_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.item_.code_</code>.
     */
    public String getCode_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.item_.price_</code>.
     */
    public void setPrice_(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.item_.price_</code>.
     */
    public Double getPrice_() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>public.item_.retail_price_</code>.
     */
    public void setRetailPrice_(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.item_.retail_price_</code>.
     */
    public Double getRetailPrice_() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>public.item_.cost_price_</code>.
     */
    public void setCostPrice_(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.item_.cost_price_</code>.
     */
    public Double getCostPrice_() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>public.item_._search_</code>.
     */
    public void set_Search_(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.item_._search_</code>.
     */
    public Object get_Search_() {
        return (Object) get(7);
    }

    /**
     * Setter for <code>public.item_._types_</code>.
     */
    public void set_Types_(String... value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.item_._types_</code>.
     */
    public String[] get_Types_() {
        return (String[]) get(8);
    }

    /**
     * Setter for <code>public.item_._last_modified_</code>.
     */
    public void set_LastModified_(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.item_._last_modified_</code>.
     */
    public String get_LastModified_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.item_._version_</code>.
     */
    public void set_Version_(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.item_._version_</code>.
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
    public Row11<Integer, String, String, String, Double, Double, Double, Object, String[], String, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Double, Double, Double, Object, String[], String, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Item_.ITEM_._ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Item_.ITEM_.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Item_.ITEM_.DESCRIPTION_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Item_.ITEM_.CODE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Item_.ITEM_.PRICE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Item_.ITEM_.RETAIL_PRICE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Item_.ITEM_.COST_PRICE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field8() {
        return Item_.ITEM_._SEARCH_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field9() {
        return Item_.ITEM_._TYPES_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Item_.ITEM_._LAST_MODIFIED_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Item_.ITEM_._VERSION_;
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
    public String value2() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getPrice_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getRetailPrice_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getCostPrice_();
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
    public Item_Record value1(Integer value) {
        set_Id_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value2(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value3(String value) {
        setDescription_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value4(String value) {
        setCode_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value5(Double value) {
        setPrice_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value6(Double value) {
        setRetailPrice_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value7(Double value) {
        setCostPrice_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value8(Object value) {
        set_Search_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value9(String... value) {
        set_Types_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value10(String value) {
        set_LastModified_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record value11(Integer value) {
        set_Version_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Item_Record values(Integer value1, String value2, String value3, String value4, Double value5, Double value6, Double value7, Object value8, String[] value9, String value10, Integer value11) {
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
     * Create a detached Item_Record
     */
    public Item_Record() {
        super(Item_.ITEM_);
    }

    /**
     * Create a detached, initialised Item_Record
     */
    public Item_Record(Integer _Id_, String name_, String description_, String code_, Double price_, Double retailPrice_, Double costPrice_, Object _Search_, String[] _Types_, String _LastModified_, Integer _Version_) {
        super(Item_.ITEM_);

        set(0, _Id_);
        set(1, name_);
        set(2, description_);
        set(3, code_);
        set(4, price_);
        set(5, retailPrice_);
        set(6, costPrice_);
        set(7, _Search_);
        set(8, _Types_);
        set(9, _LastModified_);
        set(10, _Version_);
    }
}
