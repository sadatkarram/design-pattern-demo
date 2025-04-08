package com.example.design_pattern_demo.structural.decorator;

//Concrete Decorator
public class ExpressDelivery extends OrderDecorator{
    public ExpressDelivery(Order order) {
        super(order);
    }

    public String getDescription() {
        return order.getDescription() + " with Express Delivery";
    }
    public double getCost() {
        return order.getCost() + 30.0;
    }
}
