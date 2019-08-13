package io.grpc.examples.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0-SNAPSHOT)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = io.grpc.examples.helloworld.HelloRequest.class,
      responseType = HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest,
      HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.helloworld.HelloRequest, HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.HelloRequest, HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld.Greeter", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HelloReply.getDefaultInstance()))
                  .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHello(
        io.grpc.examples.helloworld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  public static abstract class GreeterImplBase implements io.grpc.BindableService, IGreeter {

  @Override
  public final HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
     throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
  }

  @Override
  public final com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHelloAsync(
      io.grpc.examples.helloworld.HelloRequest request) {
     throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
  }

  public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
      io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
  }


@Override
 public final io.grpc.ServerServiceDefinition bindService() {
  return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
      .addMethod(
        getSayHelloMethod(),
        asyncUnaryCall(
          new MethodHandlers<
            io.grpc.examples.helloworld.HelloRequest,
            HelloReply>(
              this, METHODID_SAY_HELLO)))
      .build();
}
}

/**
 * Code generated for Dubbo
 */
public interface IGreeter {

default public HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
   throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
}

default public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHelloAsync(
        io.grpc.examples.helloworld.HelloRequest request) {
   throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
}

public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
                     io.grpc.stub.StreamObserver<HelloReply> responseObserver);

}

public static class DubboGreeterStub implements IGreeter {

private GreeterBlockingStub blockingStub;
private GreeterFutureStub futureStub;
private GreeterStub stub;

public DubboGreeterStub(io.grpc.Channel channel) {
   blockingStub = GreeterGrpc.newBlockingStub(channel);
   futureStub = GreeterGrpc.newFutureStub(channel);
   stub = GreeterGrpc.newStub(channel);
}

public HelloReply sayHello(io.grpc.examples.helloworld.HelloRequest request) {
    return blockingStub.sayHello(request);
}

public com.google.common.util.concurrent.ListenableFuture<HelloReply> sayHelloAsync(
    io.grpc.examples.helloworld.HelloRequest request) {
    return futureStub.sayHello(request);
}

public void sayHello(io.grpc.examples.helloworld.HelloRequest request,
    io.grpc.stub.StreamObserver<HelloReply> responseObserver){
    stub.sayHello(request, responseObserver);
}

}

public static DubboGreeterStub getDubboStub(io.grpc.Channel channel) {

  return new DubboGreeterStub(channel);}

private static final int METHODID_SAY_HELLO = 0;

private static final class MethodHandlers<Req, Resp> implements
    io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
  private final GreeterImplBase serviceImpl;
  private final int methodId;

  MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
    this.serviceImpl = serviceImpl;
    this.methodId = methodId;
  }

  @Override
  @SuppressWarnings("unchecked")
  public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
    switch (methodId) {
      case METHODID_SAY_HELLO:
        serviceImpl.sayHello((io.grpc.examples.helloworld.HelloRequest) request,
            (io.grpc.stub.StreamObserver<HelloReply>) responseObserver);
        break;
      default:
        throw new AssertionError();
    }
  }

  @Override
  @SuppressWarnings("unchecked")
  public io.grpc.stub.StreamObserver<Req> invoke(
      io.grpc.stub.StreamObserver<Resp> responseObserver) {
    switch (methodId) {
      default:
        throw new AssertionError();
    }
  }
}

private static abstract class GreeterBaseDescriptorSupplier
    implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
  GreeterBaseDescriptorSupplier() {}

  @Override
  public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
    return io.grpc.examples.helloworld.HelloWorldProto.getDescriptor();
  }

  @Override
  public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
    return getFileDescriptor().findServiceByName("Greeter");
  }
}

private static final class GreeterFileDescriptorSupplier
    extends GreeterBaseDescriptorSupplier {
  GreeterFileDescriptorSupplier() {}
}

private static final class GreeterMethodDescriptorSupplier
    extends GreeterBaseDescriptorSupplier
    implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
  private final String methodName;

  GreeterMethodDescriptorSupplier(String methodName) {
    this.methodName = methodName;
  }

  @Override
  public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
    return getServiceDescriptor().findMethodByName(methodName);
  }
}

private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

public static io.grpc.ServiceDescriptor getServiceDescriptor() {
  io.grpc.ServiceDescriptor result = serviceDescriptor;
  if (result == null) {
    synchronized (GreeterGrpc.class) {
      result = serviceDescriptor;
      if (result == null) {
        serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
            .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
            .addMethod(getSayHelloMethod())
            .build();
      }
    }
  }
  return result;
}
}
