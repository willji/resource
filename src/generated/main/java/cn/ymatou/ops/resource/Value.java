// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

/**
 * Protobuf type {@code resource.Value}
 */
public  final class Value extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:resource.Value)
    ValueOrBuilder {
  // Use Value.newBuilder() to construct.
  private Value(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Value() {
    id_ = 0L;
    fieldModelId_ = 0L;
    value_ = "";
    createdUser_ = "";
    modifiedUser_ = "";
    filed_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Value(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            cn.ymatou.ops.resource.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(cn.ymatou.ops.resource.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            fieldModelId_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            createdUser_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            modifiedUser_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            filed_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_Value_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.ymatou.ops.resource.Value.class, cn.ymatou.ops.resource.Value.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  private cn.ymatou.ops.resource.Resource resource_;
  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  public cn.ymatou.ops.resource.Resource getResource() {
    return resource_ == null ? cn.ymatou.ops.resource.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>optional .resource.Resource resource = 2;</code>
   */
  public cn.ymatou.ops.resource.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
  }

  public static final int FIELD_MODEL_ID_FIELD_NUMBER = 3;
  private long fieldModelId_;
  /**
   * <code>optional int64 field_model_id = 3;</code>
   */
  public long getFieldModelId() {
    return fieldModelId_;
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private volatile java.lang.Object value_;
  /**
   * <code>optional string value = 4;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>optional string value = 4;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_USER_FIELD_NUMBER = 5;
  private volatile java.lang.Object createdUser_;
  /**
   * <code>optional string created_user = 5;</code>
   */
  public java.lang.String getCreatedUser() {
    java.lang.Object ref = createdUser_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdUser_ = s;
      return s;
    }
  }
  /**
   * <code>optional string created_user = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedUserBytes() {
    java.lang.Object ref = createdUser_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdUser_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODIFIED_USER_FIELD_NUMBER = 6;
  private volatile java.lang.Object modifiedUser_;
  /**
   * <code>optional string modified_user = 6;</code>
   */
  public java.lang.String getModifiedUser() {
    java.lang.Object ref = modifiedUser_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      modifiedUser_ = s;
      return s;
    }
  }
  /**
   * <code>optional string modified_user = 6;</code>
   */
  public com.google.protobuf.ByteString
      getModifiedUserBytes() {
    java.lang.Object ref = modifiedUser_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      modifiedUser_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILED_FIELD_NUMBER = 7;
  private volatile java.lang.Object filed_;
  /**
   * <code>optional string filed = 7;</code>
   */
  public java.lang.String getFiled() {
    java.lang.Object ref = filed_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filed_ = s;
      return s;
    }
  }
  /**
   * <code>optional string filed = 7;</code>
   */
  public com.google.protobuf.ByteString
      getFiledBytes() {
    java.lang.Object ref = filed_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filed_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (resource_ != null) {
      output.writeMessage(2, getResource());
    }
    if (fieldModelId_ != 0L) {
      output.writeInt64(3, fieldModelId_);
    }
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, value_);
    }
    if (!getCreatedUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, createdUser_);
    }
    if (!getModifiedUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, modifiedUser_);
    }
    if (!getFiledBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, filed_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResource());
    }
    if (fieldModelId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, fieldModelId_);
    }
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, value_);
    }
    if (!getCreatedUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, createdUser_);
    }
    if (!getModifiedUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, modifiedUser_);
    }
    if (!getFiledBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, filed_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cn.ymatou.ops.resource.Value)) {
      return super.equals(obj);
    }
    cn.ymatou.ops.resource.Value other = (cn.ymatou.ops.resource.Value) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && (getFieldModelId()
        == other.getFieldModelId());
    result = result && getValue()
        .equals(other.getValue());
    result = result && getCreatedUser()
        .equals(other.getCreatedUser());
    result = result && getModifiedUser()
        .equals(other.getModifiedUser());
    result = result && getFiled()
        .equals(other.getFiled());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (37 * hash) + FIELD_MODEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFieldModelId());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + CREATED_USER_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedUser().hashCode();
    hash = (37 * hash) + MODIFIED_USER_FIELD_NUMBER;
    hash = (53 * hash) + getModifiedUser().hashCode();
    hash = (37 * hash) + FILED_FIELD_NUMBER;
    hash = (53 * hash) + getFiled().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.ymatou.ops.resource.Value parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.Value parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.Value parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cn.ymatou.ops.resource.Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code resource.Value}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:resource.Value)
      cn.ymatou.ops.resource.ValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_Value_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.ymatou.ops.resource.Value.class, cn.ymatou.ops.resource.Value.Builder.class);
    }

    // Construct using cn.ymatou.ops.resource.Value.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      fieldModelId_ = 0L;

      value_ = "";

      createdUser_ = "";

      modifiedUser_ = "";

      filed_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_Value_descriptor;
    }

    public cn.ymatou.ops.resource.Value getDefaultInstanceForType() {
      return cn.ymatou.ops.resource.Value.getDefaultInstance();
    }

    public cn.ymatou.ops.resource.Value build() {
      cn.ymatou.ops.resource.Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.ymatou.ops.resource.Value buildPartial() {
      cn.ymatou.ops.resource.Value result = new cn.ymatou.ops.resource.Value(this);
      result.id_ = id_;
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.fieldModelId_ = fieldModelId_;
      result.value_ = value_;
      result.createdUser_ = createdUser_;
      result.modifiedUser_ = modifiedUser_;
      result.filed_ = filed_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cn.ymatou.ops.resource.Value) {
        return mergeFrom((cn.ymatou.ops.resource.Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.ymatou.ops.resource.Value other) {
      if (other == cn.ymatou.ops.resource.Value.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (other.getFieldModelId() != 0L) {
        setFieldModelId(other.getFieldModelId());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (!other.getCreatedUser().isEmpty()) {
        createdUser_ = other.createdUser_;
        onChanged();
      }
      if (!other.getModifiedUser().isEmpty()) {
        modifiedUser_ = other.modifiedUser_;
        onChanged();
      }
      if (!other.getFiled().isEmpty()) {
        filed_ = other.filed_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cn.ymatou.ops.resource.Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.ymatou.ops.resource.Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>optional int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private cn.ymatou.ops.resource.Resource resource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.ymatou.ops.resource.Resource, cn.ymatou.ops.resource.Resource.Builder, cn.ymatou.ops.resource.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public cn.ymatou.ops.resource.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? cn.ymatou.ops.resource.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public Builder setResource(cn.ymatou.ops.resource.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public Builder setResource(
        cn.ymatou.ops.resource.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public Builder mergeResource(cn.ymatou.ops.resource.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            cn.ymatou.ops.resource.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public cn.ymatou.ops.resource.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    public cn.ymatou.ops.resource.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            cn.ymatou.ops.resource.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>optional .resource.Resource resource = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cn.ymatou.ops.resource.Resource, cn.ymatou.ops.resource.Resource.Builder, cn.ymatou.ops.resource.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cn.ymatou.ops.resource.Resource, cn.ymatou.ops.resource.Resource.Builder, cn.ymatou.ops.resource.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private long fieldModelId_ ;
    /**
     * <code>optional int64 field_model_id = 3;</code>
     */
    public long getFieldModelId() {
      return fieldModelId_;
    }
    /**
     * <code>optional int64 field_model_id = 3;</code>
     */
    public Builder setFieldModelId(long value) {
      
      fieldModelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 field_model_id = 3;</code>
     */
    public Builder clearFieldModelId() {
      
      fieldModelId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>optional string value = 4;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string value = 4;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string value = 4;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 4;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>optional string value = 4;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createdUser_ = "";
    /**
     * <code>optional string created_user = 5;</code>
     */
    public java.lang.String getCreatedUser() {
      java.lang.Object ref = createdUser_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdUser_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string created_user = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedUserBytes() {
      java.lang.Object ref = createdUser_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string created_user = 5;</code>
     */
    public Builder setCreatedUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string created_user = 5;</code>
     */
    public Builder clearCreatedUser() {
      
      createdUser_ = getDefaultInstance().getCreatedUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string created_user = 5;</code>
     */
    public Builder setCreatedUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdUser_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object modifiedUser_ = "";
    /**
     * <code>optional string modified_user = 6;</code>
     */
    public java.lang.String getModifiedUser() {
      java.lang.Object ref = modifiedUser_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        modifiedUser_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string modified_user = 6;</code>
     */
    public com.google.protobuf.ByteString
        getModifiedUserBytes() {
      java.lang.Object ref = modifiedUser_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        modifiedUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string modified_user = 6;</code>
     */
    public Builder setModifiedUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      modifiedUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string modified_user = 6;</code>
     */
    public Builder clearModifiedUser() {
      
      modifiedUser_ = getDefaultInstance().getModifiedUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string modified_user = 6;</code>
     */
    public Builder setModifiedUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      modifiedUser_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filed_ = "";
    /**
     * <code>optional string filed = 7;</code>
     */
    public java.lang.String getFiled() {
      java.lang.Object ref = filed_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filed_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string filed = 7;</code>
     */
    public com.google.protobuf.ByteString
        getFiledBytes() {
      java.lang.Object ref = filed_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filed_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string filed = 7;</code>
     */
    public Builder setFiled(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string filed = 7;</code>
     */
    public Builder clearFiled() {
      
      filed_ = getDefaultInstance().getFiled();
      onChanged();
      return this;
    }
    /**
     * <code>optional string filed = 7;</code>
     */
    public Builder setFiledBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filed_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:resource.Value)
  }

  // @@protoc_insertion_point(class_scope:resource.Value)
  private static final cn.ymatou.ops.resource.Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.ymatou.ops.resource.Value();
  }

  public static cn.ymatou.ops.resource.Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Value>
      PARSER = new com.google.protobuf.AbstractParser<Value>() {
    public Value parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Value(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Value> getParserForType() {
    return PARSER;
  }

  public cn.ymatou.ops.resource.Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
