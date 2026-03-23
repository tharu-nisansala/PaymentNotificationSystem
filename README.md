# 💳 Payment Notification System

This is a simple Java-based Command Line Interface (CLI) application developed to demonstrate the use of **Design Patterns** in software engineering.

## Project Overview

The system allows users to process payments using different payment methods such as:

- PayPal
- Bank Transfer

It uses **Adapter Pattern** to handle different payment systems through a common interface and **Singleton Pattern** to ensure a single instance of the payment controller.

---

## Features

- Menu-driven CLI interface
- Process PayPal and Bank Transfer payments
- Input validation for payment amount
- View payment history
- Uses design patterns for better structure

---

## Design Patterns Used

### 🔹 Singleton Pattern
- Implemented in `PaymentSystem` class
- Ensures only one instance of the system exists

### 🔹 Adapter Pattern
- Implemented using:
  - `PayPalAdapter`
  - `BankAdapter`
- Converts different payment methods into a common interface (`PaymentProcessor`)

---

## Technologies Used

- Java
- Apache NetBeans
- Java Standard Library

---

## How to Run

1. Open the project in NetBeans
2. Run the `Main.java` file
3. Use the menu to:
   - Select payment method
   - Enter amount
   - View payment history

---

## Learning Outcome

- Understanding of Adapter and Singleton design patterns
- Practical implementation of Object-Oriented Programming concepts
- Building a simple CLI-based application

---

## Author

**Tharushi Nisansala**  
ICT Undergraduate  

---
