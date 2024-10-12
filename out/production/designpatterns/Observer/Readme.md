# What is it?
Observer is a behavioural design pattern and used to subscribe for the state changes and notify observers about the state changes.

## Key Components of the Observer Pattern
- Subject: The object that maintains a list of observers and notifies them of any state changes. It provides methods for adding, removing, and notifying observers.

- Observer: An interface (or abstract class) that defines the method(s) that observers must implement to receive updates from the subject.

- Concrete Subject: A concrete implementation of the subject that maintains its state and notifies observers of changes.

- Concrete Observer: A concrete implementation of the observer that reacts to updates from the subject.

## Advantages 
- Loose Coupling: The subject does not need to know details about its observers, promoting loose coupling.
- Dynamic Relationships: Observers can be added or removed at runtime without modifying the subject.
- Multiple Observers: One subject can notify multiple observers, making it suitable for various event-driven systems.
## Disadvantages
- Memory Leaks: If observers are not properly removed, they can lead to memory leaks.
- Complexity: Overusing the pattern can lead to an overly complex system with too many classes.