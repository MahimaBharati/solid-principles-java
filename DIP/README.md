# Dependency Inversion Principle (DIP)

**Definition:**  
High-level modules should **not depend on low-level modules**.  
**Both should depend on abstractions.**  
**Abstractions should not depend on details; details should depend on abstractions.**

---

## ❌ Bad Example

In the bad design:

* `RecommendationService` (high-level module) depends directly on concrete classes:  
  - `TrendingRecommendation`  
  - `GenreRecommendation`  
  - `RecentRecommendation`  

* Adding a new recommendation (e.g., `CollaborativeRecommendation`) requires **modifying `RecommendationService`**.  
* Clients using the service may be disrupted by these changes.  

**Outline:**

```text
RecommendationService --> TrendingRecommendation
                       --> GenreRecommendation
                       --> RecentRecommendation
```
## Problems

* High-level module tightly coupled to low-level details.

* Hard to extend and maintain.

* Violates DIP and Open/Closed Principle.

## ✅ Good Example

* Introduce an abstraction (RecommendationStrategy) and make both high-level and low-level modules depend on it:

* RecommendationAlgorithm → defines recommend() method

* Low-level modules (TrendingRecommendation, GenreRecommendation, RecentRecommendation) implement the interface

* RecommendationService depends only on RecommendationStrategy (via constructor injection)

**Outline:**
```text
RecommendationService --> RecommendationStrategy <-- TrendingRecommendation
                                              <-- GenreRecommendation
                                              <-- RecentRecommendation
```

### Benefits

* High-level module no longer depends on concrete classes.

* New algorithms can be added without modifying RecommendationService.

* Client code is stable, flexible, and testable.

* Details (low-level) now depend on the abstraction, fulfilling DIP.

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
Showing trending recommendations...
Showing genre-based recommendations...
Showing recent recommendations...
```

## 🔑 Takeaway

**Bad:** High-level modules depend on low-level details → fragile, hard to extend.

**Good:** High-level and low-level modules depend on abstractions → flexible, maintainable, and testable.