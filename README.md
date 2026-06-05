# DemoBlazAutomationProject

## Overview

This project is a Selenium WebDriver automation framework developed for testing the DemoBlaze E-Commerce website.

The framework validates critical user workflows including authentication and shopping cart operations using Java, TestNG, Maven, and the Page Object Model (POM) design pattern.

---

## Technologies Used

* Java 17
* Selenium WebDriver 4
* TestNG
* Maven
* WebDriverManager
* Chrome Browser
* Page Object Model (POM)

---

## Project Structure

```text
src/main/java
│
└── pages
    ├── RegisterPage.java
    ├── LoginPage.java
    ├── LogoutPage.java
    └── ProductPage.java

src/test/java
│
├── base
│   └── BaseTest.java
│
├── utils
│   └── TestData.java
│
└── tests
    ├── TC01_RegisterAndLoginTest.java
    ├── TC02_InvalidLoginTest.java
    ├── TC03_LogoutTest.java
    ├── TC04_AddToCartTest.java
    └── TC05_DeleteFromCartTest.java
```

---

## Automated Test Cases

| TC ID | Test Case                            |
| ----- | ------------------------------------ |
| TC_01 | Register and Login with Dynamic User |
| TC_02 | Login with Invalid Password          |
| TC_03 | Logout After Successful Login        |
| TC_04 | Add Product to Cart                  |
| TC_05 | Delete Product from Cart             |

---

## Test Coverage

### Authentication Module

* User Registration
* User Login
* Invalid Login Validation
* User Logout

### Cart Module

* Add Product to Cart
* Delete Product from Cart
* Cart Verification

---

## Dynamic Test Data

The framework generates a unique username during execution:

```java
"user" + System.currentTimeMillis()
```

This approach prevents duplicate registration failures and improves test reusability.

---

## Assertions Used

* Verify registration success alert
* Verify logged-in username visibility
* Verify invalid login alert message
* Verify logout functionality
* Verify product existence in cart
* Verify product deletion from cart

---

## Execution Results

| Module         | Test Cases |
| -------------- | ---------- |
| Authentication | 3          |
| Cart           | 2          |
| Total          | 5          |

Expected Pass Rate: **100%**

---

## Key Features

* Page Object Model (POM)
* Dynamic Test Data Generation
* Alert Handling
* Reusable Components
* Independent Test Cases
* Maven Project Structure

---

## Author

Ahmad Basheer

QA Automation Testing Project
