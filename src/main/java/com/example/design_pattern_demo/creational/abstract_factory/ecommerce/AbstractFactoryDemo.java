package com.example.design_pattern_demo.creational.abstract_factory.ecommerce;

import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.factory.NoPaymentGatewayFactory;
import com.example.design_pattern_demo.creational.abstract_factory.ecommerce.factory.RazorpayFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        String paymentGatewayType = "RAM";

        PaymentGatewayFactory factory = getPaymentGateway(paymentGatewayType);
        factory.createPayment().makePayment(225.30);
        factory.createRefund().makeRefund("S10000234533");
    }

    private static PaymentGatewayFactory getPaymentGateway(String paymentGatewayType) {
        if("PP".equalsIgnoreCase(paymentGatewayType)){
            return new RazorpayFactory();
        } else if ("RP".equalsIgnoreCase(paymentGatewayType)) {
            return new RazorpayFactory();
        }else{
            return new NoPaymentGatewayFactory();
        }
    }
}
