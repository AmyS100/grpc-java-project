package com.proto.ac;

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
    comments = "Source: ac/ac.proto")
public final class AC_ServiceGrpc {

  private AC_ServiceGrpc() {}

  public static final String SERVICE_NAME = "ac.AC_Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest,
      com.proto.ac.ACDetailResponse> getShowCurrentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowCurrentDetails",
      requestType = com.proto.ac.GetByDeviceIdRequest.class,
      responseType = com.proto.ac.ACDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest,
      com.proto.ac.ACDetailResponse> getShowCurrentDetailsMethod() {
    io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest, com.proto.ac.ACDetailResponse> getShowCurrentDetailsMethod;
    if ((getShowCurrentDetailsMethod = AC_ServiceGrpc.getShowCurrentDetailsMethod) == null) {
      synchronized (AC_ServiceGrpc.class) {
        if ((getShowCurrentDetailsMethod = AC_ServiceGrpc.getShowCurrentDetailsMethod) == null) {
          AC_ServiceGrpc.getShowCurrentDetailsMethod = getShowCurrentDetailsMethod = 
              io.grpc.MethodDescriptor.<com.proto.ac.GetByDeviceIdRequest, com.proto.ac.ACDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ac.AC_Service", "ShowCurrentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.GetByDeviceIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.ACDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AC_ServiceMethodDescriptorSupplier("ShowCurrentDetails"))
                  .build();
          }
        }
     }
     return getShowCurrentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.ac.ACDeviceTempRequest,
      com.proto.ac.ACDetailResponse> getSetTempMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTemp",
      requestType = com.proto.ac.ACDeviceTempRequest.class,
      responseType = com.proto.ac.ACDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.ac.ACDeviceTempRequest,
      com.proto.ac.ACDetailResponse> getSetTempMethod() {
    io.grpc.MethodDescriptor<com.proto.ac.ACDeviceTempRequest, com.proto.ac.ACDetailResponse> getSetTempMethod;
    if ((getSetTempMethod = AC_ServiceGrpc.getSetTempMethod) == null) {
      synchronized (AC_ServiceGrpc.class) {
        if ((getSetTempMethod = AC_ServiceGrpc.getSetTempMethod) == null) {
          AC_ServiceGrpc.getSetTempMethod = getSetTempMethod = 
              io.grpc.MethodDescriptor.<com.proto.ac.ACDeviceTempRequest, com.proto.ac.ACDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ac.AC_Service", "SetTemp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.ACDeviceTempRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.ACDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AC_ServiceMethodDescriptorSupplier("SetTemp"))
                  .build();
          }
        }
     }
     return getSetTempMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest,
      com.proto.ac.ACDetailResponse> getSetToOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetToOff",
      requestType = com.proto.ac.GetByDeviceIdRequest.class,
      responseType = com.proto.ac.ACDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest,
      com.proto.ac.ACDetailResponse> getSetToOffMethod() {
    io.grpc.MethodDescriptor<com.proto.ac.GetByDeviceIdRequest, com.proto.ac.ACDetailResponse> getSetToOffMethod;
    if ((getSetToOffMethod = AC_ServiceGrpc.getSetToOffMethod) == null) {
      synchronized (AC_ServiceGrpc.class) {
        if ((getSetToOffMethod = AC_ServiceGrpc.getSetToOffMethod) == null) {
          AC_ServiceGrpc.getSetToOffMethod = getSetToOffMethod = 
              io.grpc.MethodDescriptor.<com.proto.ac.GetByDeviceIdRequest, com.proto.ac.ACDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ac.AC_Service", "SetToOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.GetByDeviceIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.ac.ACDetailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AC_ServiceMethodDescriptorSupplier("SetToOff"))
                  .build();
          }
        }
     }
     return getSetToOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AC_ServiceStub newStub(io.grpc.Channel channel) {
    return new AC_ServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AC_ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AC_ServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AC_ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AC_ServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AC_ServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void showCurrentDetails(com.proto.ac.GetByDeviceIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowCurrentDetailsMethod(), responseObserver);
    }

    /**
     */
    public void setTemp(com.proto.ac.ACDeviceTempRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetTempMethod(), responseObserver);
    }

    /**
     */
    public void setToOff(com.proto.ac.GetByDeviceIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetToOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getShowCurrentDetailsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.ac.GetByDeviceIdRequest,
                com.proto.ac.ACDetailResponse>(
                  this, METHODID_SHOW_CURRENT_DETAILS)))
          .addMethod(
            getSetTempMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.ac.ACDeviceTempRequest,
                com.proto.ac.ACDetailResponse>(
                  this, METHODID_SET_TEMP)))
          .addMethod(
            getSetToOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.ac.GetByDeviceIdRequest,
                com.proto.ac.ACDetailResponse>(
                  this, METHODID_SET_TO_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class AC_ServiceStub extends io.grpc.stub.AbstractStub<AC_ServiceStub> {
    private AC_ServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AC_ServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AC_ServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AC_ServiceStub(channel, callOptions);
    }

    /**
     */
    public void showCurrentDetails(com.proto.ac.GetByDeviceIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowCurrentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setTemp(com.proto.ac.ACDeviceTempRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setToOff(com.proto.ac.GetByDeviceIdRequest request,
        io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetToOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AC_ServiceBlockingStub extends io.grpc.stub.AbstractStub<AC_ServiceBlockingStub> {
    private AC_ServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AC_ServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AC_ServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AC_ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.ac.ACDetailResponse showCurrentDetails(com.proto.ac.GetByDeviceIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowCurrentDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.ac.ACDetailResponse setTemp(com.proto.ac.ACDeviceTempRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetTempMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.ac.ACDetailResponse setToOff(com.proto.ac.GetByDeviceIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetToOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AC_ServiceFutureStub extends io.grpc.stub.AbstractStub<AC_ServiceFutureStub> {
    private AC_ServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AC_ServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AC_ServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AC_ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.ac.ACDetailResponse> showCurrentDetails(
        com.proto.ac.GetByDeviceIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowCurrentDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.ac.ACDetailResponse> setTemp(
        com.proto.ac.ACDeviceTempRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetTempMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.ac.ACDetailResponse> setToOff(
        com.proto.ac.GetByDeviceIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetToOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_CURRENT_DETAILS = 0;
  private static final int METHODID_SET_TEMP = 1;
  private static final int METHODID_SET_TO_OFF = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AC_ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AC_ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SHOW_CURRENT_DETAILS:
          serviceImpl.showCurrentDetails((com.proto.ac.GetByDeviceIdRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TEMP:
          serviceImpl.setTemp((com.proto.ac.ACDeviceTempRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse>) responseObserver);
          break;
        case METHODID_SET_TO_OFF:
          serviceImpl.setToOff((com.proto.ac.GetByDeviceIdRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.ac.ACDetailResponse>) responseObserver);
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

  private static abstract class AC_ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AC_ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.ac.Ac.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AC_Service");
    }
  }

  private static final class AC_ServiceFileDescriptorSupplier
      extends AC_ServiceBaseDescriptorSupplier {
    AC_ServiceFileDescriptorSupplier() {}
  }

  private static final class AC_ServiceMethodDescriptorSupplier
      extends AC_ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AC_ServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AC_ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AC_ServiceFileDescriptorSupplier())
              .addMethod(getShowCurrentDetailsMethod())
              .addMethod(getSetTempMethod())
              .addMethod(getSetToOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
