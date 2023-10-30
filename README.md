# INT202-middleExam

---

## Overview
This is a Java-based web application designed as a middle exam project. The application features a simple user registration system and a prime number checker.

## Features
- **User Registration**: Allows users to register with a username and email.
- **Prime Number Checker**: Checks if a given number is prime or not.

## Project Structure
- **Servlets**
  - [HelloServlet](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/HelloServlet.java): Displays "Hello World!"
  - [PrimeCheckerServlet](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/servlet/PrimeCheckerServlet.java): Checks if a number is prime.
  - [RegisterServlet](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/servlet/RegisterServlet.java): Handles user registration.
  
- **Models**
  - [Result](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/models/Result.java): Holds information about a number and its primality.
  - [ResultList](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/models/ResultList.java): Holds a list of `Result` objects.
  - [User](https://github.com/LynchzDEV/INT202-middleExam/blob/main/src/main/java/com/jinnawat/mid_exam_008/models/User.java): Holds user information.

## How to Run
1. Clone the repository.
2. Open the project in your preferred IDE.
3. Run the server.
4. Access the application through `http://localhost:8080`.
