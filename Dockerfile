FROM openjdk:8-alpine

WORKDIR /app

COPY ./build/libs/eks-demo-0.0.1-SNAPSHOT.jar ./eks-demo.jar

EXPOSE 8080
ENTRYPOINT java -Dserver.port=8080 -jar eks-demo.jar