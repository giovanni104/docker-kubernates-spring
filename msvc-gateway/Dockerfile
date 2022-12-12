FROM openjdk:8u181-alpine

WORKDIR /app

RUN mkdir ./logs

COPY ./target/msvc-gateway-0.0.1-SNAPSHOT.jar .

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "msvc-gateway-0.0.1-SNAPSHOT.jar"]