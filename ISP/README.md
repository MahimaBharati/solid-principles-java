# Interface Segregation Principle (ISP)

**Definition:**  
Clients should **not be forced to depend on methods they do not use**.  
Instead of one large interface, create **smaller, role-specific interfaces**.

---

## ❌ Bad Example

In the bad design, a single `UserActions` interface includes both rider and driver responsibilities:

* `bookRide()` and `payRide()`→ meant for Rider  
* `acceptRide()` and `drive()`→ meant for Driver  

Classes that implement this interface are forced to handle irrelevant methods.  
For example, `Rider` ends up with a meaningless `acceptRide()` implementation.

### Problems

* Forces classes to implement methods they don’t need.  
* Leads to dummy code or `UnsupportedOperationException`.  
* Violates **ISP**.

---

## ✅ Good Example

We split the big interface into **role-specific interfaces**:

* `RiderActions` → only `bookRide()` and `payRide()`  
* `DriverActions` → only `acceptRide()` and `drive()`

Classes now implement only the interface relevant to their role:

* `Rider` implements `RiderActions`  
* `Driver` implements `DriverActions`

### Benefits

* No unnecessary methods.  
* Each class depends only on what it needs.  
* Cleaner, role-specific, and maintainable design.  

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

**Bad:** One large interface couples unrelated responsibilities.

**Good:** Smaller, focused interfaces → flexible and clean design.
