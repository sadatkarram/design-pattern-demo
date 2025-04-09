package com.example.design_pattern_demo.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        CheckoutContext checkout = new CheckoutContext();

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.checkout(999.99);

        checkout.setPaymentStrategy(new UpiPayment());
        checkout.checkout(450.50);
    }
}
