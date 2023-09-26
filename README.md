# Spring Tutorial

## Creating a Project
To get started with a Spring project, follow these steps:
1. Go to [Spring Initializr](https://start.spring.io/).
2. Configure the project by selecting the following options:
    - **Project**: Gradle - Groovy
    - **Language**: Java
    - **Spring Boot**: 3.1.4
    - **Packaging**: Jar
    - **Java**: 21
3. In addition to the above settings, add the following dependencies:
    - Spring Web
    - Thymeleaf
4. Once you have configured the project, click the "Generate" button at the bottom of the page. This will download a zip file containing your Spring project template.
5. Unzip the downloaded file and open the `build.gradle` file in IntelliJ IDEA.
6. In the terminal, navigate to the project directory and run `./gradlew bootRun` to start the Spring Boot application
7. After the application has started successfully, open a web browser and visit `localhost:8080` to view the Spring application in action.

## Installed libraries

## Seting up a view
1. Create `index.html` under `src/resources/static`.
2. Add html elements in the file.
3. Start the server and visit `localhost:8080` to see the static content.