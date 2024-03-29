FROM adoptopenjdk:8-jdk-hotspot AS builder
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM adoptopenjdk:8-jdk-hotspot
COPY --from=builder build/libs/*.jar app.jar

# Environment라는 이름의 argument를 받을 수 있도록 설정
ARG ENVIRONMENT
# argument로 받은 ENVIRONMENT 값을 SPRING_PROFILES_ACTIVE에 적용
ENV SPRING_PROFILES_ACTIVE=${ENVIRONMENT}

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]