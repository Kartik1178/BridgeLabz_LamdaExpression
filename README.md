# User Registration Validation – Lambda Expressions (UC1–UC13)

## 📌 Project Description
This project implements a User Registration Validation System using Java Lambda Expressions, Custom Exceptions, JUnit Tests, and GitFlow branching.  
Each Use Case (UC1–UC13) is developed in its own feature branch and merged into the develop branch.

---

## 🌿 GitFlow Branch Strategy
- master → empty production branch
- develop → integrated working code
- feature/* → one branch per use case

---

## 🚀 Use Cases and Branch Explanations

### UC1 – First Name Validation  
**Branch:** feature/UC1-ValidFirstName  
Validates first name should start with a capital letter and have minimum 3 characters.

### UC2 – Last Name Validation  
**Branch:** feature/UC2-ValidLastName  
Validates last name should start with a capital letter and have minimum 3 characters.

### UC3 – Email Validation  
**Branch:** feature/UC3-ValidEmail  
Validates email format like `abc.xyz@bl.co.in` with correct mandatory and optional parts.

### UC4 – Mobile Number Format  
**Branch:** feature/UC4-MobileFormat  
Validates mobile number format: `CountryCode space 10-digit-number` (e.g., `91 9919819801`).

### UC5 – Password Rule 1  
**Branch:** feature/UC5-PasswordRule1  
Password must contain minimum 8 characters.

### UC6 – Password Rule 2  
**Branch:** feature/UC6-PasswordUppercase  
Password must contain at least one uppercase letter.

### UC7 – Password Rule 3  
**Branch:** feature/UC7-PasswordNumber  
Password must contain at least one numeric digit.

### UC8 – Password Rule 4  
**Branch:** feature/UC8-PasswordSpecialChar  
Password must contain exactly one special character.

### UC9 – Email Samples Validation  
**Branch:** feature/UC9-EmailSamplesValidation  
Validates multiple valid and invalid email samples using regex rules.

### UC10 – JUnit Tests  
**Branch:** feature/UC10-JUnitTests  
Adds JUnit happy and sad test cases for all validations (name, email, mobile, password).

### UC11 – Parameterized Email Tests  
**Branch:** feature/UC11-ParameterizedEmailTests  
Uses JUnit Parameterized Tests to validate multiple email inputs efficiently.

### UC12 – Custom Exceptions  
**Branch:** feature/UC12-CustomExceptions  
Refactors validation logic to throw `InvalidUserDetailsException` for invalid inputs instead of returning false.

### UC13 – Lambda Functional Interface Refactor  
**Branch:** feature/UC13-LambdaFunctionalRefactor  
Introduces a custom functional interface and implements all validations using lambda expressions.

---

## 🧪 Testing
- JUnit 5 is used for unit testing
- Includes both normal and parameterized test cases
- Invalid inputs throw custom exceptions

---

## 🛠 Technologies Used
- Java 8 (Lambda Expressions)
- Maven
- JUnit 5
- Git & GitFlow

---

## 📂 Final Branch Flow
