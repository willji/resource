// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:resource.Field)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional int64 type_id = 2;</code>
   */
  long getTypeId();

  /**
   * <code>optional string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string display = 4;</code>
   */
  java.lang.String getDisplay();
  /**
   * <code>optional string display = 4;</code>
   */
  com.google.protobuf.ByteString
      getDisplayBytes();

  /**
   * <code>optional string field_type = 5;</code>
   */
  java.lang.String getFieldType();
  /**
   * <code>optional string field_type = 5;</code>
   */
  com.google.protobuf.ByteString
      getFieldTypeBytes();

  /**
   * <code>optional string default_value = 6;</code>
   */
  java.lang.String getDefaultValue();
  /**
   * <code>optional string default_value = 6;</code>
   */
  com.google.protobuf.ByteString
      getDefaultValueBytes();

  /**
   * <code>optional bool is_required = 7;</code>
   */
  boolean getIsRequired();

  /**
   * <code>optional bool is_multi = 8;</code>
   */
  boolean getIsMulti();

  /**
   * <code>optional bool is_unique = 9;</code>
   */
  boolean getIsUnique();

  /**
   * <code>optional string created_user = 10;</code>
   */
  java.lang.String getCreatedUser();
  /**
   * <code>optional string created_user = 10;</code>
   */
  com.google.protobuf.ByteString
      getCreatedUserBytes();

  /**
   * <code>optional string modified_user = 11;</code>
   */
  java.lang.String getModifiedUser();
  /**
   * <code>optional string modified_user = 11;</code>
   */
  com.google.protobuf.ByteString
      getModifiedUserBytes();

  /**
   * <code>optional string type = 12;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 12;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>optional string reference_type = 13;</code>
   */
  java.lang.String getReferenceType();
  /**
   * <code>optional string reference_type = 13;</code>
   */
  com.google.protobuf.ByteString
      getReferenceTypeBytes();

  /**
   * <code>optional string reference_field = 14;</code>
   */
  java.lang.String getReferenceField();
  /**
   * <code>optional string reference_field = 14;</code>
   */
  com.google.protobuf.ByteString
      getReferenceFieldBytes();

  /**
   * <code>optional string constraint_condition = 15;</code>
   */
  java.lang.String getConstraintCondition();
  /**
   * <code>optional string constraint_condition = 15;</code>
   */
  com.google.protobuf.ByteString
      getConstraintConditionBytes();
}