FROM openjdk:11.0.11-jdk-oraclelinux7
EXPOSE 8085
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8","-jar","/app.jar"]