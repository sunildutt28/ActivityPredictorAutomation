# Activity Predictor Automation Framework

## Overview

This project is a Selenium automation framework developed using Java, Maven, JUnit 5, and Cucumber to automate testing of the Activity Predictor web application.

The application under test is a Streamlit-based AI application that suggests outdoor and indoor activities based on weather conditions.

## Technologies

- Java 17
- Selenium WebDriver
- Maven
- JUnit 5
- Cucumber BDD
- WebDriverManager
- IntelliJ IDEA
- Git & GitHub

## Framework Design

- Page Object Model (POM)
- BasePage
- BaseTest
- DriverFactory
- DriverManager
- ConfigReader
- WaitUtils

## Project Structure

src/
├── main/java
│   ├── base
│   ├── config
│   ├── pages
│   └── utils
│
└── test/java
├── tests
├── runners
└── stepdefinitions

## Current Features

- Launch browser
- Enter city
- Generate activity suggestion
- Verify suggestion
- Cucumber BDD scenarios

## Future Improvements

- Screenshots on failure
- HTML Reports
- Jenkins CI
- Parallel execution
- Data-driven testing