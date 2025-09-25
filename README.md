---

## 📘 README.md – Selenium Data-Driven Test Framework (Java + TestNG + POI)

---

### 📌 Overview

This is a **Data-Driven Selenium Test Automation Framework** using:

* **Java**
* **TestNG**
* **Selenium WebDriver**
* **Apache POI** (for Excel data)
* **Page Object Model (POM)** design pattern

It automates **user registration flow** using data from an Excel file.

---

### ✅ Core Features

* Data-driven testing with Excel
* Configurable browser and URL
* Page Object Model (POM) for maintainability
* Clean separation of test logic, config, and data
* Supports Chrome, Firefox, Edge, Safari

---

### ⚙️ Technology Stack

| Component      | Used Tool          |
| -------------- | ------------------ |
| Language       | Java               |
| Test Framework | TestNG             |
| Browser Driver | Selenium WebDriver |
| Data Handling  | Apache POI (Excel) |
| Build Tool     | Maven (optional)   |

---

### 📁 Folder Structure (Explained)

**1. `com.data.driven.pages`**
Contains POM-based page classes like `RegisterPage.java`

**2. `com.data.driven.tests`**
TestNG test classes like `RegisterTest.java`

**3. `com.data.driven.utils`**
Utility classes:

* `ExcelReader.java`: Reads Excel data
* `ConfigReader.java`: Reads config properties
* `DriverManager.java`: Initializes WebDriver

**4. `com.data.driven.base`**

* `BaseTest.java`: Sets up and tears down WebDriver for all tests

**5. `resources/`**

* `config.properties`: Configuration file
* `RegisterData.xlsx`: Excel file with user registration data

**6. `testng.xml`**
Defines the TestNG test suite and classes to run

---

### 🔧 Prerequisites

* JDK 8 or higher
* Maven (optional, for dependency management)
* Chrome / Firefox / Edge browser
* IDE (e.g., IntelliJ, Eclipse)

---

### 📦 Dependencies (Add to `pom.xml` if using Maven)

```xml
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.18.1</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.9.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Apache POI (Excel) -->
    <dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.3</version>
    </dependency>
</dependencies>
```

---

### 📝 Configuration File: `config.properties`

Located at: `src/test/resources/config.properties`

```properties
browser=chrome
baseUrl=https://tutorialsninja.com/demo/index.php?route=account/register
implicitWait=10
```

---

### 📄 Test Data File: `RegisterData.xlsx`

Located at: `src/test/resources/RegisterData.xlsx`

Example format:

| FirstName | LastName | Email                                       | Telephone | Password | ConfirmPassword |
| --------- | -------- | ------------------------------------------- | --------- | -------- | --------------- |
| John      | Doe      | [john@example.com](mailto:john@example.com) | 123456789 | Pass@123 | Pass@123        |
| Jane      | Smith    | [jane@example.com](mailto:jane@example.com) | 987654321 | Pass@456 | Pass@456        |

---

### 🧪 Test Class: `RegisterTest.java`

Uses `@DataProvider` to read Excel data and run the registration test with different sets of user input.

Key test steps:

1. Launch browser
2. Open registration page
3. Fill form using Excel data
4. Submit the form

---

### 🧠 Utility Classes

**1. `ExcelReader`**

* Reads data from Excel file using Apache POI
* Returns it as `Object[][]` to use in `@DataProvider`

**2. `ConfigReader`**

* Loads properties from `config.properties`

**3. `DriverManager`**

* Initializes browser WebDriver (Chrome, Firefox, Edge, Safari)

---

### 🧱 Base Class: `BaseTest.java`

Responsible for:

* Launching the browser (based on config)
* Navigating to base URL
* Applying implicit waits
* Quitting browser after test

---

### 📜 TestNG XML File: `testng.xml`

Located at: project root

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="DataDrivenTestSuite">
    <test name="UserRegistrationTest">
        <classes>
            <class name="com.data.driven.tests.RegisterTest"/>
        </classes>
    </test>
</suite>
```

---

### ▶️ How to Run Tests

**Option 1: Using IDE**

* Right-click `testng.xml` → **Run as TestNG Suite**

**Option 2: Using Maven**

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

### ✅ Expected Test Flow

1. Read config (browser, URL)
2. Launch browser
3. Open registration page
4. Read user data from Excel
5. Enter form details
6. Submit the form
7. Repeat for all Excel rows

---

### 🚀 Future Enhancements

* Add **assertions** to validate success messages
* Add **reporting** (Extent Reports / Allure)
* Add **logging** using Log4j or SLF4J
* Add support for **cross-browser parallel testing**
* Integrate with **CI/CD tools** like GitHub Actions or Jenkins
* Add support for **headless execution**

---

### 👨‍💻 Author - Vijay Krishna

Created as an educational data-driven automation framework using Java, Selenium, TestNG, and Excel.

Feel free to contribute, fork, or enhance as needed.

---

### 📄 License

Free to use and modify for personal or commercial use.

---
