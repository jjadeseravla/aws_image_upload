mvn-build: mvn install -DskipTests
mvn-run: mvn exec:java
npm-start: cd src/main/frontend && npm start