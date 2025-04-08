package com.example.design_pattern_demo.structural.decorator;

// Concrete Product
public class BasicOrder implements Order{
    @Override
    public String getDescription() {
        return "Base-Order";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
