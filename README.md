# Simple Logistics Load Application

The Simple Logistics Load Application is a logistics management system developed using Maven and Spring Boot. It provides a user-friendly interface and a set of APIs for managing and tracking logistic loads. The application's APIs can be tested using Postman, and all data posted through the APIs are stored in a PostgreSQL database.

## Features

- **Load Management**: The application enables users to create, update, and delete logistic load details. It provides comprehensive load management functionality, allowing efficient tracking and organization of loads.

- **API Support**: The project offers a set of RESTful APIs that can be easily integrated with other systems or used by third-party applications. These APIs allow users to perform CRUD operations on load data and retrieve relevant information.

- **Postman Testing**: The implemented APIs are thoroughly tested using Postman, ensuring that the endpoints function correctly, handle errors gracefully, and provide expected responses. Postman collections and environment files are included for convenient testing.

- **PostgreSQL Database**: All data posted through the APIs are stored in a PostgreSQL database. This choice of database ensures reliability, scalability, and data integrity for the logistic load application.

- **Maven Dependency Management**: The project utilizes Maven for dependency management, simplifying the addition, updating, and management of external libraries and frameworks required for the application.

## Usage

1. Clone the repository:
   ```
   git clone https://github.com/your-username/simple-logistic-load-application.git
   ```

2. Install dependencies using Maven:
   ```
   cd simple-logistic-load-application
   mvn clean install
   ```

3. Configure the PostgreSQL database connection in `application.properties`.

4. Run the application using Maven:
   ```
   mvn spring-boot:run
   ```

5. The application will start, and you can access the Swagger documentation at `http://localhost:8080/swagger-ui.html`. The Swagger UI provides detailed information about the available APIs and allows for easy testing and interaction.

6. Use Postman or any other REST client to test the APIs. Import the provided Postman collection and environment files for convenient testing.

## Contributing

Contributions to the Simple Logistic Load Application project are welcome. If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## Acknowledgements

This project was developed using Maven and Spring Boot, with the support of the PostgreSQL database and Postman for API testing. Special thanks to the  open-source community for their invaluable efforts in creating and maintaining these technologies.
