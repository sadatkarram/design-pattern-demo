package com.example.design_pattern_demo.structural.facade;

// Sub-System
public class ShippingService {
    public void arrangeShipping(String product) {
        System.out.println("Shipping arranged for " + product);
    }
}
