package com.example.design_pattern_demo.behavioral.strategy.concrete_stratege;

import com.example.design_pattern_demo.behavioral.strategy.stratege.PaymentStrategy;

// Concrete Strategies:
public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
