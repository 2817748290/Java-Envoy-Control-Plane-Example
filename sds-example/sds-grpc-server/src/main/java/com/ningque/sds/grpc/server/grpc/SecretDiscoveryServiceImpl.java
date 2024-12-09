package com.ningque.sds.grpc.server.grpc;

import com.google.protobuf.Any;
import io.envoyproxy.envoy.config.core.v3.DataSource;
import io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.Secret;
import io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificate;
import io.envoyproxy.envoy.service.discovery.v3.*;
import io.envoyproxy.envoy.service.secret.v3.SecretDiscoveryServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import static com.ningque.sds.grpc.server.grpc.CertConstants.*;


@GRpcService
public class SecretDiscoveryServiceImpl extends SecretDiscoveryServiceGrpc.SecretDiscoveryServiceImplBase {

    @Override
    public StreamObserver<DeltaDiscoveryRequest> deltaSecrets(StreamObserver<DeltaDiscoveryResponse> responseObserver) {
        responseObserver.onNext(DeltaDiscoveryResponse.newBuilder().build());
        responseObserver.onCompleted();
        return super.deltaSecrets(responseObserver);
    }

    @Override
    public StreamObserver<DiscoveryRequest> streamSecrets(StreamObserver<DiscoveryResponse> responseObserver) {
        return new StreamObserver<DiscoveryRequest>() {
            @Override
            public void onNext(DiscoveryRequest request) {
                var resourceName = request.getResourceNames(0);
                if ("server_cert".equals(resourceName)) {
                    TlsCertificate tlsCertificate = TlsCertificate.newBuilder()
                            .setCertificateChain(DataSource.newBuilder().setInlineString(certificateChain).build())
                            .setPrivateKey(DataSource.newBuilder().setInlineString(privateKey).build())
                            .build();
                    Secret secret = Secret.newBuilder()
                            .setName("server_cert")
                            .setTlsCertificate(tlsCertificate)
                            .build();

                    Any anySecret = Any.pack(secret);

                    responseObserver.onNext(
                            DiscoveryResponse.newBuilder()
                                    .addResources(anySecret)
                                    .setVersionInfo("v1")
                                    .setCanary(false)
                                    .setNonce("12345")
                                    .setTypeUrl("type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.Secret")
                                    .build()
                    );

                    responseObserver.onCompleted();
                } else if ("validation_context".equals(resourceName)) {
                    TlsCertificate tlsCertificate = TlsCertificate.newBuilder()
                            .setCertificateChain(DataSource.newBuilder().setInlineString(caCertificateChain).build())
                            .build();
                    Secret secret = Secret.newBuilder()
                            .setName("validation_context")
                            .setTlsCertificate(tlsCertificate)
                            .build();

                    Any anySecret = Any.pack(secret);

                    responseObserver.onNext(
                            DiscoveryResponse.newBuilder()
                                    .addResources(anySecret)
                                    .setVersionInfo("v1")
                                    .setCanary(false)
                                    .setNonce("12345")
                                    .setTypeUrl("type.googleapis.com/envoy.extensions.transport_sockets.tls.v3.Secret")
                                    .build()
                    );
                    responseObserver.onCompleted();
                }
            }

            @Override
            public void onError(Throwable t) {
                // Handle any errors that occur during the streaming
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // When the client has finished sending requests, complete the response
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void fetchSecrets(DiscoveryRequest request, StreamObserver<DiscoveryResponse> responseObserver) {
        super.fetchSecrets(request, responseObserver);
    }

}
