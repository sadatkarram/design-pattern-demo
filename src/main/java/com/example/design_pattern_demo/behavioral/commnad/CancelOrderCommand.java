package com.example.design_pattern_demo.behavioral.commnad;

public class CancelOrderCommand implements OrderCommand{
    private final OrderService service;
    public CancelOrderCommand(OrderService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.cancelOrder();
    }
}
