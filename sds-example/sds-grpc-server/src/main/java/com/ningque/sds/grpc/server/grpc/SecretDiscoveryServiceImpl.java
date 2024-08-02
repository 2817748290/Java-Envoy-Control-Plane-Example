package com.ningque.sds.grpc.server.grpc;

import com.google.protobuf.Any;
import io.envoyproxy.envoy.config.core.v3.DataSource;
import io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.Secret;
import io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsCertificate;
import io.envoyproxy.envoy.service.discovery.v3.*;
import io.envoyproxy.envoy.service.secret.v3.SecretDiscoveryServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import static com.ningque.sds.grpc.server.grpc.CertConstants.certificateChain;
import static com.ningque.sds.grpc.server.grpc.CertConstants.privateKey;


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
        return super.streamSecrets(responseObserver);
    }

    @Override
    public void fetchSecrets(DiscoveryRequest request, StreamObserver<DiscoveryResponse> responseObserver) {
        super.fetchSecrets(request, responseObserver);
    }

}
