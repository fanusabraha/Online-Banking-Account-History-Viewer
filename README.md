# README: Online Banking Account History Viewer

## Overview

This assignment involves creating an online banking account history viewer. The application will display a list of transactions and provide a detailed view for individual transactions. You'll leverage the existing `TransactionRepository` to populate transaction data and implement two web pages:

1. **Transactions List**: Displays all transactions in ascending order by date.  
2. **Transaction Detail**: Displays detailed information for a selected transaction.

## Package Naming  
Please note that the package naming includes a typo, and you must follow this convention:
`com.codercampus.[insert_whatever_packages_you_like_here]`

## Assignment Steps  

### 1. **Clone the Repository**
   Clone the GitHub repository:  
   [Assignment Repository](https://github.com/tp02ga/java-bootcamp/tree/week15-11/Assignment11)  
   The `TransactionRepository` is preconfigured to populate a list of 100 transactions on startup.

### 2. **Set Up the Application**
   - Create a `Controller` to manage the `/transactions` and `/transactions/{transactionId}` endpoints.
   - Configure the `transactions.html` view to display transaction data.

### 3. **Build the Features**
#### a) **Transactions List View**
   - URL: `http://localhost:8080/transactions`
   - Display all transactions in ascending order by date.
   - Make each transaction ID clickable, linking to the transaction detail view.

#### b) **Transaction Detail View**
   - URL: `http://localhost:8080/transactions/{transactionId}`
   - Display detailed information about the selected transaction.

### 4. **Ensure Proper Design**
   Use proper design principles:
   - **Controller**: Handles HTTP requests and prepares data for views.
   - **Service**: Contains business logic (e.g., sorting and filtering transactions).
   - **Repository**: Manages data access and retrieval.

## Sample Output  

### Transactions List Page
- Lists all transactions in ascending order by date.
- Each transaction ID links to its detail view.

### Transaction Detail Page
- Shows detailed information for a specific transaction.

---

## What You Will Learn  
1. **Spring Boot Basics**  
   - Implementing Controllers, Services, and Repositories.
   - Handling HTTP endpoints and dynamic routing.

2. **HTML Integration**  
   - Creating dynamic HTML pages using Thymeleaf.

3. **Sorting and Filtering**  
   - Sorting a list of objects by a specific property (date).  

4. **Design Principles**  
   - Properly structuring applications with MVC architecture.

## Skills Gained  
- Building a dynamic web application.  
- Implementing navigation between pages.  
- Structuring backend logic for scalability and maintainability.  

## Next Steps  
Once completed, boot up the application and test the functionality. Ensure that both URLs behave as expected and display the correct data.
