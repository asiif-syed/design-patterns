# What is it?
Strategy design pattern is a behavioural design pattern. It helps you define different ways of doing something, and choose the best way without changing the code that uses it.

## Problem
Let's say you have a shopping cart with a checkout method. To call this checkout method you need to pass the payment method, and it calls the specific payment method based on input.
```aidl
class ShoppingCart{
    
    public checkout(int amount, string paymentType){
        if(paymentType === 'credit-card'){
            creditCardService.pay(amount);
        }else if(paymentType === 'debit-card'){
            debitCardService.pay(amount);
        }else if(paymentType === 'paypal'){
            paypalService.pay(amount);
        }
    }
}
```

Problem with this is you need to change the checkout method whenever you introduce a new method, and the shopping cart class can get bloated.

# Solution
```aidl
class ShoppingCart{

    public checkout(int amount, PaymentService paymentType){
        PaymentService.pay(amount);
    }
}
```

## Simple Analogy:
- Think of a TV remote control:

- You have buttons for different channels (like different strategies).
- When you want to watch a specific channel, you press the button for that channel (choosing a strategy).
- If a new channel comes, you can just add a new button without changing how the remote works for the existing channels.