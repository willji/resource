// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resource.proto

package cn.ymatou.ops.resource;

public final class ResourceProto {
  private ResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Type_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Type_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Task_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Resource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Resource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_Reference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_Reference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_History_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_History_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_PageInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_PageInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_SearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_PagedResourceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_PagedResourceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resource_PagedHistoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resource_PagedHistoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016resource.proto\022\010resource\032\034google/api/a" +
      "nnotations.proto\032\033google/protobuf/empty." +
      "proto\032\031validator/validator.proto\"\217\001\n\004Typ" +
      "e\022\024\n\004name\030\001 \001(\tB\006\212\265\030\002\010\001\022\023\n\013description\030\002" +
      " \001(\t\022\016\n\006locked\030\003 \001(\010\022\024\n\014created_user\030\004 \001" +
      "(\t\022\025\n\rmodified_user\030\005 \001(\t\022\037\n\006fields\030\006 \003(" +
      "\0132\017.resource.Field\"\376\002\n\005Field\022\n\n\002id\030\001 \001(\003" +
      "\022\017\n\007type_id\030\002 \001(\003\022\024\n\004name\030\003 \001(\tB\006\212\265\030\002\010\001\022" +
      "\017\n\007display\030\004 \001(\t\022\022\n\nfield_type\030\005 \001(\t\022\025\n\r" +
      "default_value\030\006 \001(\t\022\023\n\013is_required\030\007 \001(\010",
      "\022\020\n\010is_multi\030\010 \001(\010\022\021\n\tis_unique\030\t \001(\010\022\024\n" +
      "\014created_user\030\n \001(\t\022\025\n\rmodified_user\030\013 \001" +
      "(\t\022\014\n\004type\030\014 \001(\t\022\026\n\016reference_type\030\r \001(\t" +
      "\022\027\n\017reference_field\030\016 \001(\t\022\034\n\024constraint_" +
      "condition\030\017 \001(\t\"B\n\nField_Type\022\007\n\003INT\020\000\022\t" +
      "\n\005FLOAT\020\001\022\n\n\006STRING\020\002\022\014\n\010DATETIME\020\003\022\006\n\002I" +
      "P\020\004\"\306\001\n\004Task\022\n\n\002id\030\001 \001(\003\022%\n\006status\030\002 \001(\016" +
      "2\025.resource.Task.Status\022\017\n\007content\030\003 \001(\t" +
      "\022\017\n\007type_id\030\004 \001(\003\022\017\n\007message\030\005 \001(\t\022\024\n\014cr" +
      "eated_user\030\006 \001(\t\022\025\n\rmodified_user\030\007 \001(\t\022",
      "\014\n\004type\030\010 \001(\t\"\035\n\006Status\022\005\n\001R\020\000\022\005\n\001S\020\001\022\005\n" +
      "\001F\020\002\"\321\001\n\010Resource\022\014\n\004uuid\030\001 \001(\t\022\024\n\004name\030" +
      "\002 \001(\tB\006\212\265\030\002\010\001\022\025\n\rtype_model_id\030\003 \001(\003\022\017\n\007" +
      "indexed\030\004 \001(\010\022\017\n\007deleted\030\005 \001(\010\022\014\n\004refs\030\006" +
      " \001(\005\022\024\n\014created_user\030\007 \001(\t\022\025\n\rmodified_u" +
      "ser\030\010 \001(\t\022\037\n\006values\030\t \003(\0132\017.resource.Val" +
      "ue\022\014\n\004type\030\n \001(\t\"\234\001\n\005Value\022\n\n\002id\030\001 \001(\003\022$" +
      "\n\010resource\030\002 \001(\0132\022.resource.Resource\022\026\n\016" +
      "field_model_id\030\003 \001(\003\022\r\n\005value\030\004 \001(\t\022\024\n\014c" +
      "reated_user\030\005 \001(\t\022\025\n\rmodified_user\030\006 \001(\t",
      "\022\r\n\005filed\030\007 \001(\t\"\242\002\n\tReference\022\n\n\002id\030\001 \001(" +
      "\003\022\027\n\017source_field_id\030\002 \001(\003\022\027\n\017target_fie" +
      "ld_id\030\003 \001(\003\022F\n\024constraint_condition\030\004 \001(" +
      "\0162(.resource.Reference.Constraint_Condit" +
      "ion\022\024\n\014created_user\030\005 \001(\t\022\025\n\rmodified_us" +
      "er\030\006 \001(\t\"b\n\024Constraint_Condition\022\014\n\010onet" +
      "oone\020\000\022\021\n\ronetomultiple\020\001\022\021\n\rmultipletoo" +
      "ne\020\002\022\026\n\022multipletomultiple\020\003\"\265\001\n\007History" +
      "\022\n\n\002id\030\001 \001(\003\022\023\n\013resource_id\030\002 \001(\003\022\020\n\010fie" +
      "ld_id\030\003 \001(\003\022\r\n\005value\030\004 \001(\t\022\024\n\014created_us",
      "er\030\005 \001(\t\022\025\n\rmodified_user\030\006 \001(\t\022\020\n\010resou" +
      "rce\030\007 \001(\t\022\r\n\005field\030\010 \001(\t\022\014\n\004page\030\t \001(\005\022\014" +
      "\n\004size\030\n \001(\005\"h\n\010PageInfo\022\r\n\005total\030\001 \001(\005\022" +
      "\r\n\005pages\030\002 \001(\005\022\014\n\004size\030\003 \001(\005\022\014\n\004page\030\004 \001" +
      "(\005\022\020\n\010has_next\030\005 \001(\010\022\020\n\010has_prev\030\006 \001(\010\":" +
      "\n\rSearchRequest\022\r\n\005query\030\001 \001(\t\022\014\n\004page\030\002" +
      " \001(\005\022\014\n\004size\030\003 \001(\005\"d\n\025PagedResourceRespo" +
      "nse\022%\n\tpage_info\030\001 \001(\0132\022.resource.PageIn" +
      "fo\022$\n\010resource\030\002 \003(\0132\022.resource.Resource" +
      "\"a\n\024PagedHistoryResponse\022%\n\tpage_info\030\001 ",
      "\001(\0132\022.resource.PageInfo\022\"\n\007history\030\002 \003(\013" +
      "2\021.resource.History2\263\t\n\017ResourceManager\022" +
      "J\n\nCreateType\022\016.resource.Type\032\016.resource" +
      ".Type\"\034\202\323\344\223\002\026\"\021/resource/v1/type:\001*\022N\n\nD" +
      "eleteType\022\016.resource.Type\032\016.resource.Typ" +
      "e\" \202\323\344\223\002\032*\030/resource/v1/type/{name}\022J\n\nU" +
      "pdateType\022\016.resource.Type\032\016.resource.Typ" +
      "e\"\034\202\323\344\223\002\026\032\021/resource/v1/type:\001*\022G\n\nSearc" +
      "hType\022\016.resource.Type\032\016.resource.Type\"\031\202" +
      "\323\344\223\002\023\022\021/resource/v1/type\022N\n\013CreateField\022",
      "\017.resource.Field\032\017.resource.Field\"\035\202\323\344\223\002" +
      "\027\"\022/resource/v1/field:\001*\022P\n\013DeleteField\022" +
      "\017.resource.Field\032\017.resource.Field\"\037\202\323\344\223\002" +
      "\031*\027/resource/v1/field/{id}\022M\n\013UpdateFiel" +
      "d\022\017.resource.Field\032\016.resource.Task\"\035\202\323\344\223" +
      "\002\027\032\022/resource/v1/field:\001*\022P\n\013DeleteValue" +
      "\022\017.resource.Field\032\017.resource.Field\"\037\202\323\344\223" +
      "\002\031*\027/resource/v1/value/{id}\022G\n\nSearchTas" +
      "k\022\016.resource.Task\032\016.resource.Task\"\031\202\323\344\223\002" +
      "\023\022\021/resource/v1/task\022Z\n\016CreateResource\022\022",
      ".resource.Resource\032\022.resource.Resource\" " +
      "\202\323\344\223\002\032\"\025/resource/v1/resource:\001*\022^\n\016Dele" +
      "teResource\022\022.resource.Resource\032\022.resourc" +
      "e.Resource\"$\202\323\344\223\002\036*\034/resource/v1/resourc" +
      "e/{uuid}\022Z\n\016UpdateResource\022\022.resource.Re" +
      "source\032\022.resource.Resource\" \202\323\344\223\002\032\032\025/res" +
      "ource/v1/resource:\001*\022i\n\016SearchResource\022\027" +
      ".resource.SearchRequest\032\037.resource.Paged" +
      "ResourceResponse\"\035\202\323\344\223\002\027\022\025/resource/v1/r" +
      "esource\022`\n\rSearchHistory\022\021.resource.Hist",
      "ory\032\036.resource.PagedHistoryResponse\"\034\202\323\344" +
      "\223\002\026\022\024/resource/v1/historyB)\n\026cn.ymatou.o" +
      "ps.resourceB\rResourceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.ymatou.op.validator.proto.ValidatorProto.getDescriptor(),
        }, assigner);
    internal_static_resource_Type_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_resource_Type_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Type_descriptor,
        new java.lang.String[] { "Name", "Description", "Locked", "CreatedUser", "ModifiedUser", "Fields", });
    internal_static_resource_Field_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_resource_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Field_descriptor,
        new java.lang.String[] { "Id", "TypeId", "Name", "Display", "FieldType", "DefaultValue", "IsRequired", "IsMulti", "IsUnique", "CreatedUser", "ModifiedUser", "Type", "ReferenceType", "ReferenceField", "ConstraintCondition", });
    internal_static_resource_Task_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_resource_Task_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Task_descriptor,
        new java.lang.String[] { "Id", "Status", "Content", "TypeId", "Message", "CreatedUser", "ModifiedUser", "Type", });
    internal_static_resource_Resource_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_resource_Resource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Resource_descriptor,
        new java.lang.String[] { "Uuid", "Name", "TypeModelId", "Indexed", "Deleted", "Refs", "CreatedUser", "ModifiedUser", "Values", "Type", });
    internal_static_resource_Value_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_resource_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Value_descriptor,
        new java.lang.String[] { "Id", "Resource", "FieldModelId", "Value", "CreatedUser", "ModifiedUser", "Filed", });
    internal_static_resource_Reference_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_resource_Reference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_Reference_descriptor,
        new java.lang.String[] { "Id", "SourceFieldId", "TargetFieldId", "ConstraintCondition", "CreatedUser", "ModifiedUser", });
    internal_static_resource_History_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_resource_History_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_History_descriptor,
        new java.lang.String[] { "Id", "ResourceId", "FieldId", "Value", "CreatedUser", "ModifiedUser", "Resource", "Field", "Page", "Size", });
    internal_static_resource_PageInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_resource_PageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_PageInfo_descriptor,
        new java.lang.String[] { "Total", "Pages", "Size", "Page", "HasNext", "HasPrev", });
    internal_static_resource_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_resource_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_SearchRequest_descriptor,
        new java.lang.String[] { "Query", "Page", "Size", });
    internal_static_resource_PagedResourceResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_resource_PagedResourceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_PagedResourceResponse_descriptor,
        new java.lang.String[] { "PageInfo", "Resource", });
    internal_static_resource_PagedHistoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_resource_PagedHistoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resource_PagedHistoryResponse_descriptor,
        new java.lang.String[] { "PageInfo", "History", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.ymatou.op.validator.proto.ValidatorProto.string);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.ymatou.op.validator.proto.ValidatorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}