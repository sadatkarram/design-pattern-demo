package com.example.design_pattern_demo.structural.proxy;

public class RealOrderService implements OrderService{

    @Override
    public void viewOrderHistory(String customerName) {
        System.out.println("Order history for customer: " + customerName);
    }
}
