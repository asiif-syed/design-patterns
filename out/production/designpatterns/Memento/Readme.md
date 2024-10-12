# What is it?
The Memento Design Pattern is a behavioral design pattern used to capture and restore an object's state without exposing its internal details. 
It allows an object to be restored to a previous state, which is useful in cases like undo operations or restoring a configuration.


## Components of Memento Design Pattern:
- Originator: The object whose state needs to be saved.
- Memento: Stores the internal state of the Originator object. It does not allow direct access to the state except to the Originator.
- Caretaker: Responsible for keeping track of multiple Mementos and managing the save/restore process.
## Key Points:
- Encapsulation: The Memento hides the internal state of the Originator from other objects, ensuring the original object can only be modified by itself.
- Undo functionality: It's often used to implement undo functionality in applications.
