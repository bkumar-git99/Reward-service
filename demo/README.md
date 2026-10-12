Retailer Rewards Program

1. Project Overview
A retailer wants to offer a rewards program to its customers, calculating reward points for every recorded purchase. 
This Spring Boot application calculates reward points based on a customer's purchase transactions over a 3-month period.

2. Tech Stack & Environment
- Programming Language: Java 17
- Framework:Spring Boot (4.1.x)
- Database:H2 In-Memory Database
- Build Tool:Maven
- Testing Framework:JUnit 5, Spring Boot Test

3. Project Package Structure
The application follows standard enterprise Java coding practices and package naming conventions:

- com.example.rewards.controller: Contains REST Controllers (e.g., `RewardController`) to expose endpoints.
- com.example.rewards.service: Contains business logic and reward calculation algorithms (e.g., `RewardService`).
- com.example.rewards.model: Contains entity and model classes (`Customer`, `Transaction`, `RewardResponse`).
- com.example.rewards.repository: Contains Spring Data JPA interfaces for database interaction (`CustomerRepository`, `TransactionRepository`).

4. Business Logic & Rules

- Points Calculation Formula:

  - A customer receives 2 points for every dollar spent over $100 in each transaction.
  - Plus 1 point for every dollar spent between $50 and $100 in each transaction.

  - Example: For a purchase of $120: 

    - $2 \times (120 - 100) = 40$ points
    - $1 \times (100 - 50) = 50$ points
    - Total Points = 90 points

- Dynamic Month Handling:Months are dynamically extracted from transaction timestamps without hardcoding.

5. Database & Initial Data (`data.sql`)

- The application automatically initializes test data for multiple customers and multiple transactions using the `src/main/resources/data.sql` script instead of hardcoding data inside Java classes.

6. Testing & Quality Assurance

- Unit & Integration Tests:Implemented using JUnit 5 inside the `src/test/java` directory.
- Test Scenarios:Covers multiple customers, multi-month transactions, edge cases, and negative test.

7. How to Run the Project

1. Clone or Import:Open the project in Eclipse IDE as an existing Maven project.
2. Update Maven:Right-click the project -> Maven -> Update Project(Force Update enabled).
3. Run Application: Locate `RewardsApplication.java`, right-click, and select Run As -> Spring Boot App.
4. Access Database (H2):You can access the H2 console at `http://localhost:8080/h2-console` using the configuration specified in `application.properties`.