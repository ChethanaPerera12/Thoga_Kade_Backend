# 🛒 Grocery Management System

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring_Boot-4.0.3-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-9.6-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Flyway-12.0.2-CC0200?style=for-the-badge&logo=flyway&logoColor=white"/>
  <img src="https://img.shields.io/badge/Swagger-OpenAPI_3.0-85EA2D?style=for-the-badge&logo=swagger&logoColor=black"/>
</p>

<p align="center">
  A RESTful backend API for managing a grocery store's core operations — customers, inventory items, and orders — built with Spring Boot and MySQL.
</p>

---

## 📌 Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Architecture](#-architecture)
- [API Endpoints](#-api-endpoints)
- [Database Setup](#-database-setup)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)

---

## ✨ Features

- ✅ Full **CRUD** operations for Customers, Items, and Orders
- ✅ **Automated database migrations** with Flyway — no manual SQL setup needed
- ✅ **Interactive API documentation** via Swagger UI
- ✅ Clean layered architecture: Controller → Service → Repository
- ✅ **Cross-Origin (CORS)** support enabled
- ✅ Lombok powered models for clean, boilerplate free code

---

## 🔧 Tech Stack

| Technology | Version | Purpose |
|---|---|---|
| Java | 17 | Core language |
| Spring Boot | 4.0.3 | Web framework |
| MySQL | 9.6.0 | Relational database |
| Flyway | 12.0.2 | DB schema migration |
| Lombok | 1.18.42 | Reduce boilerplate code |
| SpringDoc OpenAPI | 3.0.1 | Swagger UI / API docs |

---

## 🏗️ Architecture

```
Client Request
      │
      ▼
  Controller Layer        ← Handles HTTP requests (REST endpoints)
      │
      ▼
  Service Layer           ← Business logic
      │
      ▼
  Repository Layer        ← Database access (raw JDBC)
      │
      ▼
  MySQL Database          ← Managed by Flyway migrations
```

---

## 📡 API Endpoints

### 👤 Customer — `/customer`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/customer/get-all` | Get all customers |
| `POST` | `/customer/add-customer` | Add a new customer |
| `PUT` | `/customer/update-customer` | Update customer details |
| `DELETE` | `/customer/delete-customer-id/{id}` | Delete a customer |
| `GET` | `/customer/search-customer-id/{id}` | Search customer by ID |

### 📦 Item — `/item`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/item/get-all-items` | Get all items |
| `POST` | `/item/add-item` | Add a new item |
| `PUT` | `/item/update-item` | Update item details |
| `DELETE` | `/item/delete-item-id/{id}` | Delete an item |
| `GET` | `/item/search-item-id/{id}` | Search item by ID |

### 🧾 Order — `/order`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/order/get-all` | Get all orders |
| `POST` | `/order/add-order` | Place a new order |
| `PUT` | `/order/update-order` | Update an order |
| `DELETE` | `/order/delete-order-id/{id}` | Delete an order |
| `GET` | `/order/search-order-id/{id}` | Search order by ID |

> 📖 Full interactive API docs available at: `http://localhost:8080/swagger-ui.html`

---

## 🗄️ Database Setup

This project uses **Flyway** for automated database migration.

> You do **not** need to manually create tables. Flyway will handle schema creation automatically on app startup.

1. Create a MySQL database:
```sql
CREATE DATABASE thogakade;
```

2. Update your credentials in `application.yml`:
```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/thogakade
    username: your_username
    password: your_password
  flyway:
    enabled: true
    baseline-on-migrate: true
```

3. Run the app — Flyway will apply all migrations automatically ✅

---

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.8+
- MySQL Server running locally

### Run the Application

```bash
# Clone the repository
git clone https://github.com/your-username/grocery-management-system.git

# Navigate to the project
cd grocery-management-system

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The server will start at **`http://localhost:8080`**

---

## 📁 Project Structure

```
src/main/
├── java/edu.icet/
│   ├── Main.java
│   ├── controller/
│   │   ├── CustomerController.java
│   │   ├── ItemController.java
│   │   └── OrderController.java
│   ├── service/
│   │   ├── CustomerService.java
│   │   ├── ItemService.java
│   │   ├── OrderService.java
│   │   └── Impl/
│   │       ├── CustomerServiceImpl.java
│   │       ├── ItemServiceImpl.java
│   │       └── OrderServiceImpl.java
│   ├── repository/
│   │   ├── CustomerRepository.java
│   │   ├── ItemRepository.java
│   │   ├── OrderRepository.java
│   │   └── Impl/
│   │       ├── CustomerRepositoryImpl.java
│   │       ├── ItemRepositoryImpl.java
│   │       └── OrderRepositoryImpl.java
│   └── model/
│       ├── Customer.java
│       ├── Item.java
│       └── Order.java
└── resources/
    └── application.yml

