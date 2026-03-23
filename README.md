# Low-Level Design (LLD) Study Notes

This repository contains my personal notes and progress as I study **Design Principles and Patterns** in the context of Low-Level Design.

---

## 🏛️ SOLID Principles
The SOLID principles are a set of five design principles intended to make software designs more understandable, flexible, and maintainable.

| Principle | Name | Key Concept |
| :--- | :--- | :--- |
| **S** | **Single Responsibility** | One class, one reason to change. |
| **O** | **Open/Closed** | Open for extension, closed for modification. |
| **L** | **Liskov Substitution** | Subclasses must be substitutable for base classes. |
| **I** | **Interface Segregation** | Avoid forcing clients to implement unused methods. |
| **D** | **Dependency Inversion** | Depend on abstractions, not concretions. |

---

### 1. Single Responsibility Principle (SRP)
* A class should have **only one reason to change**.
* This means a class should have only one responsibility or one specific job within the system.

### 2. Open/Closed Principle (OCP)
* Software entities should be **open for extension but closed for modification**.
* New functionality should be added through inheritance or composition rather than by modifying existing, tested code.

### 3. Liskov Substitution Principle (LSP)
* Objects of a superclass should be **replaceable** with objects of its subclass without breaking the application.
* **Key takeaways:**
    * If class $B$ is a subtype of class $A$, then we should be able to replace $A$ with $B$ without breaking the behavior of the program.
    * Any implementation of an interface should be substitutable for another without breaking expected contracts.
    * A subclass should **extend** the capability of the parent class, not narrow it down.

### 4. Interface Segregation Principle (ISP)
* Interfaces should be designed such that the **client should not be forced to implement functions they do not need**.
* It is better to have multiple specific interfaces than one large, "fat" interface.

### 5. Dependency Inversion Principle (DIP)
* High-level components should not depend on low-level components directly.
* Instead, both should **depend on abstractions** (interfaces or abstract classes).

---

## 🎭 Behavioral Design Patterns
Behavioral patterns focus on how objects distribute work and how they communicate with one another. Instead of just focusing on how objects are structured, these patterns define the **flow of data and responsibility** between them.

---

### 🟢 Strategy Pattern
* Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
* **Key takeaways:**
  * It allows the algorithm to vary independently from the clients that use it.
  * Helps in avoiding a massive amount of conditional logic (if-else or switch cases) by delegating the task to a specific strategy object.
  * Promotes the **Open/Closed Principle** as new strategies can be added without modifying the existing context code.
  * Uses **composition** instead of inheritance to switch behaviors at runtime.
  * Useful when we have multiple ways to perform a task and want to choose the approach dynamically.

---

### 🖼️ Strategy Pattern UML Structure

```mermaid
classDiagram
    direction LR
    class Client {
        +Context context
    }
    class Context {
        -Strategy strategy
        +performOperation()
    }
    class Strategy {
        <<interface>>
        +execute()
    }
    class ConcreteStrategyA {
        +execute()
    }
    class ConcreteStrategyB {
        +execute()
    }

    Client --> Context
    Context --> Strategy : has-a
    ConcreteStrategyA ..|> Strategy : is-a
    ConcreteStrategyB ..|> Strategy : is-a
```
---

### 🔔 Observer Pattern
* Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
* It is a design pattern where an object (observer / publisher) maintains a list of dependents (observer) and automatically notifies dependants whenever there is change in state.
* **Key takeaways:**
  * **Subject & Observer:** The "Subject" (Observable) maintains a list of "Observers" and notifies them of any state changes.
  * **Loose Coupling:** The Subject doesn't need to know the specific details of the Observer classes; it only knows they implement a specific interface.
  * **Push vs. Pull:** Information can be "pushed" by the Subject to observers, or observers can "pull" the specific data they need after notification.
  * **Real-world Example:** A YouTube channel (Subject) notifying its subscribers (Observers) when a new video is uploaded.

---

### 🖼️ Observer Pattern UML Structure (Push Model)

```mermaid
classDiagram
    direction LR
    class ObservableData {
        +data1
        +data2
        +dataN
    }
    class Observable {
        <<interface>>
        +add(Observer)
        +remove(Observer)
        +notify()
        +setState()
    }
    class ConcreteObservable {
        -List~Observer~
        -ObservableData
        +add(Observer)
        +remove(Observer)
        +notify()
        +setState()
    }
    class Observer {
        <<interface>>
        +update(ObservableData)
    }
    class ConcreteObserver1 {
        +update(ObservableData)
    }
    class ConcreteObserver2 {
        +update(ObservableData)
    }

    ConcreteObservable --|> Observable : Is-a
    Observable --> Observer : has-a
    ConcreteObserver1 --|> Observer : Is-a
    ConcreteObserver2 --|> Observer : Is-a
    ObservableData <.. ConcreteObservable : uses
```
---
### 🖼️ Observer Pattern UML Structure (Pull Model)

```mermaid
classDiagram
    direction LR
    class Observable {
        <<interface>>
        +add(Observer)
        +remove(Observer)
        +notify()
        +setState()
    }
    class ConcreteObservable {
        -List~Observer~
        -ObservableData
        +add(Observer)
        +remove(Observer)
        +notify()
        +setState()
    }
    class Observer {
        <<interface>>
        +update()
    }
    class ConcreteObserver1 {
        -Observable obj
        +update()
    }
    class ConcreteObserver2 {
        -Observable obj
        +update()
    }

    ConcreteObservable --|> Observable : Is-a
    Observable --> Observer : has-a
    ConcreteObserver1 --|> Observer : Is-a
    ConcreteObserver2 --|> Observer : Is-a
    ConcreteObserver1 --> ConcreteObservable : has-a
    ConcreteObserver2 --> ConcreteObservable : has-a
```
---

## 🏗️ Structural Design Patterns
Structural patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient. They focus on how classes and objects are composed to form larger structures.

---

### 🟢 Decorator Pattern
* A structural pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
* Decorator pattern allows you to add new functionality to objects dynamically without altering the original structure.
* **Key takeaways:**
  * **Wrappers:** Often referred to as a "Wrapper" because it wraps the original object in a new object that adds functionality.
  * **Dynamic Extension:** Provides a flexible alternative to subclassing for extending functionality.
  * **Composition Over Inheritance:** Instead of creating a complex hierarchy of subclasses to cover every combination of features, you compose objects together.
  * **Interface Consistency:** The decorator implements the same interface as the object it decorates, so the client doesn't know the difference between the "plain" object and the "decorated" one.
  * **Example:** Adding toppings to a Pizza or adding features (GPS, Sunroof) to a Basic Car object.

---

### 🍕 The Problem: Without Decorator Pattern (Class Explosion)

When we try to handle multiple combinations using only inheritance, we run into a "Class Explosion." For every new feature or topping, we are forced to create a new class for every possible combination.

```mermaid
graph TD
    M[Margherita] --> C1[Margherita + Paneer + Mushroom]
    M --> C2[Margherita + Cheese]
    M --> C3[Margherita + Cheese + Mushroom]
    M --> C4[Margherita + Mushroom]
    M --> C5[Margherita + Paneer]
    M --> C6[Margherita + Cheese + Paneer]
    M --> C7[...]
    M --> C8[Margherita + Cheese + Paneer + Mushroom]

    style M fill:#f9f,stroke:#333,stroke-width:2px
```

**Key Takeaways:**
* **Class Explosion:** We are creating classes for all possible combinations.
* **Maintenance Nightmare:** If 1 new topping is introduced, we have to create a massive amount of new combination classes.
* **Violation of OCP:** Every time a new topping is added, we are essentially "modifying" our system's complexity rather than extending it cleanly.

### 🟢 Structural Pattern: Decorator Pattern
The **Decorator Pattern** allows you to attach new behaviors to objects dynamically by placing these objects inside special wrapper classes that contain the behaviors.

---

### 🍕 The Solution: With Decorator Pattern
Instead of "Class Explosion," we use **Composition** and **Inheritance** together to wrap a base object with any number of toppings.

```mermaid
classDiagram
    direction TB
    class BasePizza {
        <<abstract>>
        +cost() int
    }
    class Margherita {
        +cost() 100
    }
    class VegDelight {
        +cost() 150
    }
    class Farmhouse {
      +cost() 150
    }
    class ToppingDecorator {
        <<abstract>>
        -BasePizza pizza
        +cost() int
    }
    class ExtraCheese {
        -BasePizza pizza
        +cost() pizza.cost() + 20
    }
    class Mushroom {
        -BasePizza pizza
        +cost() pizza.cost() + 30
    }
    
    class Paneer {
        -BasePizza pizza
        +cost() pizza.cost() + 50
    }

    class Chicken {
      -BasePizza pizza
      +cost() pizza.cost() + 50
    }

    Margherita --|> BasePizza : is-a
    VegDelight --|> BasePizza : is-a
    Farmhouse --|> BasePizza : is-a
    ToppingDecorator --|> BasePizza : is-a
    ToppingDecorator o-- BasePizza : has-a (Wraps)
    ExtraCheese --|> ToppingDecorator : is-a
    Mushroom --|> ToppingDecorator : is-a
    Paneer --|> ToppingDecorator : is-a
    Chicken --|> ToppingDecorator : is-a
```

---

*Last Updated: March 2026*
