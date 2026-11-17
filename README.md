# Spring Boot YAML Contract Demo

A minimal Spring Boot application implementing the GET addition endpoint from the assignment.

## Requirements
- JDK 17 or later
- Maven 3.6.3 or later

## Run the application
Open a terminal in this project folder and run:

```bash
mvn spring-boot:run
```

The application starts at `http://localhost:8080`.

## Test the endpoint

Open this URL in a browser or use curl:

```bash
curl -i "http://localhost:8080/ms1/add?a=5&b=10"
```

Expected response:

```text
HTTP/1.1 200
Content-Type: text/plain;charset=UTF-8

MS 1.1 - Addition = 15
```

Try other numbers too:

```bash
curl "http://localhost:8080/ms1/add?a=7&b=8"
```

Expected body: `MS 1.1 - Addition = 15`

## Run tests

```bash
mvn test
```

## Project structure

```text
yaml-contract-demo/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   ├── java/com/example/contractdemo/
    │   │   ├── ContractDemoApplication.java
    │   │   └── controller/AdditionController.java
    │   └── resources/
    │       └── contracts/addition-contract.yml
    └── test/
        └── java/com/example/contractdemo/controller/
            └── AdditionControllerTest.java
```

## Important note about the YAML contract

The YAML file documents the agreed request and response specification. The Spring Boot controller implements that specification, and the automated test checks the example request and response. This starter project does not automatically parse the YAML file at runtime or generate tests from it.
