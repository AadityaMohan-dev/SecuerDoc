# SecuerDoc

# SecureDoc

SecureDoc is a web application designed to manage and securely store documents. It uses **Spring Boot** for the backend, providing a robust, scalable, and secure API. The **React** frontend allows users to interact with the application seamlessly through a modern, responsive interface.

## Features

- **User Authentication**: Secure login with JWT tokens.
- **File Uploads**: Users can upload and securely store documents.
- **File Encryption**: Documents are encrypted before being saved to the database.
- **Role-based Access Control**: Different levels of access for regular users and administrators.
- **Secure Communication**: All data transmitted between frontend and backend is encrypted using HTTPS.

## Tech Stack

### Backend (Spring Boot)
- **Java 11**
- **Spring Boot** 2.x
- **Spring Security** for authentication and authorization
- **JWT (JSON Web Tokens)** for stateless authentication
- **PostgreSQL** for database storage
- **Hibernate** ORM for data persistence
- **Apache Commons Codec** for file encryption
- **Swagger** for API documentation

### Frontend (React)
- **React** 17.x
- **Axios** for API communication
- **Material-UI** for modern UI components
- **React Router** for routing
- **React Hooks** for state management
- **React-Bootstrap** for responsive layouts

## Installation

### Backend (Spring Boot)

1. Clone the repository:
   ```bash
   git clone https://github.com/AadityaMohan/SecuerDoc.git
   cd securedoc-backend
