# team-virtex-workout-app
JHU Service API Design and Development Final Project

## Dependencies

### Swagger Codegen
This project uses Swagger Codegen to generate REST API framework from `yaml`.

Download the command line tool from here: https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.34/swagger-codegen-cli-3.0.34.jar

### Java 1.8
Current target uses Java version 1.8 to ensure compatibility with the swagger codegen tool. More recent Java versions introduce Jakarta, which can cause conflicts.

### Maven
The Maven CLI is used as the project build system.

## Building
To generate the codebase from the `yaml` file, run the following command:

```
java -jar swagger-codegen-cli-3.0.34.jar generate -i workout-app-api.yml -l spring -o workout-application
```

In `workout-application/pom.xml` change the `<java.version>` to `1.8`

Now you can compile and package the application using `maven` with the following command:

```
mvn clean package -f workout-application/pom.xml
```
