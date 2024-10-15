# What is it?
- The Flyweight Pattern is a structural design pattern that focuses on minimizing memory usage by sharing as much data as possible between similar objects. 
- Instead of creating multiple objects that hold identical data, the Flyweight pattern allows you to share common data between objects, reducing the overall memory footprint.

## Key Concept:
- Intrinsic State: The state that is shared between multiple objects. This state remains the same for all the objects using it.
- Extrinsic State: The state that is unique to each object. This state is not shared and must be passed in from outside.

## The Flyweight pattern is often used when:
- You have a large number of objects.
- Objects share common properties.
- You want to reduce memory consumption by sharing those common properties.

## Real-World Example: 
- Character Objects in a Text Editor
- Imagine you are designing a text editor. In a document, many characters (like letters or punctuation) repeat frequently. 
- Each character could be represented as an object. 
- Instead of creating separate objects for each occurrence of the same character, the Flyweight pattern allows us to reuse objects that represent the same character, which saves memory.