# Open/Closed Principle (OCP)

**Definition:**  
A class should be **open for extension** but **closed for modification**.  
You should be able to add new functionality **without changing existing code**.

---

## ❌ Bad Example

A single `TaxCalculatorBad` class handles all countries:

* `TaxCalculatorBad` → has a single method `calculateTax(country, income)` that uses conditional statements for each country.

### Problems

* Adding a new country requires **modifying `TaxCalculatorBad`**, risking bugs.
* Violates OCP — not closed for modification.
* Hard to test or extend.

---

## ✅ Good Example

We separate responsibilities using an interface and concrete implementations:

* `TaxCalculator` → interface defining `calculateTax`.
* `IndiaTaxCalculator` → calculates tax for India.
* `USTaxCalculator` → calculates tax for US.
* `Main` → client code uses `TaxCalculator` interface without knowing the concrete class.

### Benefits

* Each class has **a single responsibility**.
* Adding a new country = **just create a new class** implementing the interface.
* Existing code does **not need modification**.
* Easy to test and extend.

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

## 🔑 Takeaway

**Bad:** One class handles all cases → tightly coupled, not extensible.
**Good:** Interface + separate classes → open for extension, closed for modification, easy to maintain.