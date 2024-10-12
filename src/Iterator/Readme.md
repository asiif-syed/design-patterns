
# What is it?
The Iterator Design Pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object (like a collection) sequentially without exposing its underlying representation. In Java, the Iterator pattern is commonly used in collection frameworks like ArrayList, HashSet, etc.

## Components of the Iterator Pattern:
- Iterator Interface: This defines the methods for accessing elements in the collection.
- Concrete Iterator: Implements the Iterator interface, providing the actual implementation for iterating over the collection.
- Aggregate Interface: This defines the method for creating an iterator object.
- Concrete Aggregate: This is the actual collection that implements the Aggregate interface and returns an iterator.