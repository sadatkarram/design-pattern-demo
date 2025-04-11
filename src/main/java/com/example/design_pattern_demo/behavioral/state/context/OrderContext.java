package com.example.design_pattern_demo.behavioral.state.context;

import com.example.design_pattern_demo.behavioral.state.concrete_state.NewOrderState;
import com.example.design_pattern_demo.behavioral.state.state.OrderState;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState(); // default state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
