// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

/**
 * Protobuf type {@code resource.PageInfo}
 */
public  final class PageInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:resource.PageInfo)
    PageInfoOrBuilder {
  // Use PageInfo.newBuilder() to construct.
  private PageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PageInfo() {
    total_ = 0;
    pages_ = 0;
    size_ = 0;
    page_ = 0;
    hasNext_ = false;
    hasPrev_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PageInfo(
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

            total_ = input.readInt32();
            break;
          }
          case 16: {

            pages_ = input.readInt32();
            break;
          }
          case 24: {

            size_ = input.readInt32();
            break;
          }
          case 32: {

            page_ = input.readInt32();
            break;
          }
          case 40: {

            hasNext_ = input.readBool();
            break;
          }
          case 48: {

            hasPrev_ = input.readBool();
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
    return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_PageInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_PageInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn.ymatou.ops.resource.PageInfo.class, cn.ymatou.ops.resource.PageInfo.Builder.class);
  }

  public static final int TOTAL_FIELD_NUMBER = 1;
  private int total_;
  /**
   * <code>optional int32 total = 1;</code>
   */
  public int getTotal() {
    return total_;
  }

  public static final int PAGES_FIELD_NUMBER = 2;
  private int pages_;
  /**
   * <code>optional int32 pages = 2;</code>
   */
  public int getPages() {
    return pages_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_;
  /**
   * <code>optional int32 size = 3;</code>
   */
  public int getSize() {
    return size_;
  }

  public static final int PAGE_FIELD_NUMBER = 4;
  private int page_;
  /**
   * <code>optional int32 page = 4;</code>
   */
  public int getPage() {
    return page_;
  }

  public static final int HAS_NEXT_FIELD_NUMBER = 5;
  private boolean hasNext_;
  /**
   * <code>optional bool has_next = 5;</code>
   */
  public boolean getHasNext() {
    return hasNext_;
  }

  public static final int HAS_PREV_FIELD_NUMBER = 6;
  private boolean hasPrev_;
  /**
   * <code>optional bool has_prev = 6;</code>
   */
  public boolean getHasPrev() {
    return hasPrev_;
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
    if (total_ != 0) {
      output.writeInt32(1, total_);
    }
    if (pages_ != 0) {
      output.writeInt32(2, pages_);
    }
    if (size_ != 0) {
      output.writeInt32(3, size_);
    }
    if (page_ != 0) {
      output.writeInt32(4, page_);
    }
    if (hasNext_ != false) {
      output.writeBool(5, hasNext_);
    }
    if (hasPrev_ != false) {
      output.writeBool(6, hasPrev_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (total_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, total_);
    }
    if (pages_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pages_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, size_);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, page_);
    }
    if (hasNext_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hasNext_);
    }
    if (hasPrev_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, hasPrev_);
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
    if (!(obj instanceof cn.ymatou.ops.resource.PageInfo)) {
      return super.equals(obj);
    }
    cn.ymatou.ops.resource.PageInfo other = (cn.ymatou.ops.resource.PageInfo) obj;

    boolean result = true;
    result = result && (getTotal()
        == other.getTotal());
    result = result && (getPages()
        == other.getPages());
    result = result && (getSize()
        == other.getSize());
    result = result && (getPage()
        == other.getPage());
    result = result && (getHasNext()
        == other.getHasNext());
    result = result && (getHasPrev()
        == other.getHasPrev());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + getTotal();
    hash = (37 * hash) + PAGES_FIELD_NUMBER;
    hash = (53 * hash) + getPages();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + HAS_NEXT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasNext());
    hash = (37 * hash) + HAS_PREV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasPrev());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn.ymatou.ops.resource.PageInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.PageInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.PageInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn.ymatou.ops.resource.PageInfo parseFrom(
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
  public static Builder newBuilder(cn.ymatou.ops.resource.PageInfo prototype) {
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
   * Protobuf type {@code resource.PageInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:resource.PageInfo)
      cn.ymatou.ops.resource.PageInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_PageInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_PageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.ymatou.ops.resource.PageInfo.class, cn.ymatou.ops.resource.PageInfo.Builder.class);
    }

    // Construct using cn.ymatou.ops.resource.PageInfo.newBuilder()
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
      total_ = 0;

      pages_ = 0;

      size_ = 0;

      page_ = 0;

      hasNext_ = false;

      hasPrev_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn.ymatou.ops.resource.ResourceProto.internal_static_resource_PageInfo_descriptor;
    }

    public cn.ymatou.ops.resource.PageInfo getDefaultInstanceForType() {
      return cn.ymatou.ops.resource.PageInfo.getDefaultInstance();
    }

    public cn.ymatou.ops.resource.PageInfo build() {
      cn.ymatou.ops.resource.PageInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public cn.ymatou.ops.resource.PageInfo buildPartial() {
      cn.ymatou.ops.resource.PageInfo result = new cn.ymatou.ops.resource.PageInfo(this);
      result.total_ = total_;
      result.pages_ = pages_;
      result.size_ = size_;
      result.page_ = page_;
      result.hasNext_ = hasNext_;
      result.hasPrev_ = hasPrev_;
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
      if (other instanceof cn.ymatou.ops.resource.PageInfo) {
        return mergeFrom((cn.ymatou.ops.resource.PageInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn.ymatou.ops.resource.PageInfo other) {
      if (other == cn.ymatou.ops.resource.PageInfo.getDefaultInstance()) return this;
      if (other.getTotal() != 0) {
        setTotal(other.getTotal());
      }
      if (other.getPages() != 0) {
        setPages(other.getPages());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getHasNext() != false) {
        setHasNext(other.getHasNext());
      }
      if (other.getHasPrev() != false) {
        setHasPrev(other.getHasPrev());
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
      cn.ymatou.ops.resource.PageInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn.ymatou.ops.resource.PageInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int total_ ;
    /**
     * <code>optional int32 total = 1;</code>
     */
    public int getTotal() {
      return total_;
    }
    /**
     * <code>optional int32 total = 1;</code>
     */
    public Builder setTotal(int value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 total = 1;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0;
      onChanged();
      return this;
    }

    private int pages_ ;
    /**
     * <code>optional int32 pages = 2;</code>
     */
    public int getPages() {
      return pages_;
    }
    /**
     * <code>optional int32 pages = 2;</code>
     */
    public Builder setPages(int value) {
      
      pages_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 pages = 2;</code>
     */
    public Builder clearPages() {
      
      pages_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>optional int32 size = 3;</code>
     */
    public int getSize() {
      return size_;
    }
    /**
     * <code>optional int32 size = 3;</code>
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 size = 3;</code>
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private int page_ ;
    /**
     * <code>optional int32 page = 4;</code>
     */
    public int getPage() {
      return page_;
    }
    /**
     * <code>optional int32 page = 4;</code>
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 page = 4;</code>
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private boolean hasNext_ ;
    /**
     * <code>optional bool has_next = 5;</code>
     */
    public boolean getHasNext() {
      return hasNext_;
    }
    /**
     * <code>optional bool has_next = 5;</code>
     */
    public Builder setHasNext(boolean value) {
      
      hasNext_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool has_next = 5;</code>
     */
    public Builder clearHasNext() {
      
      hasNext_ = false;
      onChanged();
      return this;
    }

    private boolean hasPrev_ ;
    /**
     * <code>optional bool has_prev = 6;</code>
     */
    public boolean getHasPrev() {
      return hasPrev_;
    }
    /**
     * <code>optional bool has_prev = 6;</code>
     */
    public Builder setHasPrev(boolean value) {
      
      hasPrev_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool has_prev = 6;</code>
     */
    public Builder clearHasPrev() {
      
      hasPrev_ = false;
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


    // @@protoc_insertion_point(builder_scope:resource.PageInfo)
  }

  // @@protoc_insertion_point(class_scope:resource.PageInfo)
  private static final cn.ymatou.ops.resource.PageInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn.ymatou.ops.resource.PageInfo();
  }

  public static cn.ymatou.ops.resource.PageInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PageInfo>
      PARSER = new com.google.protobuf.AbstractParser<PageInfo>() {
    public PageInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PageInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PageInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PageInfo> getParserForType() {
    return PARSER;
  }

  public cn.ymatou.ops.resource.PageInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

