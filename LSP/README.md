# Liskov Substitution Principle (LSP)

**Definition:**  
Subtypes must be **substitutable for their base types**. In other words, **objects of a subclass should be usable wherever the parent class or interface is expected without breaking the behavior**.

---

## ❌ Bad Example

In the bad design, `VIPFreeShipping` **extends `ShippingService`** but cannot handle all shipping scenarios:

```java
ShippingService standard = new ShippingService();
ShippingService vip = new VIPFreeShipping();

standard.calculateCost();      // works
vip.calculateCost();           // throws UnsupportedOperationException for some cases
```
### Problems

* Subclass breaks the base class contract.

* Client code cannot safely use VIPFreeShipping wherever ShippingService is expected.

* Violates LSP.

* We fix the design by separating classes that cannot fully honor the base contract:

* ShippingService → interface or base class for all full-featured shipping types.

* StandardShipping → supports all destinations.

* ExpressShipping → supports all destinations, faster delivery.

* VIPFreeShipping → separate class, only handles domestic free shipping.

```java
ShippingService standard = new StandardShipping();
ShippingService express = new ExpressShipping();
VIPFreeShipping vip = new VIPFreeShipping();

standard.calculateCost();    // works for all destinations
express.calculateCost();     // works for all destinations
vip.calculateCost();         // returns 0, does not break ShippingService contract
```
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
**Bad:** Subclass (VIPFreeShipping) breaks parent expectations → violates LSP.

**Good:** Subclass hierarchy respects base contract, or “special cases” are separate classes → safe, maintainable, and extensible design.