# Selenium Automation Suite

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7300?style=for-the-badge&logo=testng&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
![Apache POI](https://img.shields.io/badge/Apache%20POI-231F20?style=for-the-badge&logo=apache&logoColor=white)

---

## Project Overview

Selenium Automation Suite is a comprehensive modular testing framework designed to automate UI and backend testing for web applications. It integrates **Cucumber**, **JUnit**, **TestNG**, and **Selenium** to facilitate Behavior Driven Development (BDD), end-to-end testing, and parallel test execution.

---

## Project Structure
```
selenium-automation-suite/
│
├── .idea/                              # IntelliJ IDEA project files
├── common/                             # Shared utility modules
│
├── cucumber-projects/                  # Cucumber-based projects
│   └── parabank-cucumber-tests/        # ParaBank Cucumber tests
│       ├── src/                        # Source code
│       ├── target/                     # Build output
│       └── pom.xml                     # Maven configuration file
│
├── junit-projects/                     # JUnit-based projects
│   ├── demowebshop-e2e-tests/          # DemoWebShop end-to-end tests
│   ├── itera-tests/                    # Itera test scenarios
│   ├── itera-tests-xpath/              # XPath-based Itera tests
│   └── shopdemo-e2e-tests/             # ShopDemo tests
│       └── pom.xml                     # Maven configuration file
│
├── testng-projects/                    # TestNG-based projects
│   ├── demowebshop-e2e-tests-testng/   # TestNG DemoWebShop tests
│   └── nopcommerce-admin-testng/       # NopCommerce admin tests
│       ├── src/                        # Source code
│       ├── target/                     # Build output
│       └── pom.xml                     # Maven configuration file
│
├── .gitignore                          # Git ignore file
└── pom.xml                             # Parent Maven configuration file
```

---

## Projects
### 1. Cucumber Projects
**parabank-cucumber-tests**
- Automated test suite for the ParaBank application.
- Utilizes Cucumber, Selenium, and TestNG.
- Includes feature files and step definitions in `src/test/java`.

### 2. JUnit Projects
- **demowebshop-e2e-tests** – End-to-end tests for DemoWebShop.
- **itera-tests** – Itera test scenarios.
- **itera-tests-xpath** – XPath-based Itera tests.
- **shopdemo-e2e-tests** – End-to-end tests for ShopDemo application.

### 3. TestNG Projects
- **demowebshop-e2e-tests-testng** – TestNG tests for DemoWebShop.
- **nopcommerce-admin-testng** – Admin panel tests for NopCommerce.

---

## Installation
### Clone the Repository
```bash
git clone https://github.com/username/selenium-automation-suite.git
cd selenium-automation-suite
```

### Open in IntelliJ IDEA
1. **File -> New -> Project from Existing Sources**
2. Select the `pom.xml` file. Maven will automatically import dependencies.

---

## Dependencies
Main dependencies required for the project:
- **Selenium** – UI automation
- **Cucumber** – BDD testing
- **TestNG** – Test organization and execution
- **JUnit** – Unit testing framework
- **Extent Reports** – HTML and PDF test reports
- **Apache POI** – Excel file processing
- **Commons IO** – File handling utilities

Dependencies are managed via the `pom.xml` file in each module.

---

## Running Tests
### Run All Tests
```bash
mvn clean test
```

### Run Specific Module
```bash
cd cucumber-projects/parabank-cucumber-tests
mvn clean test
```

### Run with Profiles
```bash
mvn clean test -PRegression
```

---

## Reporting
- Test reports are generated in the `test-output` and `testReports` folders.
- HTML reports are located in `SparkReport`.
- PDF reports are generated as `PdfReport.pdf`.

---

## Contributing
Contributions are welcome!
1. Fork the repository.
2. Create a new branch:
```bash
git checkout -b new-feature
```
3. Commit your changes:
```bash
git commit -m "Add new feature"
```
4. Push to the branch:
```bash
git push origin new-feature
```
5. Open a Pull Request.

---

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact
For any inquiries or issues, please open an issue in this repository.

