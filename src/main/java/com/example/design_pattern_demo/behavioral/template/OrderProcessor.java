package com.example.design_pattern_demo.behavioral.template;

// Abstract Class – Template
public abstract class OrderProcessor {

    // Template method
    public final void processOrder(String product) {
        selectProduct(product);
        makePayment();
        deliver();
    }

    protected abstract void selectProduct(String product);
    protected abstract void makePayment();
    protected void deliver(){
        System.out.println("Delivering product via standard delivery");
    }
}
