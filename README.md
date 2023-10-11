# Farm2Fork Backend

## Environment Details
- Java Version: 21
- Gradle
- Spring Boot Version: 3.1.4

## Setup Guide
- Clone this repository.
- Open the `build.gradle` file with IntelliJ.
- Allow IntelliJ a moment to finish its setup.
- Open the terminal in IntelliJ and execute the following command:
```sh
./gradlew bootRun
```
- Once the server is up and running, open a web browser and navigate to `localhost:8080/hello`.
- If you see the message "Hello, world!", your setup is complete!

## When developing...
- Please create domain-specific packages. For instance, all user-related files should be placed under `src/main/java/com/Farm2Fork/Farm2Fork/User`. It may appear as `src/main/java/com.Farm2Fork.Farm2Fork/User` depending on your IntelliJ setup.
- As of October 10, 2023, four packages have been created: Order, OrderItem, Product, and User. Don't hesitate to use feature branches liberally. For more information, refer to [this link](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=What%20is%20Gitflow%3F,lived%20branches%20and%20larger%20commits).
- When creating a feature branch, please name it with the Asana ticket number (e.g., [F2F-xxx]).
