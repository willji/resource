// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:resource.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  boolean hasResource();
  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  cn.ymatou.ops.resource.Resource getResource();
  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  cn.ymatou.ops.resource.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <code>optional int64 field_model_id = 3;</code>
   */
  long getFieldModelId();

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
   * <code>optional string filed = 7;</code>
   */
  java.lang.String getFiled();
  /**
   * <code>optional string filed = 7;</code>
   */
  com.google.protobuf.ByteString
      getFiledBytes();
}
