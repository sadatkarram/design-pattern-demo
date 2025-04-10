package com.example.design_pattern_demo.behavioral.chainofresponsibility;

public class PaymentHandler extends OrderHandler{
    @Override
    public void handle(String order) {
        System.out.println("Processing payment for " + order);
        if (next != null) next.handle(order);
    }
}
