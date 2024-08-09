FROM openjdk:8-jdk-alpine

ADD target/*.jar system.jar

EXPOSE 9301

ENTRYPOINT ["java", "-jar", "/system.jar"]

#设置时区
ENV TZ=Asia/Shanghai

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone