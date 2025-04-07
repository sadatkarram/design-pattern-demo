package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;

public class Juice implements Drink {
    @Override
    public void pour() {
        System.out.println("Fruit Juice is ready !!");
    }
}
