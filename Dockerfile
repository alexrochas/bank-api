FROM openjdk:8-alpine

COPY target/uberjar/bank-api.jar /bank-api/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/bank-api/app.jar"]
