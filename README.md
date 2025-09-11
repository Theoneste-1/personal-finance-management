# Personal Finance Management System

## Overview

This is a backend API for a Personal finance Management System built with Spring Boot, Hibernate, and PostgreSQL. It provides a robust solution for managing personal tasks, incomes, expenses, contracts, and bank accounts contacts, and schedules with features like pagination, sorting, and filtering.

## Features

- **Task Management**: Create, update, delete, and list tasks.
- **Contact Management**: Store and manage contact details.
- **Schedule Management**: Organize schedules with reminders.
- **Pagination**: Limit and navigate through large datasets.
- **Sorting**: Order results by fields like name or date.
- **Filtering**: Search and filter records by various criteria.
- **RESTful APIs**: Secure and well-documented endpoints.

## Technologies Used

- **Spring Boot**: For building the RESTful API.
- **Hibernate**: For ORM and database interactions.
- **PostgreSQL**: As the relational database.
- **Maven**: For dependency management and build.

## Installation

1. Clone the repository:
```
git clone <your-repo-url>
cd personal-management-system</your-repo-url>
```
2. Configure PostgreSQL:
- Create a database named `personal_db`.
- Update `application.properties` with DB credentials.
3. Install dependencies:
  ```
  mvn install
  ```
4. Run the application:
```
mvn spring-boot:run
```

- Access APIs at `http://localhost:8080`.

## Usage

- **API Endpoints**: Base URL `http://localhost:8080/api`.
- `/tasks`: GET (list), POST (create), etc.
- `/contacts`: GET (list), POST (create), etc.
- Supports `?page=0&size=10`, `?sort=name,asc`, `?filter=title:task1`.
- Test with tools like Postman or cURL.

## Deployment

- Deploy using a container like Docker or a cloud service (e.g., Heroku, AWS).
- Configure environment variables for DB and API keys.
- Refer to Spring Boot deployment guides.

## Contributing

- Fork the repository, make changes, and submit
