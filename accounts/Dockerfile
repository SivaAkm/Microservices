#start with base image containing Java Runtime
FROM eclipse-temurin:17-jre

#information around who maintains the image
LABEL maintainer="Siva"
#add the application jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar
#execute the application
ENTRYPOINT ["java","-jar" ,"accounts-0.0.1-SNAPSHOT.jar"]