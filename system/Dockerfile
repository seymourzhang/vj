FROM openjdk:8

USER root

RUN mkdir -p /vj/system

WORKDIR /vj/gateway

COPY ./system-1.0-SNAPSHOT.jar .

CMD ["java", "-jar", "system-1.0-SNAPSHOT.jar"]