# SOA End Sem Lab - Calculator Service Mocking

**ID:** 2400032679  
**Subject:** Service-Oriented Architecture (SOA) - End Semester Skill / Lab Exam  

---

## 📌 Project Overview
This repository contains the Spring Boot RESTful microservice implementing arithmetic operations (Addition, Subtraction, Multiplication, Division) with service-layer dependency mocking in unit tests using Mockito and Spring WebMvcTest.

---

## 📂 Key Project Files

| Component | File Path | Description |
| :--- | :--- | :--- |
| **Controller Class** | [`CalculatorController.java`](src/main/java/com/example/calculator/CalculatorController.java) | REST Controller handling `/calculator/*` endpoints |
| **Main Class** | [`CalculatorApplication.java`](src/main/java/com/example/calculator/CalculatorApplication.java) | Spring Boot `@SpringBootApplication` entry point |
| **Java Service Class** | [`CalculatorService.java`](src/main/java/com/example/calculator/CalculatorService.java) | Service layer with business logic for arithmetic operations |
| **Application Config** | [`application.yml`](src/main/resources/application.yml) | Configuration setting port `8081` and application name `addition-service` |
| **Test Class** | [`CalculatorControllerTest.java`](src/test/java/com/example/calculator/CalculatorControllerTest.java) | Unit tests using `@WebMvcTest`, `@MockBean`, and Mockito verification |
| **Maven POM** | [`pom.xml`](pom.xml) | Build file with Spring Boot 3.3.5 and required dependencies |

---

## 🚀 REST API Endpoints

Base URL: `http://localhost:8081/calculator`

- **Addition:** `GET /calculator/add?a=10&b=5`  
  *Response:* `15`
- **Subtraction:** `GET /calculator/subtract?a=10&b=5`  
  *Response:* `5`
- **Multiplication:** `GET /calculator/multiply?a=10&b=5`  
  *Response:* `50`
- **Division:** `GET /calculator/divide?a=10&b=5`  
  *Response:* `2`

---

## 🧪 Testing & Execution

### Run Tests:
```bash
mvn test
```

### Run Application:
```bash
mvn spring-boot:run
```
or
```bash
java -jar target/calculator-service-mocking-0.0.1-SNAPSHOT.jar
```
