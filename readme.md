Activity Predictor Automation Framework
Overview

This project is a Selenium WebDriver automation framework developed to test the Activity Predictor Streamlit web application.

The framework follows industry-standard design patterns such as Page Object Model (POM) and Behavior Driven Development (BDD) using Cucumber. It supports configurable browser execution, detailed HTML reporting, Jenkins integration, reusable utilities, and maintainable test automation.

Technologies Used
Technology	Version
Java	17
Selenium WebDriver	4.x
Cucumber	7.x
JUnit 5	5.x
Maven	3.x
Extent Reports	5.x
SnakeYAML	Latest
WebDriverManager	Latest
Jenkins	CI/CD
Framework Architecture
src
│
├── main
│   ├── base
│   ├── config
│   ├── pages
│   ├── reporting
│   └── utils
│
├── test
│   ├── resources
│   │      ├── features
│   │      ├── config.yaml
│   │      └── cities.yaml
│   │
│   ├── runners
│   ├── stepdefinitions
│   └── hooks
│
└── test-output
Framework Features

✔ Page Object Model

✔ Cucumber BDD

✔ JUnit 5

✔ Maven Build

✔ Browser Configuration

✔ Custom WaitUtils

✔ YAML Test Data

✔ Smoke & Regression Tags

✔ Extent Reports

✔ Screenshot on Failure

✔ Jenkins Integration

✔ Negative Test Validation

✔ Thread-safe Reporting

Design Patterns Used
Page Object Model (POM)
Factory Pattern
Singleton Pattern
ThreadLocal Pattern
Utility Pattern
Utilities
WaitUtils
ScreenshotUtils
ConfigReader
DriverFactory
DriverManager
ReportManager
ExtentManager
Test Execution

Run all tests:

mvn clean test

Run Smoke Tests:

mvn clean test -Dtest=SmokeTestRunner

Run Regression Tests:

mvn clean test -Dtest=RegressionTestRunner
Reporting

After execution:

test-output/
    ExtentReport.html

The report contains:

Scenario execution status
Pass / Fail summary
Execution logs
Failure screenshots
Execution duration
Jenkins Integration

The framework supports Jenkins CI execution.

Typical pipeline:

GitHub
      ↓
Jenkins
      ↓
Maven Build
      ↓
Execute Tests
      ↓
Extent Report
      ↓
Archive Reports
Sample Test Scenarios
Positive
Enter Dublin
Verify weather information
Verify activity suggestion
Negative
Enter InvalidCity
Verify error message:
Failed to fetch weather data
Future Enhancements
Parallel Execution
Cross-browser execution
Docker integration
GitHub Actions
Cloud execution using Selenium Grid
Author

Sunil Dutt
Senior Software Test / Automation / AI Engineer
M.Sc. Artificial Intelligence
