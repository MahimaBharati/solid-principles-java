# Single Responsibility Principle (SRP)

**Definition:**
A class should have **only one reason to change**, meaning it should only have **one job or responsibility**.

---

## ❌ Bad Example

In the bad design, a single `Report` class handles:

* Creating report content
* Generating the report output
* Saving it to storage
* Sending it via email

```java
class Report {
    String title;
    String content;

    public void generate() { ... }
    public void save() { ... }
    public void send(String email) { ... }
}
```

### Problems

* Multiple responsibilities are coupled together.
* Any change in saving (e.g., DB → file) or sending (e.g., email → Slack) forces changes to `Report`.
* Harder to test each piece in isolation.
* Violates SRP.

---

## ✅ Good Example

We separate responsibilities into different classes:

* `Report` → only holds data (title, content).
* `ReportGenerator` → generates the report.
* `ReportSaver` → handles saving to storage.
* `ReportSender` → handles sending via email.

```java
public class Report {
    private String title;
    private String content;
    // getters and constructor
}

class ReportGenerator { ... }
class ReportSaver { ... }
class ReportSender { ... }
```

### Benefits

* Each class has **a single responsibility**.
* Easier to extend (e.g., add `PdfReportSaver`, `SlackReportSender`).
* Changes in one area don’t affect others.
* Unit tests can be written per class.

---

## ▶️ How to Run

1. Compile all classes:

```bash
javac *.java
```

2. Run the program:

```bash
java Main
```

3. Output:

```
Generating report: Monthly Report
This is the content of monthly report.
Saving report: Monthly Report
Sending report: Monthly Report to: mahima@gmail.com
```

---

## 🔑 Takeaway

**Bad:** One class with many responsibilities → tightly coupled.
**Good:** Divide responsibilities → flexible, testable, maintainable.

---
