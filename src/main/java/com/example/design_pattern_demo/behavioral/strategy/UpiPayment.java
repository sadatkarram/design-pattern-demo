package com.example.design_pattern_demo.behavioral.strategy;

// Concrete Strategies:
public class UpiPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
