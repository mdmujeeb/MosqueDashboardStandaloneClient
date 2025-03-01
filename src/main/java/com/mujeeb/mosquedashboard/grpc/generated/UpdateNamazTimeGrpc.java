package com.mujeeb.mosquedashboard.grpc.generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Mosque Dashboard Service Definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: mosque-dashboard.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UpdateNamazTimeGrpc {

  private UpdateNamazTimeGrpc() {}

  public static final String SERVICE_NAME = "com.mujeeb.mosquedashboard.grpc.UpdateNamazTime";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest,
      com.mujeeb.mosquedashboard.grpc.generated.GenericReply> getUpdateNamazTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNamazTime",
      requestType = com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest.class,
      responseType = com.mujeeb.mosquedashboard.grpc.generated.GenericReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest,
      com.mujeeb.mosquedashboard.grpc.generated.GenericReply> getUpdateNamazTimeMethod() {
    io.grpc.MethodDescriptor<com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest, com.mujeeb.mosquedashboard.grpc.generated.GenericReply> getUpdateNamazTimeMethod;
    if ((getUpdateNamazTimeMethod = UpdateNamazTimeGrpc.getUpdateNamazTimeMethod) == null) {
      synchronized (UpdateNamazTimeGrpc.class) {
        if ((getUpdateNamazTimeMethod = UpdateNamazTimeGrpc.getUpdateNamazTimeMethod) == null) {
          UpdateNamazTimeGrpc.getUpdateNamazTimeMethod = getUpdateNamazTimeMethod =
              io.grpc.MethodDescriptor.<com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest, com.mujeeb.mosquedashboard.grpc.generated.GenericReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNamazTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mujeeb.mosquedashboard.grpc.generated.GenericReply.getDefaultInstance()))
              .setSchemaDescriptor(new UpdateNamazTimeMethodDescriptorSupplier("UpdateNamazTime"))
              .build();
        }
      }
    }
    return getUpdateNamazTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UpdateNamazTimeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeStub>() {
        @java.lang.Override
        public UpdateNamazTimeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNamazTimeStub(channel, callOptions);
        }
      };
    return UpdateNamazTimeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UpdateNamazTimeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeBlockingStub>() {
        @java.lang.Override
        public UpdateNamazTimeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNamazTimeBlockingStub(channel, callOptions);
        }
      };
    return UpdateNamazTimeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UpdateNamazTimeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UpdateNamazTimeFutureStub>() {
        @java.lang.Override
        public UpdateNamazTimeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UpdateNamazTimeFutureStub(channel, callOptions);
        }
      };
    return UpdateNamazTimeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Mosque Dashboard Service Definition.
   * </pre>
   */
  public static abstract class UpdateNamazTimeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void updateNamazTime(com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest request,
        io.grpc.stub.StreamObserver<com.mujeeb.mosquedashboard.grpc.generated.GenericReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNamazTimeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateNamazTimeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest,
                com.mujeeb.mosquedashboard.grpc.generated.GenericReply>(
                  this, METHODID_UPDATE_NAMAZ_TIME)))
          .build();
    }
  }

  /**
   * <pre>
   * The Mosque Dashboard Service Definition.
   * </pre>
   */
  public static final class UpdateNamazTimeStub extends io.grpc.stub.AbstractAsyncStub<UpdateNamazTimeStub> {
    private UpdateNamazTimeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNamazTimeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNamazTimeStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void updateNamazTime(com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest request,
        io.grpc.stub.StreamObserver<com.mujeeb.mosquedashboard.grpc.generated.GenericReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNamazTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Mosque Dashboard Service Definition.
   * </pre>
   */
  public static final class UpdateNamazTimeBlockingStub extends io.grpc.stub.AbstractBlockingStub<UpdateNamazTimeBlockingStub> {
    private UpdateNamazTimeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNamazTimeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNamazTimeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.mujeeb.mosquedashboard.grpc.generated.GenericReply updateNamazTime(com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNamazTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Mosque Dashboard Service Definition.
   * </pre>
   */
  public static final class UpdateNamazTimeFutureStub extends io.grpc.stub.AbstractFutureStub<UpdateNamazTimeFutureStub> {
    private UpdateNamazTimeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UpdateNamazTimeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UpdateNamazTimeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mujeeb.mosquedashboard.grpc.generated.GenericReply> updateNamazTime(
        com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNamazTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_NAMAZ_TIME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UpdateNamazTimeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UpdateNamazTimeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_NAMAZ_TIME:
          serviceImpl.updateNamazTime((com.mujeeb.mosquedashboard.grpc.generated.NamazTimeUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.mujeeb.mosquedashboard.grpc.generated.GenericReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UpdateNamazTimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UpdateNamazTimeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mujeeb.mosquedashboard.grpc.generated.MosqueDashboardProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UpdateNamazTime");
    }
  }

  private static final class UpdateNamazTimeFileDescriptorSupplier
      extends UpdateNamazTimeBaseDescriptorSupplier {
    UpdateNamazTimeFileDescriptorSupplier() {}
  }

  private static final class UpdateNamazTimeMethodDescriptorSupplier
      extends UpdateNamazTimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UpdateNamazTimeMethodDescriptorSupplier(String methodName) {
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
      synchronized (UpdateNamazTimeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UpdateNamazTimeFileDescriptorSupplier())
              .addMethod(getUpdateNamazTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
