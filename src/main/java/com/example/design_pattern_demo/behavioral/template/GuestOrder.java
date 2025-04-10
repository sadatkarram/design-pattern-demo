package com.example.design_pattern_demo.behavioral.template;

// Concrete Implementations
public class GuestOrder extends OrderProcessor{
    @Override
    protected void selectProduct(String product) {
        System.out.println("Guest selected: " + product);
    }

    @Override
    protected void makePayment() {
        System.out.println("Guest pays with COD");
    }
}
