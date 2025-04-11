package com.example.design_pattern_demo.behavioral.state.concrete_state;

import com.example.design_pattern_demo.behavioral.state.context.OrderContext;
import com.example.design_pattern_demo.behavioral.state.state.OrderState;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredState());
        System.out.println("Order delivered.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order already shipped.");
    }
}
