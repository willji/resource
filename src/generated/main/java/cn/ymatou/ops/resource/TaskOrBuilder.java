// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

public interface TaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:resource.Task)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .resource.Task.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .resource.Task.Status status = 2;</code>
   */
  cn.ymatou.ops.resource.Task.Status getStatus();

  /**
   * <code>optional string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <code>optional string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>optional int64 type_id = 4;</code>
   */
  long getTypeId();

  /**
   * <code>optional string message = 5;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 5;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional string created_user = 6;</code>
   */
  java.lang.String getCreatedUser();
  /**
   * <code>optional string created_user = 6;</code>
   */
  com.google.protobuf.ByteString
      getCreatedUserBytes();

  /**
   * <code>optional string modified_user = 7;</code>
   */
  java.lang.String getModifiedUser();
  /**
   * <code>optional string modified_user = 7;</code>
   */
  com.google.protobuf.ByteString
      getModifiedUserBytes();

  /**
   * <code>optional string type = 8;</code>
   */
  java.lang.String getType();
  /**
   * <code>optional string type = 8;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}