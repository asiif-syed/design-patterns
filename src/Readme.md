# Design patterns with Java

Resources for quick refresher
- https://refactoring.guru/design-patterns/behavioral-patterns

## Creational Design Patterns
- Creational design patterns are a category of design patterns that focus on the process of object creation. 
- They aim to provide mechanisms for creating objects in a manner suitable to the situation, allowing for more flexibility and reuse of code. 
- Here are the most common creational design patterns:
### 1. Singleton Pattern
- Purpose: Ensures a class has only one instance and provides a global point of access to it.
- Use Case: Useful when exactly one object is needed to coordinate actions across the system, such as configuration settings or logging.

### 2. Factory Method Pattern
- Purpose: Defines an interface for creating an object but allows subclasses to alter the type of created objects. 
- Use Case: Useful when a class cannot anticipate the type of objects it needs to create. For example, a GUI framework that creates buttons based on the operating system.

### 3. Abstract Factory Pattern
- Purpose: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- Use Case: Useful when the system needs to be independent of how its objects are created, composed, and represented, such as creating UI elements that vary based on the theme.

### 4. Builder Pattern
- Purpose: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
- Use Case: Useful when an object needs to be created step by step or when the construction process must allow different representations, such as building a complex document (HTML, XML, etc.).

### 5. Prototype Pattern
- Purpose: Creates new objects by copying an existing object, known as the prototype.
- Use Case: Useful when the cost of creating a new instance of an object is more expensive than copying an existing instance, such as when working with large objects.


## Structural Design Patterns
- Structural design patterns are a category of design patterns that deal with the composition of classes and objects. 
- They help ensure that if one part of a system changes, the entire system doesn’t need to change as well. 
- These patterns facilitate the formation of large, complex structures while keeping the system flexible and efficient. 
- Here are some of the most common structural design patterns:
### 1. Adapter Pattern
- Purpose: Allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.
- Use Case: Useful when you want to use an existing class but its interface does not match the one you need. For example, integrating a legacy system with a new application.
### 2. Bridge Pattern
- Purpose: Separates an abstraction from its implementation so that the two can vary independently.
- Use Case: Useful when both the abstraction and the implementation should be extensible independently, such as different shapes that can be rendered in various styles.
### 3. Composite Pattern
- Purpose: Composes objects into tree structures to represent part-whole hierarchies. Clients can treat individual objects and compositions uniformly.
- Use Case: Useful for representing hierarchies of objects, such as graphical user interfaces (GUI) where a window can contain buttons, text fields, and other windows.
### 4. Decorator Pattern
- Purpose: Adds behavior or responsibilities to individual objects dynamically without affecting the behavior of other objects from the same class.
- Use Case: Useful when you want to add functionality to objects at runtime, such as adding scrollbars to windows or adding features to a coffee order.
### 5. Facade Pattern
- Purpose: Provides a simplified interface to a complex subsystem of classes, making it easier to use.
- Use Case: Useful when you want to provide a simple interface for a complex system, such as providing a single interface for a set of APIs.
### 6. Flyweight Pattern
- Purpose: Reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of the state among them.
- Use Case: Useful in situations where you have a large number of objects that share common data, like in a text editor where many characters may share the same font and size.
### 7. Proxy Pattern
- Purpose: Provides a surrogate or placeholder for another object to control access to it.
- Use Case: Useful when you need to add a layer of control over accessing an object, such as lazy loading, access control, or logging.


## Behavioural Design Patterns

- Behavioral design patterns are concerned with the interaction and responsibility between objects. 
- These patterns provide solutions for better interaction, communication, and assignment of responsibilities between classes or objects. 
- They make it easier to define how objects communicate in a flexible and efficient way.
- Here is a list of all the behavioral design patterns:

### 1. Chain of Responsibility
- Allows passing requests along a chain of handlers, where each handler can either process the request or pass it to the next handler in the chain.
- Example: Leave approval system with multiple approvers. A logger
  - When you apply for two days leave it goes to supervisor, when it is more than two days and less than a week it goes to manager, and to domain head if it is more than a week.
  - A logger, with support for debug, info, and error logs
###  2. Command
- Encapsulates a request as an object, allowing parameterization of clients with different requests, queuing requests, and logging them.
- Example: Remote
  - A remote, each button on the remote (volume up, channel change, etc.) is an individual command. When pressed, it sends a specific command to the TV, which executes the action.

### 3. Interpreter
- Defines a grammar for a language and provides an interpreter that uses the grammar to interpret sentences in the language.

### 4. Iterator
- Provides a way to access elements of a collection sequentially without exposing the underlying structure.
- Example: Java Collections

### 5. Mediator
- Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly, allowing their interaction to vary independently.
- Example: Auction Mediator
  - The bidders do not communicate with each other, they communicate with the auction mediator instead. When there is a bid, the auction mediator will communicate it to all the bidders.

### 6. Memento
- Captures and externalizes an object's internal state without violating encapsulation, so that the object can be restored to this state later.
- Example: Snapshot feature
  - It helps you to save a specific state of the object, so that you can restore it at any given time(undo operations)

### 7. Observer
- Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- Example: Product subscription 
  - A user subscribes to a production notification when it is out of stock. As soon as the product's stock changes, all the observers will be notified.

### 8. State
- Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
- Example: Vending machine
  - Vending machine has different states and actions. Each action may behave differently based on the state of the vending machine. Some actions may also change the state of the vending machine. 

### 9. Strategy
- Defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from the clients that use it.
- Example: Checkout feature with support of multiple payment algorithms
    - Your application might have many payment options, you will have to create algorithms for each payment option. During checkout, you pass the selected payment method's algorithm to the checkout method, instead of writing everything inside checkout.
### 10. Template Method
- Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This allows subclasses to redefine certain steps of the algorithm without changing its structure.
- Example: Cooking Recipes
  - A recipe is like a template. 
  - It defines the structure (e.g., preparation, cooking, serving), but you can change certain steps like using different ingredients or spices, while keeping the overall process the same.

### 11. Visitor
- Represents an operation to be performed on the elements of an object structure. The visitor allows you to define a new operation without changing the classes of the elements on which it operates.
- Example: Tax Calculation

### 12. Null Object
- Provides a default behavior for objects where null references are expected, reducing the need for explicit null checks.
- Example: Default Customer Support

