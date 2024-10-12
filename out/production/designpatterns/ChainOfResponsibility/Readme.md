# What is it?
The Chain of Responsibility (CoR) design pattern is a behavioral design pattern that allows an object to pass a request along a chain of handlers. Each handler in the chain can either handle the request or pass it to the next handler. This decouples the sender of a request from its receivers and allows multiple handlers to process the request without knowing each other.

## Key Components:
- Handler: An interface or abstract class that defines a method for handling requests and an optional method for setting the next handler in the chain.
- Concrete Handlers: Implementations of the Handler that process the request.
- Client: The code that initiates the request.

## Examples
- Leave System where approver changes based on the number of leaves requested
- ATM, where different kind of transactions are handled
- Logger, where different kind of loggers are handled