FROM openjdk:11
COPY target/*.jar poc-spring-redis-session.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/poc-spring-redis-session.jar"]