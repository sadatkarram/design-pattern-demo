package com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Payment;

public class RazorpayPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println("Amount Paid using Razorpay :" + amount);
    }
}
