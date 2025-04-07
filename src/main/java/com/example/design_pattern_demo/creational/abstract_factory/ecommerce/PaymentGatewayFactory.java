package com.example.design_pattern_demo.creational.abstract_factory.ecommerce;


import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Payment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Refund;

public interface PaymentGatewayFactory {
    Payment createPayment();
    Refund createRefund();
}
