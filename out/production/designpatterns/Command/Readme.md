# What is it?
Command design pattern is a behavioural design pattern. It decouples the invoker from the receivers by turning the requests into stand alone objects.

## What problem it solves?
Let's say you have a machine, without command design pattern, the client using this machine needs to know all the details and internals of how this machine works.
Command design pattern allows you to create a command for each action by encapsulating it and the client uses this command. 

## Key Concepts 
- Command Interface: This defines the common method (often execute()) that all command objects will implement. The command objects encapsulate actions.

- Concrete Command: These are the classes that implement the Command interface. Each concrete command performs a specific action by invoking the method(s) on the receiver.

- Invoker: This holds a reference to a command object and can call its execute() method. The invoker doesn’t know the actual receiver or the operation that will be performed; it simply triggers the command.

- Receiver: This is the object that knows how to perform the action associated with the command. The receiver's method(s) get called when the command’s execute() method is invoked.

- Client: The client creates the concrete command objects and associates them with the receivers. It also assigns the commands to the invoker.