package com.example.design_pattern_demo.behavioral.state.state;


import com.example.design_pattern_demo.behavioral.state.context.OrderContext;

// State Interface
public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
}
