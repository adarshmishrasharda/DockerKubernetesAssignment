#define base docker image
FORM openjdk:11
LABEL maintainer="adarshdocker"
ADD target/BankApplication-0.0.1-SNAPSHOT.jar springboot-docker-image.jar
ENTRYPOINT ["java","-jar", "springboot-docker-image.jar"]