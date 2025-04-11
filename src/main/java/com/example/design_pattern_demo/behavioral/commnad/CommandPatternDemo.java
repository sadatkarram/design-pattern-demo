package com.example.design_pattern_demo.behavioral.commnad;

public class CommandPatternDemo {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        OrderCommand place = new PlaceOrderCommand(orderService);
        OrderCommand cancel = new CancelOrderCommand(orderService);

        OrderInvoker invoker = new OrderInvoker();

        invoker.setCommand(place);
        invoker.run(); // Output: Order has been placed.

        invoker.setCommand(cancel);
        invoker.run(); // Output: Order has been cancelled.

    }
}
