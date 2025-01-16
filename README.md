# Task Management Application

## Overview
The **Task Management Application** is a full-stack project designed to help users manage tasks and projects efficiently. It includes features like user authentication, project creation, task assignment, and real-time status updates. The application is built with **Spring Boot** on the backend and **React.js** on the frontend.

---

## Features
- **User Authentication**: Secure user registration and login with JWT-based authentication.
- **Project Management**: Create, view, and manage multiple projects.
- **Task Management**: Add, update, delete, and organize tasks within projects.
- **Role-Based Access Control**: Protect sensitive endpoints with user-specific access.
- **Responsive Design**: A modern, user-friendly interface powered by React.js.
- **Database Integration**: Data persistence with MySQL.

---

## Technologies Used

### Backend
- **Spring Boot**
- **Spring Security** (JWT for authentication)
- **MySQL** (Relational Database)
- **Hibernate/JPA** (Data persistence)
- **Maven** (Build tool)

### Frontend
- **React.js**
- **Axios** (API integration)
- **React Router** (Client-side routing)

---

## Installation and Setup

### Prerequisites
Ensure the following are installed:
- Java 17 or above
- Node.js and Yarn
- MySQL
- Maven


#### Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/task-management-app.git
   cd task-management-app/backend
   
2. Configure the database:
   - Create a database named taskmanager.
   - Update the credentials in src/main/resources/application.properties.
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3307/taskmanager
   spring.datasource.username=your-username
   spring.datasource.password=your-password

3. Build and run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run

4. Backend will run on http://localhost:8080

#### Frontend
1. Navigate to the frontend directory:
   ```bash
   cd ../frontend
   
2. Install dependencies:
   ```bash
   yarn install

3. Start the frontend server:
   ```bash
   yarn start

4. Frontend will run on http://localhost:3000.

## API Endpoints
## Authentication
- **POST** /auth/login: User login
- **POST** /users/register: User registration

## Projects
- **GET** /projects: Fetch all projects
- **POST** /projects: Create a new project

## Tasks
- **GET** /tasks/{projectId}: Fetch tasks for a specific project
- **POST** /tasks: Create a new task
- **DELETE** /tasks/{id}: Delete a task

## Project Structure
   ```bash
task-management-app/
|-- backend/
|   |-- src/main/java/com/taskmanager
|   |   |-- config/
|   |   |-- controllers/
|   |   |-- dto/
|   |   |-- entities/
|   |   |-- repositories/
|   |   |-- services/
|   |   |-- TaskmanagerApplication.java
|   |-- src/main/resources/
|       |-- application.properties
|-- frontend/
|   |-- src/
|   |   |-- components/
|   |   |-- pages/
|   |   |-- services/
|   |   |-- App.js
|   |-- package.json

