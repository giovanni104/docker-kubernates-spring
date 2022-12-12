FROM openjdk:8u181-alpine

WORKDIR /app

RUN mkdir ./logs

COPY ./target/msvc-cursos-0.0.1-SNAPSHOT.jar .

EXPOSE 8002

ENTRYPOINT ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]