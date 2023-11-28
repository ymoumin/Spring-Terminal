# Spring-Terminal
A Maven Web Application using Spring Boot for a JQuery Terminal.

## About
### Main Spring Boot Dependecies for this project:
- **Spring Web:** To build the web application using Spring MVC, in addition to running TomCat as the embedded Java server.
- **Thymeleaf:** Java template engine used for processing and creating HTML & JavaScript for this project

### Goal:
- A **controller** handles the user request of which **language (French or English) to display the terminal** in.

# Maven build lifecyle

## Validation
Run the following commad to validate that **the project is accurate** and has all required information:

    mvn validate

## Compilation
Run the following commad to **compile the source code**, and a **new target directory** will be created:

    mvn compile

## Testing
Run the following commad to run the **test cases** provided in TestApp.java:

    mvn test

## Packaging
Run the following command to package the project into an **executable jar file**, in the target directory:

    mvn clean package

## Run
After compiling, testing and packaing the project, a new jar file is created in the target directory that can be executed with the following command:

    java -jar target/Yassine_app-1.0-SNAPSHOT.jar

**The application is visible at port 8080: http://localhost:8080**