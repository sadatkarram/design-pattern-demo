package com.example.design_pattern_demo.behavioral.strategy;

import com.example.design_pattern_demo.behavioral.strategy.concrete_stratege.CreditCardPayment;
import com.example.design_pattern_demo.behavioral.strategy.concrete_stratege.UpiPayment;
import com.example.design_pattern_demo.behavioral.strategy.context.CheckoutContext;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        CheckoutContext checkout = new CheckoutContext();

        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.checkout(999.99);

        checkout.setPaymentStrategy(new UpiPayment());
        checkout.checkout(450.50);
    }
}
