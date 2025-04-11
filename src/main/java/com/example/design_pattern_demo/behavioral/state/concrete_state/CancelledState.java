package com.example.design_pattern_demo.behavioral.state.concrete_state;

import com.example.design_pattern_demo.behavioral.state.context.OrderContext;
import com.example.design_pattern_demo.behavioral.state.state.OrderState;

public class CancelledState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("Order was cancelled. No further processing.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("Already cancelled.");
    }
}
