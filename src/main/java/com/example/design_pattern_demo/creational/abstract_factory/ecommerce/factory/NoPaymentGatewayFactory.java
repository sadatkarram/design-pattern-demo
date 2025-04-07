package com.example.design_pattern_demo.creational.abstract_factory.ecommerce.factory;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.PaymentGatewayFactory;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Payment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service.Refund;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.NoPayment;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.service_impl.NoRefund;

public class NoPaymentGatewayFactory implements PaymentGatewayFactory {

    @Override
    public Payment createPayment() {
        return new NoPayment();
    }

    @Override
    public Refund createRefund() {
        return new NoRefund();
    }
}
