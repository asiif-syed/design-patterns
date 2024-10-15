# What is it?
Factory design pattern is a creational design pattern, it provides an interface to create objects without specifying the exact class of objects being created.
- In simple terms, the factory is like a "factory" in real life that produces products (objects) based on an order (request), but the factory hides the details of how the products are made.

## Example
- Imagine you're building a notification system in an e-commerce platform. 
- Based on user preferences, notifications could be sent via email for order confirmations, SMS for shipping updates, or push notifications for promotional offers. 
- The Factory Design Pattern allows you to decouple the code that needs to send the notifications from the specifics of how each type of notification is created and delivered. 
- This abstraction simplifies the notification handling process.