package com.example.design_pattern_demo.behavioral.commnad;

//  Invoker
public class OrderInvoker {

    private OrderCommand command;

    public void setCommand(OrderCommand command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }
}
