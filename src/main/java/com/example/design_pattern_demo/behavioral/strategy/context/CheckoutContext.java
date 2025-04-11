package com.example.design_pattern_demo.behavioral.strategy.context;

import com.example.design_pattern_demo.behavioral.strategy.stratege.PaymentStrategy;

// Context (Client):
public class CheckoutContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }
}
