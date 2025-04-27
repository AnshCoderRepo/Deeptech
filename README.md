# Container Routing Optimization API

This project is a Java Spring Boot application that provides an HTTP API for container-routing optimization. It includes the following key components:

## ContainerRoutingApplication.java
- The main entry point of the Spring Boot application.
- Annotated with `@SpringBootApplication` to enable auto-configuration and component scanning.
- Contains the `main` method which launches the application using `SpringApplication.run()`.

## OptimizationService.java
- A Spring `@Service` class that contains the container-routing optimization algorithm.
- The `optimize` method accepts input data as a `Map<String, Object>` and returns a list of strings representing the optimal container-move plan.
- Currently implements a placeholder algorithm that simply echoes the input keys.
- Replace the placeholder logic with your actual optimization formulas and logic.

## OptimizationController.java
- A Spring `@RestController` that exposes the HTTP API endpoint.
- Maps POST requests to `/api/optimize` to the `optimize` method.
- Accepts JSON input in the request body and passes it to the `OptimizationService`.
- Returns the optimization plan as a JSON array in the response.

## pom.xml
- Maven build configuration file.
- Defines project metadata and dependencies.
- Includes Spring Boot starter dependencies for web and testing.
- Configures the Spring Boot Maven plugin for building and running the application.

## Running the Application
- Build and run the application using Maven:
  ```
  mvn spring-boot:run
  ```
- The API will be available at `http://localhost:8080/api/optimize`.

## Usage Example
Send a POST request with JSON input to the API endpoint:
```
curl -X POST -H "Content-Type: application/json" -d '{"container1":{"origin":"A","destination":"B"}}' http://localhost:8080/api/optimize
```
The response will be a JSON array with the optimization plan.

## Notes
- The current optimization algorithm is a placeholder. Replace it with your actual optimization logic.
- The project uses Java 17 and Spring Boot 3.0.5.

## Latency Benchmark
You can measure the latency of the API by sending multiple requests and recording response times. Use tools like Apache JMeter or simple shell scripts with curl.

---

This README provides a comprehensive overview of the project structure and usage.
