# What is it?
- The Visitor Design Pattern is a behavioural pattern that solves the problem of adding new operations (or behaviors) to a set of related objects without modifying their structure. 
- It allows you to separate the operations (such as calculations or actions) from the objects on which they operate.

## The Problem:
- Imagine you have different types of objects in a system—like Car, Bike, and Bus. At some point, you might want to perform new operations on these objects, such as calculating insurance, applying discounts, or calculating taxes.
- One way to do this is to modify the Car, Bike, and Bus classes to add new methods like calculateInsurance(), applyDiscount(), etc. But every time you want to add a new operation, you would have to modify these classes, which can:
- Violate the Open/Closed Principle (which states that classes should be open for extension but closed for modification).
- Become messy and difficult to maintain, especially as the number of operations grows.

## Solution
- The Visitor Pattern lets you add new behaviors to objects without changing their structure. 
- You define a visitor class that contains the operation logic, and then the objects (like Car, Bike, and Bus) accept the visitor, allowing it to perform the operation.