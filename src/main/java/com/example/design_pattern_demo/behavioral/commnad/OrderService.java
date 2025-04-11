package com.example.design_pattern_demo.behavioral.commnad;

// Receiver (Business Logic)
public class OrderService {

    public void placeOrder() {
        System.out.println("Order has been placed.");
    }

    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
    }
}
