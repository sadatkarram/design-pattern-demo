package com.example.design_pattern_demo.behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        OrderHandler inventory = new InventoryCheckHandler();
        OrderHandler payment = new PaymentHandler();
        OrderHandler shipping = new ShippingHandler();

        inventory.setNext(payment);
        payment.setNext(shipping);
        inventory.handle("Laptop");
    }
}
