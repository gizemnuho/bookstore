# 📚 Book Store App
This is a simple Book Store application built with Spring Boot. It allows you to manage books, authors, and categories easily through RESTful APIs.

## 🚀 Features
- Add and update books
- List books, authors, and categories
- Delete books
- Search and filter support (optional)
- Clean and modular structure

## 🛠️ Technologies Used
- Java 21 (or higher)
- Spring Boot
- Spring Data JPA
- MySQL
- Lombok

## ⚙️ Installation
```bash
git clone https://github.com/gizemnuho/book-store.git
cd book-store
```
Make sure you have MySQL installed and running. Create a database named, for example, `bookstore_db`. Then update your `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```
Finally, run the project:
```bash
./mvnw spring-boot:run
```
or
```bash
mvn spring-boot:run
```

## 🌐 API Endpoints (Examples)
- **GET** `/books` — Get all books
- **POST** `/books` — Add a new book
- **PUT** `/books/{id}` — Update book details
- **DELETE** `/books/{id}` — Delete a book
- **GET** `/authors` — Get all authors
- **GET** `/categories` — Get all categories

## 💡 Notes
- The app uses MySQL for data persistence.
- You can change database configurations in `application.properties`.
- You can easily add authentication, search filters, or advanced business logic.

