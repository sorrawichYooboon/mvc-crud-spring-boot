# Spring MVC CRUD with Spring Boot

This project demonstrates a **CRUD (Create, Read, Update, Delete)** application using **Spring Boot** with an **MVC architecture**. The application manages **categories** and **products** with RESTful endpoints.

---

## Features

- Manage **categories** (create, read, delete).
- Manage **products** (create, read, delete).
- RESTful API endpoints.
- Use of **Spring Data JPA** for database interactions.
- Built-in support for **H2 in-memory database**.
- MVC architecture with controllers, services, and repositories.

---

## Project Structure
```plaintext
src/
├── main/
│   ├── java/com/example/mvc_crud_spring_boot/
│   │   ├── controller/
│   │   │   ├── CategoryController.java
│   │   │   ├── ProductController.java
│   │   ├── model/
│   │   │   ├── Category.java
│   │   │   ├── Product.java
│   │   ├── service/
│   │   │   ├── CategoryService.java
│   │   │   ├── ProductService.java
│   │   ├── repository/
│   │   │   ├── CategoryRepository.java
│   │   │   ├── ProductRepository.java
│   │   └── SpringMvcCrudSpringBootApplication.java
│   ├── resources/
│       ├── application.properties
│       ├── data.sql
```

## Getting Started

### **Prerequisites**

- Java 8 or higher
- Maven 3.6.3 or higher
- cURL or Postman
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Running the Application

1.Run the application using Maven:
    ```bash
    mvn spring-boot:run
     ```

## Endpoints

### **Category Endpoints**

| HTTP Method | Endpoint           | Description                        |
|-------------|--------------------|------------------------------------|
| `GET`       | `/v1/category`     | Retrieve all categories            |
| `POST`      | `/v1/category`     | Create a new category              |
| `DELETE`    | `/v1/category/{id}`| Delete a category by ID            |

#### Example cURL Commands for Categories:

1. **Retrieve All Categories**:
   ```bash
   curl -X GET http://localhost:8080/v1/category
    ```
   
2. **Create a New Category**:
    ```bash
    curl -X POST http://localhost:8080/v1/category -H "Content-Type: application/json" -d '{"name": "Electronics"}'
     ```
   
3. **Delete a Category by ID**:
    ```bash
    curl -X DELETE http://localhost:8080/v1/category/1
     ```
   
### **Product Endpoints**

| HTTP Method | Endpoint           | Description                        |
|-------------|--------------------|------------------------------------|
| `GET`       | `/v1/product`      | Retrieve all products              |
| `POST`      | `/v1/product`      | Create a new product               |
| `DELETE`    | `/v1/product/{id}` | Delete a product by ID             |

#### Example cURL Commands for Products:

1. **Retrieve All Products**:
   ```bash
   curl -X GET http://localhost:8080/v1/product
    ```
2. **Create a New Product**:
    ```bash
    curl -X POST http://localhost:8080/v1/product -H "Content-Type: application/json" -d '{"name": "Laptop", "price": 1000.0, "categoryId": 1}'
     ```
3. **Delete a Product by ID**:
    ```bash
    curl -X DELETE http://localhost:8080/v1/product/1
     ```

---

