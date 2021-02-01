FROM openjdk:8-alpine

WORKDIR /app

COPY ./build/libs/eks-demo-0.0.1-SNAPSHOT.jar ./eks-demo.jar

EXPOSE 9090
#ENTRYPOINT ["java", "-jar", "eks-demo.jar"]