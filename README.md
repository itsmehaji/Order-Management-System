# Order Management System (Java)

A mini backend simulation project demonstrating core Java, Object-Oriented Programming (OOP), Collections Framework, Exception Handling, and Design Patterns.

## Project Overview

This project models a simplified Order Management System similar to real-world e-commerce backend workflows.  
It handles product inventory, order creation, stock validation, checkout processing, and payment strategies.

---

## Key Features

• User, Product, Order, and Inventory domain modelling  
• Inventory management with stock validation  
• Order lifecycle management (CREATED → PAID)  
• Business rule enforcement using custom exceptions  
• Strategy Pattern implementation for payment methods  

---

## Concepts Demonstrated

• Object-Oriented Programming (Encapsulation, Composition, Abstraction)  
• Java Collections Framework (Map, List)  
• Custom Exception Design  
• Defensive Programming  
• Strategy Design Pattern  
• Service-layer Architecture  

---

## Project Structure
• model/ → Domain Models (User, Product, Order, etc.)
• services/ → Business Logic (OrderService, InventoryService)
• payment/ → Payment Strategies
• Exceptions/ → Custom Exceptions
• Main.java → Simulation Entry Point


---

## Workflow Simulation

The system supports:

1. Product creation  
2. Stock addition
3. User creation
4. Order creation
5. Adding items
6. Inventory validation
7. Payment processing
8. Stock deduction
9. Order status update  

---

## How to Run

Compile:

```terminal
javac Main.java
```
Run:
```terminal
java Main
```
---

## Payment Strategies Implemented
• UPI Payment
• Credit Card Payment
(Easily extendable)

---

## Learning Objectives
# This project was built to strengthen:

✔ Java & OOP fundamentals
✔ Backend system thinking
✔ Business logic modelling
✔ Clean code practices
✔ Industry-style architecture

---

## Future Enhancements 
• Database integration (JDBC / JPA)
• REST API (Spring Boot)
• Order persistence
• Logging framework
• Unit testing

---

## 👨‍💻 Author
# Mohammad Haji
