package com.proto.heating;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: heating/heater.proto")
public final class HeaterServiceGrpc {

  private HeaterServiceGrpc() {}

  public static final String SERVICE_NAME = "heating.HeaterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.heating.HeaterStatusRequest,
      com.proto.heating.HeaterStatusResponse> getShowStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowStatus",
      requestType = com.proto.heating.HeaterStatusRequest.class,
      responseType = com.proto.heating.HeaterStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heating.HeaterStatusRequest,
      com.proto.heating.HeaterStatusResponse> getShowStatusMethod() {
    io.grpc.MethodDescriptor<com.proto.heating.HeaterStatusRequest, com.proto.heating.HeaterStatusResponse> getShowStatusMethod;
    if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getShowStatusMethod = HeaterServiceGrpc.getShowStatusMethod) == null) {
          HeaterServiceGrpc.getShowStatusMethod = getShowStatusMethod = 
              io.grpc.MethodDescriptor.<com.proto.heating.HeaterStatusRequest, com.proto.heating.HeaterStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeaterService", "ShowStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("ShowStatus"))
                  .build();
          }
        }
     }
     return getShowStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToLowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTempToLow",
      requestType = com.proto.heating.HeaterToUpdateRequest.class,
      responseType = com.proto.heating.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToLowMethod() {
    io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse> getSetTempToLowMethod;
    if ((getSetTempToLowMethod = HeaterServiceGrpc.getSetTempToLowMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempToLowMethod = HeaterServiceGrpc.getSetTempToLowMethod) == null) {
          HeaterServiceGrpc.getSetTempToLowMethod = getSetTempToLowMethod = 
              io.grpc.MethodDescriptor.<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeaterService", "SetTempToLow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("SetTempToLow"))
                  .build();
          }
        }
     }
     return getSetTempToLowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToMediumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTempToMedium",
      requestType = com.proto.heating.HeaterToUpdateRequest.class,
      responseType = com.proto.heating.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToMediumMethod() {
    io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse> getSetTempToMediumMethod;
    if ((getSetTempToMediumMethod = HeaterServiceGrpc.getSetTempToMediumMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempToMediumMethod = HeaterServiceGrpc.getSetTempToMediumMethod) == null) {
          HeaterServiceGrpc.getSetTempToMediumMethod = getSetTempToMediumMethod = 
              io.grpc.MethodDescriptor.<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeaterService", "SetTempToMedium"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("SetTempToMedium"))
                  .build();
          }
        }
     }
     return getSetTempToMediumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToHighMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTempToHigh",
      requestType = com.proto.heating.HeaterToUpdateRequest.class,
      responseType = com.proto.heating.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetTempToHighMethod() {
    io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse> getSetTempToHighMethod;
    if ((getSetTempToHighMethod = HeaterServiceGrpc.getSetTempToHighMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetTempToHighMethod = HeaterServiceGrpc.getSetTempToHighMethod) == null) {
          HeaterServiceGrpc.getSetTempToHighMethod = getSetTempToHighMethod = 
              io.grpc.MethodDescriptor.<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeaterService", "SetTempToHigh"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("SetTempToHigh"))
                  .build();
          }
        }
     }
     return getSetTempToHighMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetToOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetToOff",
      requestType = com.proto.heating.HeaterToUpdateRequest.class,
      responseType = com.proto.heating.HeaterDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest,
      com.proto.heating.HeaterDetailResponse> getSetToOffMethod() {
    io.grpc.MethodDescriptor<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse> getSetToOffMethod;
    if ((getSetToOffMethod = HeaterServiceGrpc.getSetToOffMethod) == null) {
      synchronized (HeaterServiceGrpc.class) {
        if ((getSetToOffMethod = HeaterServiceGrpc.getSetToOffMethod) == null) {
          HeaterServiceGrpc.getSetToOffMethod = getSetToOffMethod = 
              io.grpc.MethodDescriptor.<com.proto.heating.HeaterToUpdateRequest, com.proto.heating.HeaterDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heating.HeaterService", "SetToOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterToUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.heating.HeaterDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeaterServiceMethodDescriptorSupplier("SetToOff"))
                  .build();
          }
        }
     }
     return getSetToOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeaterServiceStub newStub(io.grpc.Channel channel) {
    return new HeaterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeaterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeaterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeaterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeaterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HeaterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showStatus(com.proto.heating.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowStatusMethod(), responseObserver);
    }

    /**
     */
    public void setTempToLow(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempToLowMethod(), responseObserver);
    }

    /**
     */
    public void setTempToMedium(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempToMediumMethod(), responseObserver);
    }

    /**
     */
    public void setTempToHigh(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempToHighMethod(), responseObserver);
    }

    /**
     */
    public void setToOff(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetToOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.heating.HeaterStatusRequest,
                com.proto.heating.HeaterStatusResponse>(
                  this, METHODID_SHOW_STATUS)))
          .addMethod(
            getSetTempToLowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.heating.HeaterToUpdateRequest,
                com.proto.heating.HeaterDetailResponse>(
                  this, METHODID_SET_TEMP_TO_LOW)))
          .addMethod(
            getSetTempToMediumMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.heating.HeaterToUpdateRequest,
                com.proto.heating.HeaterDetailResponse>(
                  this, METHODID_SET_TEMP_TO_MEDIUM)))
          .addMethod(
            getSetTempToHighMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.heating.HeaterToUpdateRequest,
                com.proto.heating.HeaterDetailResponse>(
                  this, METHODID_SET_TEMP_TO_HIGH)))
          .addMethod(
            getSetToOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.heating.HeaterToUpdateRequest,
                com.proto.heating.HeaterDetailResponse>(
                  this, METHODID_SET_TO_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class HeaterServiceStub extends io.grpc.stub.AbstractStub<HeaterServiceStub> {
    private HeaterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceStub(channel, callOptions);
    }

    /**
     */
    public void showStatus(com.proto.heating.HeaterStatusRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempToLow(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempToLowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempToMedium(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempToMediumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTempToHigh(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempToHighMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setToOff(com.proto.heating.HeaterToUpdateRequest request,
        io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetToOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeaterServiceBlockingStub extends io.grpc.stub.AbstractStub<HeaterServiceBlockingStub> {
    private HeaterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.heating.HeaterStatusResponse showStatus(com.proto.heating.HeaterStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.heating.HeaterDetailResponse setTempToLow(com.proto.heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempToLowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.heating.HeaterDetailResponse setTempToMedium(com.proto.heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempToMediumMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.heating.HeaterDetailResponse setTempToHigh(com.proto.heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempToHighMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.heating.HeaterDetailResponse setToOff(com.proto.heating.HeaterToUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetToOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeaterServiceFutureStub extends io.grpc.stub.AbstractStub<HeaterServiceFutureStub> {
    private HeaterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeaterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeaterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeaterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heating.HeaterStatusResponse> showStatus(
        com.proto.heating.HeaterStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heating.HeaterDetailResponse> setTempToLow(
        com.proto.heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempToLowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heating.HeaterDetailResponse> setTempToMedium(
        com.proto.heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempToMediumMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heating.HeaterDetailResponse> setTempToHigh(
        com.proto.heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempToHighMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heating.HeaterDetailResponse> setToOff(
        com.proto.heating.HeaterToUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetToOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_STATUS = 0;
  private static final int METHODID_SET_TEMP_TO_LOW = 1;
  private static final int METHODID_SET_TEMP_TO_MEDIUM = 2;
  private static final int METHODID_SET_TEMP_TO_HIGH = 3;
  private static final int METHODID_SET_TO_OFF = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeaterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeaterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_STATUS:
          serviceImpl.showStatus((com.proto.heating.HeaterStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heating.HeaterStatusResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP_TO_LOW:
          serviceImpl.setTempToLow((com.proto.heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP_TO_MEDIUM:
          serviceImpl.setTempToMedium((com.proto.heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP_TO_HIGH:
          serviceImpl.setTempToHigh((com.proto.heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TO_OFF:
          serviceImpl.setToOff((com.proto.heating.HeaterToUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heating.HeaterDetailResponse>) responseObserver);
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

  private static abstract class HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeaterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.heating.HeaterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeaterService");
    }
  }

  private static final class HeaterServiceFileDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier {
    HeaterServiceFileDescriptorSupplier() {}
  }

  private static final class HeaterServiceMethodDescriptorSupplier
      extends HeaterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeaterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HeaterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeaterServiceFileDescriptorSupplier())
              .addMethod(getShowStatusMethod())
              .addMethod(getSetTempToLowMethod())
              .addMethod(getSetTempToMediumMethod())
              .addMethod(getSetTempToHighMethod())
              .addMethod(getSetToOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
