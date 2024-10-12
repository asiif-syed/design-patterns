# What is it?
Template design pattern is a behavioural design pattern. 
It helps you to define a template with a sequence of steps to complete an action, but allowing each subclass to provide their own implementation for each step.

## What it solves?

### Example1
#### Orders in a restaurant
- Every specific order involves same steps like Take Order, Notify Kitchen, Gather ingredients, cook food, and serve.
But the process of steps like gathering ingredients, cook food, and serve might change based on the order. But it involves same step in the same sequence for each order

### Example2
#### Pay from bank
- Bank need to perform certain steps in the same sequence when you pay to a person from the same bank or different bank. But some of the steps may follow their own procedure based on the payee.
- Steps might involve, Check balance, verify bank details, calculate charges, debit sender's account, credit receiver's account. 
- The implementation of Calculate Charges and Credit Receiver's account might change based on the fact receiver is from the same bank or not.