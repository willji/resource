// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

public interface HistoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:resource.History)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional int64 resource_id = 2;</code>
   */
  long getResourceId();

  /**
   * <code>optional int64 field_id = 3;</code>
   */
  long getFieldId();

  /**
   * <code>optional string value = 4;</code>
   */
  java.lang.String getValue();
  /**
   * <code>optional string value = 4;</code>
   */
  com.google.protobuf.ByteString
      getValueBytes();

  /**
   * <code>optional string created_user = 5;</code>
   */
  java.lang.String getCreatedUser();
  /**
   * <code>optional string created_user = 5;</code>
   */
  com.google.protobuf.ByteString
      getCreatedUserBytes();

  /**
   * <code>optional string modified_user = 6;</code>
   */
  java.lang.String getModifiedUser();
  /**
   * <code>optional string modified_user = 6;</code>
   */
  com.google.protobuf.ByteString
      getModifiedUserBytes();

  /**
   * <code>optional string resource = 7;</code>
   */
  java.lang.String getResource();
  /**
   * <code>optional string resource = 7;</code>
   */
  com.google.protobuf.ByteString
      getResourceBytes();

  /**
   * <code>optional string field = 8;</code>
   */
  java.lang.String getField();
  /**
   * <code>optional string field = 8;</code>
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <code>optional int32 page = 9;</code>
   */
  int getPage();

  /**
   * <code>optional int32 size = 10;</code>
   */
  int getSize();
}