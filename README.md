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
- Thymeleaf: Template Engine

## Setting up a view
To set up a view (static and non-static), follow these steps:
1. Create `index.html` under `src/resources/static`.
2. Add html elements in the file.
3. Start the server and visit `localhost:8080` to see the static content.
4. Use Thymeleaf by doing the following:
     - Create a controller. Look up `@Contoller` and `@GetMapping`. `@GetMapping` as in HTTPGET method.
     - Create a corresponding template and enable Thymeleaf.

## Build and run the application
To build and run the application, follow these steps:
1. `./gradlew build`
2. It will create `/build` directory where the files are stored.
3. `cd` to `/build/libs`.
4. Run the `.jar` file using `java -jar <FILENAME>.jar`.
5. Run `./gradlew clean` to remove the `/build` directory.  If there is a problem with building the project, run `./gradlew clean build`.

## Static contents
By default, Spring boot serves static content from a directory called `/static` in the classpath or from the root of the `ServletContext`.
1. Create an html file under `/resources/static`.
2. Start the server and visit `localhost:8080/<FILENAME>.html`.
3. Tomcat will let Spring know that there was a request to `localhost:8080/<FILENAME>.html`.
4. Spring will look for the corresponding controller first.
5. Spring will then look for it in `/static`.

## Model, View, Controller
Split Controller from View so that View can only focus on the view and Controller can focus on business logic and pass Model to the View.  #4 of 'Setting up a view' is how you go about doing it.  Look up `@RequestParam`.
1. Tomcat will let Spring know that there was a request for `localhost:8080/mvc?name=Elliott`.
2. Spring will search for the mvc controller.
3. It will then pass the model (name: Elliott) and `return "mvc"` to viewResolver.
4. The viewResolver will then go search for `mvc.html` and asks Thymeleaf to render the html with the passed value.

## API
Returns `JSON`.  This is the most common practice.
```java
@GetMapping("api")
@ResponseBody // As in HTTP response body.
public User API(@RequestParam("name") String name) {
    User user = new User();
    user.setName(name);
    return user;
}

static class User {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}   
```
1. Tomcat will let Spring know that there was a request for `localhost:8080/mvc?name=Elliott`.
2. Spring will search for the mvc controller.
3. It will see `@ResponseBody` and prepare to respond in the body of HTTP.
4. If an object is returned, convert it to JSON and return.
5. Instead of viewResolver, HttpMessageConverter will run.
NOTE: We probably need to use JSON for HTTP Accept header.