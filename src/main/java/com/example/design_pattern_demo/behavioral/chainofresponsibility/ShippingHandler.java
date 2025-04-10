package com.example.design_pattern_demo.behavioral.chainofresponsibility;

public class ShippingHandler extends OrderHandler {
    @Override
    public void handle(String order) {
        System.out.println("Shipping " + order);
    }
}
