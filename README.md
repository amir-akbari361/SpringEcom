
# Spring Boot & React E-Commerce Project

This is a full-stack e-commerce project developed using **Spring Boot** for the backend and **React** for the frontend.

## 📝 Overview

This application simulates a simple e-commerce platform where users can browse products, filter them by category, search for items, and manage their shopping cart. Administrators can also add new products, update existing ones, and delete them from the system.

-----

## ✨ Features

### Backend (Spring Boot)

  - **RESTful API**: Provides RESTful endpoints for managing products.
  - **Full CRUD Operations**:
      - Get all products (`GET /api/products`).
      - Get a single product by ID (`GET /api/product/{id}`).
      - Create and update products (`POST /api/product`, `PUT /api/product/{id}`).
      - Delete a product (`DELETE /api/product/{id}`).
  - **Image Upload**: Supports uploading and storing images for each product in the database.
  - **Advanced Search**: A search endpoint to find products based on a keyword (`GET /api/products/{keyword}`).
  - **Aspect-Oriented Programming (AOP)**:
      - **Logging**: Logs method calls within the service layer.
      - **Performance Monitoring**: Measures the execution time of service methods.
      - **Validation**: Validates inputs (like negative IDs) before method execution.

### Frontend (React)

  - **Home Page**: Displays all available products in a grid layout.
  - **Product Detail Page**: Shows detailed information for a specific product.
  - **Product Search**: Allows users to search for products by name, brand, category, or description.
  - **Category Filtering**: Users can filter products based on different categories.
  - **Shopping Cart**:
      - Add/remove products to/from the cart.
      - Increase or decrease the quantity of each item in the cart.
      - Calculate and display the total price.
      - A checkout process that updates the product stock quantity.
  - **Product Management**:
      - A form to add a new product, including an image upload feature.
      - A form to edit the details of an existing product.
      - The ability to delete a product.
  - **Light/Dark Theme**: Toggle the application's theme between light and dark modes.
  - **Responsive Design**: Adapts to various screen sizes using Bootstrap.

-----

## 🚀 Technologies Used

### Backend

  - **Java 21**
  - **Spring Boot 3.5.0**
  - **Spring Web**
  - **Spring Data JPA**
  - **PostgreSQL** (Driver)
  - **Maven**
  - **Lombok**

### Frontend

  - **React 18.2.0**
  - **Vite**
  - **Axios** (for HTTP requests)
  - **React Router DOM** (for routing)
  - **React Context API** (for global state management)
  - **Bootstrap** & **React-Bootstrap** (for styling and UI components)

-----

## 🛠️ Setup and Installation

To run this project, you will need to run both the backend and frontend servers separately.

### Prerequisites

  - **Java Development Kit (JDK)** - Version 21 or higher
  - **Apache Maven**
  - **Node.js and npm**
  - A running **PostgreSQL** database server

### 1\. Backend Setup

1.  **Clone the project:**

    ```bash
    git clone <repository-url>
    cd SpringEcom-12008e05cb5a602c8eba8a0a9e78b48464df988f
    ```

2.  **Configure the database:**

      - Open the `src/main/resources/application.properties` file.
      - Update the PostgreSQL connection details (URL, username, and password) to match your environment.

3.  **Run the application:**

      - Build and run the project using Maven.

    <!-- end list -->

    ```bash
    mvn spring-boot:run
    ```

      - The backend server will start on port **8080** by default.

### 2\. Frontend Setup

1.  **Navigate to the Frontend directory:**

    ```bash
    cd Frontend
    ```

2.  **Install dependencies:**

    ```bash
    npm install
    ```

3.  **Run the application:**

    ```bash
    npm run dev
    ```

      - The frontend development server will start on port **5173** by default.

4.  You can now access the application in your browser at `http://localhost:5173`.

-----

## ⚙️ API Endpoints

| HTTP Method | Endpoint Path                      | Description                                |
| :---------- | :--------------------------------- | :----------------------------------------- |
| `GET`       | `/api/products`                    | Fetches a list of all products.            |
| `GET`       | `/api/product/{id}`                | Fetches a single product by its ID.      |
| `GET`       | `/api/product/{id}/image`          | Fetches the image for a product.           |
| `GET`       | `/api/products/{keyword}`          | Searches for products by a keyword.        |
| `POST`      | `/api/product`                     | Adds a new product (multipart/form-data). |
| `PUT`       | `/api/product/{id}`                | Updates an existing product's details.  |
| `DELETE`    | `/api/product/{id}`                | Deletes a product.                         |

-----

## 📂 Project Structure (Core Components)

### Backend

  - **`ProductController.java`**: REST controller to handle product-related HTTP requests.
  - **`ProductService.java`**: Service layer that implements the application's business logic.
  - **`ProductRepo.java`**: Spring Data JPA repository for database interactions.
  - **`Product.java`**: The data model (Entity) for a product.
  - **`aop` (package)**: Contains aspects for logging, performance monitoring, and validation.

### Frontend

  - **`App.jsx`**: The root component that manages application routing.
  - **`Context.jsx`**: Manages global state like the shopping cart and product list using React Context.
  - **`Home.jsx`**: Renders the list of products.
  - **`Product.jsx`**: Displays a single product's details with options to edit, delete, or add to the cart.
  - **`Cart.jsx`**: Displays and manages the user's shopping cart.
  - **`AddProduct.jsx` / `UpdateProduct.jsx`**: Forms for creating and editing products.
  - **`Navbar.jsx`**: The main navigation bar, including search, category filter, and theme toggler.
