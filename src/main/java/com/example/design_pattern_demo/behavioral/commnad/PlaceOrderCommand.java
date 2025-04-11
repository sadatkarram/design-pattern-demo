package com.example.design_pattern_demo.behavioral.commnad;

public class PlaceOrderCommand implements OrderCommand{
    private final OrderService service;
    public PlaceOrderCommand(OrderService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.placeOrder();
    }
}
