package com.example.design_pattern_demo.creational.abstract_factory.ecommerce.factory;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.PaymentGatewayFactory;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Payment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Refund;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.RazorpayPayment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.RazorpayRefund;

public class RazorpayFactory implements PaymentGatewayFactory {

    @Override
    public Payment createPayment() {
        return new RazorpayPayment();
    }

    @Override
    public Refund createRefund() {
        return new RazorpayRefund();
    }
}
