ARG JAVA_VERSION=15
FROM openjdk:${JAVA_VERSION}
COPY target/ees-intranet-ms-gateway.jar ees-intranet-ms-gateway.jar
EXPOSE 9010
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/ees-intranet-ms-gateway.jar"]