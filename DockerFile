FROM openjdk:8
RUN mkdir /dockerdemoapp
WORKDIR /dockerdemoapp
COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /dockerdemoapp
EXPOSE 8090

ENTRYPOINT ["java", "-jar", "dockerdemo-0.0.1-SNAPSHOT.jar"]
