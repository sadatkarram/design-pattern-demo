package com.example.design_pattern_demo.behavioral.chainofresponsibility;

public class InventoryCheckHandler extends OrderHandler{

    @Override
    public void handle(String order) {
        System.out.println("Checking inventory for " + order);
        if (next != null) next.handle(order);
    }
}
