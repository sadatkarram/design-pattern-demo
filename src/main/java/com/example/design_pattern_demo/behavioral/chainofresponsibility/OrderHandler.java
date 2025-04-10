package com.example.design_pattern_demo.behavioral.chainofresponsibility;

// Handler Interface
public abstract class OrderHandler {
    protected OrderHandler next;

    public void setNext(OrderHandler next) {
        this.next = next;
    }

    public abstract void handle(String order);
}
