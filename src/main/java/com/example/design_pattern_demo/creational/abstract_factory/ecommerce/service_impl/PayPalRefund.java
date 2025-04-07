package com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Refund;

public class PayPalRefund implements Refund {

    @Override
    public void makeRefund(String transactionId) {
        System.out.println("For transactionId, refunded processed using PayPal :" + transactionId);
    }
}
