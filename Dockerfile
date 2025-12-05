# 베이스 이미지 (표준 Java 17)
FROM eclipse-temurin:17-jdk

# 작업 디렉토리
WORKDIR /app

# 빌드된 JAR 파일 복사
COPY build/libs/*.jar app.jar

# 실행 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]