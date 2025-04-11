package com.example.design_pattern_demo.behavioral.state.concrete_state;

import com.example.design_pattern_demo.behavioral.state.context.OrderContext;
import com.example.design_pattern_demo.behavioral.state.state.OrderState;

public class NewOrderState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new ShippedState());
        System.out.println("Order moved to Shipped state.");
    }

    @Override
    public void cancel(OrderContext context) {
        context.setState(new CancelledState());
        System.out.println("Order cancelled.");
    }
}
