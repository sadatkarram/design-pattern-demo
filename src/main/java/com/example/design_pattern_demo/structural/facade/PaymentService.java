package com.example.design_pattern_demo.structural.facade;

// Sub-System
public class PaymentService {
    public void makePayment(String account, double amount) {
        System.out.println("Processing payment of ₹" + amount + " from " + account);
    }
}
