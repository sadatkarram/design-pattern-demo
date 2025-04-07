package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Pizza;

public class VegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veg-Pizza is ready !!");
    }
}
