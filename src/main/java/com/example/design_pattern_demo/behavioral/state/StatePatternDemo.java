package com.example.design_pattern_demo.behavioral.state;

import com.example.design_pattern_demo.behavioral.state.context.OrderContext;

public class StatePatternDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();

        order.next();   // Shipped
        order.next();   // Delivered
        order.cancel();
    }
}
