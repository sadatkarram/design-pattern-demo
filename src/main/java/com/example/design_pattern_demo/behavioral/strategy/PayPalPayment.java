package com.example.design_pattern_demo.behavioral.strategy;

// Concrete Strategies:
public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}
