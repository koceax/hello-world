FROM openjdk:8-jre-alpine
VOLUME /var/app/logs
WORKDIR /app
COPY app.jar .
COPY application.properties .
COPY logback-spring.xml .
CMD ["java","-jar","app.jar"]
