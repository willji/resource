package cn.ymatou.ops.resource;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: resource.proto")
public class ResourceManagerGrpc {

  private ResourceManagerGrpc() {}

  public static final String SERVICE_NAME = "resource.ResourceManager";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Type,
      cn.ymatou.ops.resource.Type> METHOD_CREATE_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "CreateType"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Type,
      cn.ymatou.ops.resource.Type> METHOD_DELETE_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "DeleteType"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Type,
      cn.ymatou.ops.resource.Type> METHOD_UPDATE_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "UpdateType"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Type,
      cn.ymatou.ops.resource.Type> METHOD_SEARCH_TYPE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "SearchType"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Type.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Field,
      cn.ymatou.ops.resource.Field> METHOD_CREATE_FIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "CreateField"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Field,
      cn.ymatou.ops.resource.Field> METHOD_DELETE_FIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "DeleteField"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Field,
      cn.ymatou.ops.resource.Task> METHOD_UPDATE_FIELD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "UpdateField"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Task.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Field,
      cn.ymatou.ops.resource.Field> METHOD_DELETE_VALUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "DeleteValue"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Field.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Task,
      cn.ymatou.ops.resource.Task> METHOD_SEARCH_TASK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "SearchTask"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Task.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Task.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Resource,
      cn.ymatou.ops.resource.Resource> METHOD_CREATE_RESOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "CreateResource"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Resource,
      cn.ymatou.ops.resource.Resource> METHOD_DELETE_RESOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "DeleteResource"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.Resource,
      cn.ymatou.ops.resource.Resource> METHOD_UPDATE_RESOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "UpdateResource"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.Resource.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.SearchRequest,
      cn.ymatou.ops.resource.PagedResourceResponse> METHOD_SEARCH_RESOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "SearchResource"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.SearchRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.PagedResourceResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<cn.ymatou.ops.resource.History,
      cn.ymatou.ops.resource.PagedHistoryResponse> METHOD_SEARCH_HISTORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "resource.ResourceManager", "SearchHistory"),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.History.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(cn.ymatou.ops.resource.PagedHistoryResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceManagerStub newStub(io.grpc.Channel channel) {
    return new ResourceManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ResourceManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ResourceManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class ResourceManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_TYPE, responseObserver);
    }

    /**
     */
    public void deleteType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_TYPE, responseObserver);
    }

    /**
     */
    public void updateType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_TYPE, responseObserver);
    }

    /**
     */
    public void searchType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_TYPE, responseObserver);
    }

    /**
     */
    public void createField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_FIELD, responseObserver);
    }

    /**
     */
    public void deleteField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_FIELD, responseObserver);
    }

    /**
     */
    public void updateField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_FIELD, responseObserver);
    }

    /**
     */
    public void deleteValue(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_VALUE, responseObserver);
    }

    /**
     */
    public void searchTask(cn.ymatou.ops.resource.Task request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_TASK, responseObserver);
    }

    /**
     */
    public void createResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_RESOURCE, responseObserver);
    }

    /**
     */
    public void deleteResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_RESOURCE, responseObserver);
    }

    /**
     */
    public void updateResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_RESOURCE, responseObserver);
    }

    /**
     */
    public void searchResource(cn.ymatou.ops.resource.SearchRequest request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedResourceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_RESOURCE, responseObserver);
    }

    /**
     */
    public void searchHistory(cn.ymatou.ops.resource.History request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_HISTORY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Type,
                cn.ymatou.ops.resource.Type>(
                  this, METHODID_CREATE_TYPE)))
          .addMethod(
            METHOD_DELETE_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Type,
                cn.ymatou.ops.resource.Type>(
                  this, METHODID_DELETE_TYPE)))
          .addMethod(
            METHOD_UPDATE_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Type,
                cn.ymatou.ops.resource.Type>(
                  this, METHODID_UPDATE_TYPE)))
          .addMethod(
            METHOD_SEARCH_TYPE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Type,
                cn.ymatou.ops.resource.Type>(
                  this, METHODID_SEARCH_TYPE)))
          .addMethod(
            METHOD_CREATE_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Field,
                cn.ymatou.ops.resource.Field>(
                  this, METHODID_CREATE_FIELD)))
          .addMethod(
            METHOD_DELETE_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Field,
                cn.ymatou.ops.resource.Field>(
                  this, METHODID_DELETE_FIELD)))
          .addMethod(
            METHOD_UPDATE_FIELD,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Field,
                cn.ymatou.ops.resource.Task>(
                  this, METHODID_UPDATE_FIELD)))
          .addMethod(
            METHOD_DELETE_VALUE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Field,
                cn.ymatou.ops.resource.Field>(
                  this, METHODID_DELETE_VALUE)))
          .addMethod(
            METHOD_SEARCH_TASK,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Task,
                cn.ymatou.ops.resource.Task>(
                  this, METHODID_SEARCH_TASK)))
          .addMethod(
            METHOD_CREATE_RESOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Resource,
                cn.ymatou.ops.resource.Resource>(
                  this, METHODID_CREATE_RESOURCE)))
          .addMethod(
            METHOD_DELETE_RESOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Resource,
                cn.ymatou.ops.resource.Resource>(
                  this, METHODID_DELETE_RESOURCE)))
          .addMethod(
            METHOD_UPDATE_RESOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.Resource,
                cn.ymatou.ops.resource.Resource>(
                  this, METHODID_UPDATE_RESOURCE)))
          .addMethod(
            METHOD_SEARCH_RESOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.SearchRequest,
                cn.ymatou.ops.resource.PagedResourceResponse>(
                  this, METHODID_SEARCH_RESOURCE)))
          .addMethod(
            METHOD_SEARCH_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                cn.ymatou.ops.resource.History,
                cn.ymatou.ops.resource.PagedHistoryResponse>(
                  this, METHODID_SEARCH_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceManagerStub extends io.grpc.stub.AbstractStub<ResourceManagerStub> {
    private ResourceManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceManagerStub(channel, callOptions);
    }

    /**
     */
    public void createType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchType(cn.ymatou.ops.resource.Type request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TYPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateField(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FIELD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteValue(cn.ymatou.ops.resource.Field request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_VALUE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchTask(cn.ymatou.ops.resource.Task request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TASK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResource(cn.ymatou.ops.resource.Resource request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchResource(cn.ymatou.ops.resource.SearchRequest request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedResourceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchHistory(cn.ymatou.ops.resource.History request,
        io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_HISTORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceManagerBlockingStub extends io.grpc.stub.AbstractStub<ResourceManagerBlockingStub> {
    private ResourceManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public cn.ymatou.ops.resource.Type createType(cn.ymatou.ops.resource.Type request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_TYPE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Type deleteType(cn.ymatou.ops.resource.Type request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_TYPE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Type updateType(cn.ymatou.ops.resource.Type request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_TYPE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Type searchType(cn.ymatou.ops.resource.Type request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_TYPE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Field createField(cn.ymatou.ops.resource.Field request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_FIELD, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Field deleteField(cn.ymatou.ops.resource.Field request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_FIELD, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Task updateField(cn.ymatou.ops.resource.Field request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_FIELD, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Field deleteValue(cn.ymatou.ops.resource.Field request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_VALUE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Task searchTask(cn.ymatou.ops.resource.Task request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_TASK, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Resource createResource(cn.ymatou.ops.resource.Resource request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_RESOURCE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Resource deleteResource(cn.ymatou.ops.resource.Resource request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_RESOURCE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.Resource updateResource(cn.ymatou.ops.resource.Resource request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_RESOURCE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.PagedResourceResponse searchResource(cn.ymatou.ops.resource.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_RESOURCE, getCallOptions(), request);
    }

    /**
     */
    public cn.ymatou.ops.resource.PagedHistoryResponse searchHistory(cn.ymatou.ops.resource.History request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_HISTORY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceManagerFutureStub extends io.grpc.stub.AbstractStub<ResourceManagerFutureStub> {
    private ResourceManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ResourceManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ResourceManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Type> createType(
        cn.ymatou.ops.resource.Type request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Type> deleteType(
        cn.ymatou.ops.resource.Type request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Type> updateType(
        cn.ymatou.ops.resource.Type request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Type> searchType(
        cn.ymatou.ops.resource.Type request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TYPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Field> createField(
        cn.ymatou.ops.resource.Field request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_FIELD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Field> deleteField(
        cn.ymatou.ops.resource.Field request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_FIELD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Task> updateField(
        cn.ymatou.ops.resource.Field request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_FIELD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Field> deleteValue(
        cn.ymatou.ops.resource.Field request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_VALUE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Task> searchTask(
        cn.ymatou.ops.resource.Task request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TASK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Resource> createResource(
        cn.ymatou.ops.resource.Resource request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_RESOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Resource> deleteResource(
        cn.ymatou.ops.resource.Resource request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_RESOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.Resource> updateResource(
        cn.ymatou.ops.resource.Resource request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_RESOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.PagedResourceResponse> searchResource(
        cn.ymatou.ops.resource.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_RESOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.ymatou.ops.resource.PagedHistoryResponse> searchHistory(
        cn.ymatou.ops.resource.History request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_HISTORY, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TYPE = 0;
  private static final int METHODID_DELETE_TYPE = 1;
  private static final int METHODID_UPDATE_TYPE = 2;
  private static final int METHODID_SEARCH_TYPE = 3;
  private static final int METHODID_CREATE_FIELD = 4;
  private static final int METHODID_DELETE_FIELD = 5;
  private static final int METHODID_UPDATE_FIELD = 6;
  private static final int METHODID_DELETE_VALUE = 7;
  private static final int METHODID_SEARCH_TASK = 8;
  private static final int METHODID_CREATE_RESOURCE = 9;
  private static final int METHODID_DELETE_RESOURCE = 10;
  private static final int METHODID_UPDATE_RESOURCE = 11;
  private static final int METHODID_SEARCH_RESOURCE = 12;
  private static final int METHODID_SEARCH_HISTORY = 13;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceManagerImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ResourceManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TYPE:
          serviceImpl.createType((cn.ymatou.ops.resource.Type) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type>) responseObserver);
          break;
        case METHODID_DELETE_TYPE:
          serviceImpl.deleteType((cn.ymatou.ops.resource.Type) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type>) responseObserver);
          break;
        case METHODID_UPDATE_TYPE:
          serviceImpl.updateType((cn.ymatou.ops.resource.Type) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type>) responseObserver);
          break;
        case METHODID_SEARCH_TYPE:
          serviceImpl.searchType((cn.ymatou.ops.resource.Type) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Type>) responseObserver);
          break;
        case METHODID_CREATE_FIELD:
          serviceImpl.createField((cn.ymatou.ops.resource.Field) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field>) responseObserver);
          break;
        case METHODID_DELETE_FIELD:
          serviceImpl.deleteField((cn.ymatou.ops.resource.Field) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field>) responseObserver);
          break;
        case METHODID_UPDATE_FIELD:
          serviceImpl.updateField((cn.ymatou.ops.resource.Field) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task>) responseObserver);
          break;
        case METHODID_DELETE_VALUE:
          serviceImpl.deleteValue((cn.ymatou.ops.resource.Field) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Field>) responseObserver);
          break;
        case METHODID_SEARCH_TASK:
          serviceImpl.searchTask((cn.ymatou.ops.resource.Task) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Task>) responseObserver);
          break;
        case METHODID_CREATE_RESOURCE:
          serviceImpl.createResource((cn.ymatou.ops.resource.Resource) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCE:
          serviceImpl.deleteResource((cn.ymatou.ops.resource.Resource) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource>) responseObserver);
          break;
        case METHODID_UPDATE_RESOURCE:
          serviceImpl.updateResource((cn.ymatou.ops.resource.Resource) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.Resource>) responseObserver);
          break;
        case METHODID_SEARCH_RESOURCE:
          serviceImpl.searchResource((cn.ymatou.ops.resource.SearchRequest) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedResourceResponse>) responseObserver);
          break;
        case METHODID_SEARCH_HISTORY:
          serviceImpl.searchHistory((cn.ymatou.ops.resource.History) request,
              (io.grpc.stub.StreamObserver<cn.ymatou.ops.resource.PagedHistoryResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_TYPE,
        METHOD_DELETE_TYPE,
        METHOD_UPDATE_TYPE,
        METHOD_SEARCH_TYPE,
        METHOD_CREATE_FIELD,
        METHOD_DELETE_FIELD,
        METHOD_UPDATE_FIELD,
        METHOD_DELETE_VALUE,
        METHOD_SEARCH_TASK,
        METHOD_CREATE_RESOURCE,
        METHOD_DELETE_RESOURCE,
        METHOD_UPDATE_RESOURCE,
        METHOD_SEARCH_RESOURCE,
        METHOD_SEARCH_HISTORY);
  }

}
