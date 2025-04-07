package com.example.design_pattern_demo.creational.abstract_factory.ecommerce.factory;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.PaymentGatewayFactory;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Payment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Refund;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.PayPalPayment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.PayPalRefund;

public class PayPalFactory implements PaymentGatewayFactory {

    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }

    @Override
    public Refund createRefund() {
        return new PayPalRefund();
    }
}
