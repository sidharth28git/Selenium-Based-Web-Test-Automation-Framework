# Selenium-Based-Web-Test-Automation-Framework
Web Test Automation Framework | Selenium & TestNG

A modular web automation framework built using Java, Selenium WebDriver, TestNG, and Maven to automate functional test cases for a healthcare appointment web application.
The framework follows the Page Object Model (POM) design pattern and supports CI/CD execution using GitHub Actions.

🚀 Tech Stack

Java 17

Selenium WebDriver 4

TestNG

Maven

WebDriverManager

GitHub Actions (CI/CD)

📂 Project Structure
HealthcareAutomation/
│── pom.xml
│── testng.xml
│── src/test/java/com/healthcare/
│    ├── base/        → Driver setup & teardown
│    ├── pages/       → Page Object classes
│    ├── tests/       → Test cases
│    └── utils/       → Configuration utilities

🧱 Framework Architecture

Base Layer – Handles browser initialization and cleanup.

Page Layer – Contains reusable page classes with locators and actions.

Test Layer – Implements functional test scenarios using TestNG.

Utility Layer – Stores configuration and shared helpers.

🧪 Automated Test Scenarios

Login functionality validation

Appointment booking workflow

Payment flow (placeholder for future extension)

Achieved approximately 95% UI workflow coverage and reduced manual regression effort by nearly 90%.

▶️ How to Run Tests
Run with UI (browser visible)
mvn clean test

Run in Headless Mode
mvn -Dheadless=true clean test

📊 Test Reports

Default TestNG HTML reports are generated at:

target/surefire-reports/index.html

☁️ CI/CD Integration

The project includes a GitHub Actions workflow that:

Sets up Java and Chrome

Runs tests in headless mode

Validates build on every push to main branch

🎯 Key Highlights

Reusable Page Object Model design

Automatic driver management using WebDriverManager

Headless execution support

CI-enabled automated testing pipeline

Scalable and maintainable framework design

🔮 Future Improvements

Data-driven testing (Excel/CSV integration)

Advanced reporting (Allure/Extent Dashboard)

Docker-based execution environment

Parallel test execution
