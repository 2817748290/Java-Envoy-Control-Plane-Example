# SDS-Example
Java Secret Discover Service Example

## **Preparation**
envoy: _**1.21.1 / Docker Compose**_

sds-grpc-server: _**Spring-Boot 3.x / JDK 17**_

## **Envoy Start**
```bash
$ cd enovy
$ docker-compose up -d
```

## **Server Start**
### 1. replace custom cert / key
edit _**com.ningque.sds.grpc.server.grpc.CertConstants**_

### 2. start
```bash
$ cd sds-grpc-server
$ mvn clean compile
$ mvn clean package
$ java -jar sds-grpc-server-0.0.1-SNAPSHOT.jar
```

### 3. check gRPC 
```bash
$ grpcurl -plaintext localhost:9192 list
```

## **Custom MQTT-Broker Start**

allows you to use your creativity.