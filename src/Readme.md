# Design patterns with Java

Resources for quick refresher
- https://refactoring.guru/design-patterns/behavioral-patterns

## Behavioural Design Patterns

Behavioral design patterns are concerned with the interaction and responsibility between objects. These patterns provide solutions for better interaction, communication, and assignment of responsibilities between classes or objects. They make it easier to define how objects communicate in a flexible and efficient way.

Here is a list of all the behavioral design patterns:

### Chain of Responsibility
- Allows passing requests along a chain of handlers, where each handler can either process the request or pass it to the next handler in the chain.
- Example: Leave approval system with multiple approvers. A logger
  - When you apply for two days leave it goes to supervisor, when it is more than two days and less than a week it goes to manager, and to domain head if it is more than a week.
  - A logger, with support for debug, info, and error logs
###  Command
- Encapsulates a request as an object, allowing parameterization of clients with different requests, queuing requests, and logging them.
- Example: Remote
  - A remote, each button on the remote (volume up, channel change, etc.) is an individual command. When pressed, it sends a specific command to the TV, which executes the action.

### Interpreter
- Defines a grammar for a language and provides an interpreter that uses the grammar to interpret sentences in the language.

### Iterator
- Provides a way to access elements of a collection sequentially without exposing the underlying structure.
- Example: Java Collections

### Mediator
- Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by keeping objects from referring to each other explicitly, allowing their interaction to vary independently.
- Example: Auction Mediator
  - The bidders do not communicate with each other, they communicate with the auction mediator instead. When there is a bid, the auction mediator will communicate it to all the bidders.

### Memento
- Captures and externalizes an object's internal state without violating encapsulation, so that the object can be restored to this state later.
- Example: Snapshot feature
  - It helps you to save a specific state of the object, so that you can restore it at any given time(undo operations)

### Observer
- Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- Example: Product subscription 
  - A user subscribes to a production notification when it is out of stock. As soon as the product's stock changes, all the observers will be notified.

### State
- Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
- Example: Vending machine
  - Vending machine has different states and actions. Each action may behave differently based on the state of the vending machine. Some actions may also change the state of the vending machine. 

### Strategy
- Defines a family of algorithms, encapsulates each one, and makes them interchangeable. The strategy pattern lets the algorithm vary independently from the clients that use it.
- Example: Checkout feature with support of multiple payment algorithms
    - Your application might have many payment options, you will have to create algorithms for each payment option. During checkout, you pass the selected payment method's algorithm to the checkout method, instead of writing everything inside checkout.
### Template Method
- Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. This allows subclasses to redefine certain steps of the algorithm without changing its structure.
- Example: Cooking Recipes
  - A recipe is like a template. 
  - It defines the structure (e.g., preparation, cooking, serving), but you can change certain steps like using different ingredients or spices, while keeping the overall process the same.

### Visitor
- Represents an operation to be performed on the elements of an object structure. The visitor allows you to define a new operation without changing the classes of the elements on which it operates.
- Example: Tax Calculation

### Null Object
- Provides a default behavior for objects where null references are expected, reducing the need for explicit null checks.
- Example: Default Customer Support