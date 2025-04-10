package com.example.design_pattern_demo.behavioral.template;


// Concrete Implementations
public class RegisteredUserOrder extends OrderProcessor{
    @Override
    protected void selectProduct(String product) {
        System.out.println("User selected: " + product);
    }

    @Override
    protected void makePayment() {
        System.out.println("User pays with saved card");
    }

    protected void deliver() {
        System.out.println("Delivering with priority for registered user");
    }
}
