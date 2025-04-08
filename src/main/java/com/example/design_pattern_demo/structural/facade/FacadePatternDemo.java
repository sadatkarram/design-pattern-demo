package com.example.design_pattern_demo.structural.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("iPhone 15", "user@example.com", 79999);
    }
}
