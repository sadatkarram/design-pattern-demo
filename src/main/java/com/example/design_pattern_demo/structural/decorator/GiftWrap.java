package com.example.design_pattern_demo.structural.decorator;

// Concrete Decorator
public class GiftWrap extends OrderDecorator{

    public GiftWrap(Order order) {
        super(order);
    }

    public String getDescription() {
        return order.getDescription() + " + Gift Wrapped";
    }
    public double getCost() {
        return order.getCost() + 10.0;
    }
}
