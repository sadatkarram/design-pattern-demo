package com.example.design_pattern_demo.structural.decorator;


//Decorator
abstract class OrderDecorator {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }


}
