/*
 * This file is generated by jOOQ.
*/
package es.eci.catalog.model;


import es.eci.catalog.model.tables.Course_;
import es.eci.catalog.model.tables.ItemImage_;
import es.eci.catalog.model.tables.Item_;
import es.eci.catalog.model.tables.Material_;
import es.eci.catalog.model.tables.SchedulingProcess_;
import es.eci.catalog.model.tables.SecurityAccessPrivilege_;
import es.eci.catalog.model.tables.SecurityAttribute_;
import es.eci.catalog.model.tables.SecurityEntity_;
import es.eci.catalog.model.tables.SecurityOperationType_;
import es.eci.catalog.model.tables.SecurityRole_;
import es.eci.catalog.model.tables.SecurityRowLevelPolicy_;
import es.eci.catalog.model.tables.SecurityUser_;
import es.eci.catalog.model.tables.TeachingCenter_;
import es.eci.catalog.model.tables.records.Course_Record;
import es.eci.catalog.model.tables.records.ItemImage_Record;
import es.eci.catalog.model.tables.records.Item_Record;
import es.eci.catalog.model.tables.records.Material_Record;
import es.eci.catalog.model.tables.records.SchedulingProcess_Record;
import es.eci.catalog.model.tables.records.SecurityAccessPrivilege_Record;
import es.eci.catalog.model.tables.records.SecurityAttribute_Record;
import es.eci.catalog.model.tables.records.SecurityEntity_Record;
import es.eci.catalog.model.tables.records.SecurityOperationType_Record;
import es.eci.catalog.model.tables.records.SecurityRole_Record;
import es.eci.catalog.model.tables.records.SecurityRowLevelPolicy_Record;
import es.eci.catalog.model.tables.records.SecurityUser_Record;
import es.eci.catalog.model.tables.records.TeachingCenter_Record;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<Course_Record, Integer> IDENTITY_COURSE_ = Identities0.IDENTITY_COURSE_;
    public static final Identity<Item_Record, Integer> IDENTITY_ITEM_ = Identities0.IDENTITY_ITEM_;
    public static final Identity<ItemImage_Record, Integer> IDENTITY_ITEM_IMAGE_ = Identities0.IDENTITY_ITEM_IMAGE_;
    public static final Identity<Material_Record, Integer> IDENTITY_MATERIAL_ = Identities0.IDENTITY_MATERIAL_;
    public static final Identity<SchedulingProcess_Record, Integer> IDENTITY_SCHEDULING_PROCESS_ = Identities0.IDENTITY_SCHEDULING_PROCESS_;
    public static final Identity<SecurityAccessPrivilege_Record, Integer> IDENTITY_SECURITY_ACCESS_PRIVILEGE_ = Identities0.IDENTITY_SECURITY_ACCESS_PRIVILEGE_;
    public static final Identity<SecurityAttribute_Record, Integer> IDENTITY_SECURITY_ATTRIBUTE_ = Identities0.IDENTITY_SECURITY_ATTRIBUTE_;
    public static final Identity<SecurityEntity_Record, Integer> IDENTITY_SECURITY_ENTITY_ = Identities0.IDENTITY_SECURITY_ENTITY_;
    public static final Identity<SecurityOperationType_Record, Integer> IDENTITY_SECURITY_OPERATION_TYPE_ = Identities0.IDENTITY_SECURITY_OPERATION_TYPE_;
    public static final Identity<SecurityRole_Record, Integer> IDENTITY_SECURITY_ROLE_ = Identities0.IDENTITY_SECURITY_ROLE_;
    public static final Identity<SecurityRowLevelPolicy_Record, Integer> IDENTITY_SECURITY_ROW_LEVEL_POLICY_ = Identities0.IDENTITY_SECURITY_ROW_LEVEL_POLICY_;
    public static final Identity<SecurityUser_Record, Integer> IDENTITY_SECURITY_USER_ = Identities0.IDENTITY_SECURITY_USER_;
    public static final Identity<TeachingCenter_Record, Integer> IDENTITY_TEACHING_CENTER_ = Identities0.IDENTITY_TEACHING_CENTER_;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Course_Record> COURSE__PKEY = UniqueKeys0.COURSE__PKEY;
    public static final UniqueKey<Item_Record> ITEM__PKEY = UniqueKeys0.ITEM__PKEY;
    public static final UniqueKey<ItemImage_Record> ITEM_IMAGE__PKEY = UniqueKeys0.ITEM_IMAGE__PKEY;
    public static final UniqueKey<Material_Record> MATERIAL__PKEY = UniqueKeys0.MATERIAL__PKEY;
    public static final UniqueKey<SchedulingProcess_Record> SCHEDULING_PROCESS__PKEY = UniqueKeys0.SCHEDULING_PROCESS__PKEY;
    public static final UniqueKey<SecurityAccessPrivilege_Record> SECURITY_ACCESS_PRIVILEGE__PKEY = UniqueKeys0.SECURITY_ACCESS_PRIVILEGE__PKEY;
    public static final UniqueKey<SecurityAttribute_Record> SECURITY_ATTRIBUTE__PKEY = UniqueKeys0.SECURITY_ATTRIBUTE__PKEY;
    public static final UniqueKey<SecurityEntity_Record> SECURITY_ENTITY__PKEY = UniqueKeys0.SECURITY_ENTITY__PKEY;
    public static final UniqueKey<SecurityOperationType_Record> SECURITY_OPERATION_TYPE__PKEY = UniqueKeys0.SECURITY_OPERATION_TYPE__PKEY;
    public static final UniqueKey<SecurityRole_Record> SECURITY_ROLE__PKEY = UniqueKeys0.SECURITY_ROLE__PKEY;
    public static final UniqueKey<SecurityRowLevelPolicy_Record> SECURITY_ROW_LEVEL_POLICY__PKEY = UniqueKeys0.SECURITY_ROW_LEVEL_POLICY__PKEY;
    public static final UniqueKey<SecurityUser_Record> SECURITY_USER__PKEY = UniqueKeys0.SECURITY_USER__PKEY;
    public static final UniqueKey<TeachingCenter_Record> TEACHING_CENTER__PKEY = UniqueKeys0.TEACHING_CENTER__PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Course_Record, TeachingCenter_Record> COURSE___COURSE_MASTER_ = ForeignKeys0.COURSE___COURSE_MASTER_;
    public static final ForeignKey<ItemImage_Record, Item_Record> ITEM_IMAGE___ITEM_IMAGE_MASTER_ = ForeignKeys0.ITEM_IMAGE___ITEM_IMAGE_MASTER_;
    public static final ForeignKey<Material_Record, Course_Record> MATERIAL___MATERIAL_MASTER_ = ForeignKeys0.MATERIAL___MATERIAL_MASTER_;
    public static final ForeignKey<Material_Record, Item_Record> MATERIAL___MATERIAL_ITEM_ = ForeignKeys0.MATERIAL___MATERIAL_ITEM_;
    public static final ForeignKey<SecurityAccessPrivilege_Record, SecurityRole_Record> SECURITY_ACCESS_PRIVILEGE___SECURITY_ACCESS_PRIVILEGE_MASTER_ = ForeignKeys0.SECURITY_ACCESS_PRIVILEGE___SECURITY_ACCESS_PRIVILEGE_MASTER_;
    public static final ForeignKey<SecurityAttribute_Record, SecurityEntity_Record> SECURITY_ATTRIBUTE___SECURITY_ATTRIBUTE_MASTER_ = ForeignKeys0.SECURITY_ATTRIBUTE___SECURITY_ATTRIBUTE_MASTER_;
    public static final ForeignKey<SecurityRowLevelPolicy_Record, SecurityRole_Record> SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_MASTER_ = ForeignKeys0.SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_MASTER_;
    public static final ForeignKey<SecurityRowLevelPolicy_Record, SecurityEntity_Record> SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_ENTITY_ = ForeignKeys0.SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_ENTITY_;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<Course_Record, Integer> IDENTITY_COURSE_ = createIdentity(Course_.COURSE_, Course_.COURSE_._ID_);
        public static Identity<Item_Record, Integer> IDENTITY_ITEM_ = createIdentity(Item_.ITEM_, Item_.ITEM_._ID_);
        public static Identity<ItemImage_Record, Integer> IDENTITY_ITEM_IMAGE_ = createIdentity(ItemImage_.ITEM_IMAGE_, ItemImage_.ITEM_IMAGE_._ID_);
        public static Identity<Material_Record, Integer> IDENTITY_MATERIAL_ = createIdentity(Material_.MATERIAL_, Material_.MATERIAL_._ID_);
        public static Identity<SchedulingProcess_Record, Integer> IDENTITY_SCHEDULING_PROCESS_ = createIdentity(SchedulingProcess_.SCHEDULING_PROCESS_, SchedulingProcess_.SCHEDULING_PROCESS_._ID_);
        public static Identity<SecurityAccessPrivilege_Record, Integer> IDENTITY_SECURITY_ACCESS_PRIVILEGE_ = createIdentity(SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_, SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_._ID_);
        public static Identity<SecurityAttribute_Record, Integer> IDENTITY_SECURITY_ATTRIBUTE_ = createIdentity(SecurityAttribute_.SECURITY_ATTRIBUTE_, SecurityAttribute_.SECURITY_ATTRIBUTE_._ID_);
        public static Identity<SecurityEntity_Record, Integer> IDENTITY_SECURITY_ENTITY_ = createIdentity(SecurityEntity_.SECURITY_ENTITY_, SecurityEntity_.SECURITY_ENTITY_._ID_);
        public static Identity<SecurityOperationType_Record, Integer> IDENTITY_SECURITY_OPERATION_TYPE_ = createIdentity(SecurityOperationType_.SECURITY_OPERATION_TYPE_, SecurityOperationType_.SECURITY_OPERATION_TYPE_._ID_);
        public static Identity<SecurityRole_Record, Integer> IDENTITY_SECURITY_ROLE_ = createIdentity(SecurityRole_.SECURITY_ROLE_, SecurityRole_.SECURITY_ROLE_._ID_);
        public static Identity<SecurityRowLevelPolicy_Record, Integer> IDENTITY_SECURITY_ROW_LEVEL_POLICY_ = createIdentity(SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_, SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._ID_);
        public static Identity<SecurityUser_Record, Integer> IDENTITY_SECURITY_USER_ = createIdentity(SecurityUser_.SECURITY_USER_, SecurityUser_.SECURITY_USER_._ID_);
        public static Identity<TeachingCenter_Record, Integer> IDENTITY_TEACHING_CENTER_ = createIdentity(TeachingCenter_.TEACHING_CENTER_, TeachingCenter_.TEACHING_CENTER_._ID_);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<Course_Record> COURSE__PKEY = createUniqueKey(Course_.COURSE_, "course__pkey", Course_.COURSE_._ID_);
        public static final UniqueKey<Item_Record> ITEM__PKEY = createUniqueKey(Item_.ITEM_, "item__pkey", Item_.ITEM_._ID_);
        public static final UniqueKey<ItemImage_Record> ITEM_IMAGE__PKEY = createUniqueKey(ItemImage_.ITEM_IMAGE_, "item_image__pkey", ItemImage_.ITEM_IMAGE_._ID_);
        public static final UniqueKey<Material_Record> MATERIAL__PKEY = createUniqueKey(Material_.MATERIAL_, "material__pkey", Material_.MATERIAL_._ID_);
        public static final UniqueKey<SchedulingProcess_Record> SCHEDULING_PROCESS__PKEY = createUniqueKey(SchedulingProcess_.SCHEDULING_PROCESS_, "scheduling_process__pkey", SchedulingProcess_.SCHEDULING_PROCESS_._ID_);
        public static final UniqueKey<SecurityAccessPrivilege_Record> SECURITY_ACCESS_PRIVILEGE__PKEY = createUniqueKey(SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_, "security_access_privilege__pkey", SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_._ID_);
        public static final UniqueKey<SecurityAttribute_Record> SECURITY_ATTRIBUTE__PKEY = createUniqueKey(SecurityAttribute_.SECURITY_ATTRIBUTE_, "security_attribute__pkey", SecurityAttribute_.SECURITY_ATTRIBUTE_._ID_);
        public static final UniqueKey<SecurityEntity_Record> SECURITY_ENTITY__PKEY = createUniqueKey(SecurityEntity_.SECURITY_ENTITY_, "security_entity__pkey", SecurityEntity_.SECURITY_ENTITY_._ID_);
        public static final UniqueKey<SecurityOperationType_Record> SECURITY_OPERATION_TYPE__PKEY = createUniqueKey(SecurityOperationType_.SECURITY_OPERATION_TYPE_, "security_operation_type__pkey", SecurityOperationType_.SECURITY_OPERATION_TYPE_._ID_);
        public static final UniqueKey<SecurityRole_Record> SECURITY_ROLE__PKEY = createUniqueKey(SecurityRole_.SECURITY_ROLE_, "security_role__pkey", SecurityRole_.SECURITY_ROLE_._ID_);
        public static final UniqueKey<SecurityRowLevelPolicy_Record> SECURITY_ROW_LEVEL_POLICY__PKEY = createUniqueKey(SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_, "security_row_level_policy__pkey", SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._ID_);
        public static final UniqueKey<SecurityUser_Record> SECURITY_USER__PKEY = createUniqueKey(SecurityUser_.SECURITY_USER_, "security_user__pkey", SecurityUser_.SECURITY_USER_._ID_);
        public static final UniqueKey<TeachingCenter_Record> TEACHING_CENTER__PKEY = createUniqueKey(TeachingCenter_.TEACHING_CENTER_, "teaching_center__pkey", TeachingCenter_.TEACHING_CENTER_._ID_);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<Course_Record, TeachingCenter_Record> COURSE___COURSE_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.TEACHING_CENTER__PKEY, Course_.COURSE_, "course___course_master_", Course_.COURSE_._TEACHING_CENTER_ID_);
        public static final ForeignKey<ItemImage_Record, Item_Record> ITEM_IMAGE___ITEM_IMAGE_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.ITEM__PKEY, ItemImage_.ITEM_IMAGE_, "item_image___item_image_master_", ItemImage_.ITEM_IMAGE_._ITEM_ID_);
        public static final ForeignKey<Material_Record, Course_Record> MATERIAL___MATERIAL_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.COURSE__PKEY, Material_.MATERIAL_, "material___material_master_", Material_.MATERIAL_._COURSE_ID_);
        public static final ForeignKey<Material_Record, Item_Record> MATERIAL___MATERIAL_ITEM_ = createForeignKey(es.eci.catalog.model.Keys.ITEM__PKEY, Material_.MATERIAL_, "material___material_item_", Material_.MATERIAL_.ITEM_);
        public static final ForeignKey<SecurityAccessPrivilege_Record, SecurityRole_Record> SECURITY_ACCESS_PRIVILEGE___SECURITY_ACCESS_PRIVILEGE_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.SECURITY_ROLE__PKEY, SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_, "security_access_privilege___security_access_privilege_master_", SecurityAccessPrivilege_.SECURITY_ACCESS_PRIVILEGE_._SECURITY_ROLE_ID_);
        public static final ForeignKey<SecurityAttribute_Record, SecurityEntity_Record> SECURITY_ATTRIBUTE___SECURITY_ATTRIBUTE_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.SECURITY_ENTITY__PKEY, SecurityAttribute_.SECURITY_ATTRIBUTE_, "security_attribute___security_attribute_master_", SecurityAttribute_.SECURITY_ATTRIBUTE_._SECURITY_ENTITY_ID_);
        public static final ForeignKey<SecurityRowLevelPolicy_Record, SecurityRole_Record> SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_MASTER_ = createForeignKey(es.eci.catalog.model.Keys.SECURITY_ROLE__PKEY, SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_, "security_row_level_policy___security_row_level_policy_master_", SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_._SECURITY_ROLE_ID_);
        public static final ForeignKey<SecurityRowLevelPolicy_Record, SecurityEntity_Record> SECURITY_ROW_LEVEL_POLICY___SECURITY_ROW_LEVEL_POLICY_ENTITY_ = createForeignKey(es.eci.catalog.model.Keys.SECURITY_ENTITY__PKEY, SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_, "security_row_level_policy___security_row_level_policy_entity_", SecurityRowLevelPolicy_.SECURITY_ROW_LEVEL_POLICY_.ENTITY_);
    }
}
