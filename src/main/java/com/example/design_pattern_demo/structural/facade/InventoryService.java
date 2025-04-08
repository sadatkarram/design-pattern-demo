package com.example.design_pattern_demo.structural.facade;
// Sub-System
public class InventoryService {
    public void checkStock(String product) {
        System.out.println("Checking stock for " + product);
    }
}
