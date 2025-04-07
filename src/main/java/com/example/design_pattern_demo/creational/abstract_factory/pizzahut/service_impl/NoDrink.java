package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;

public class NoDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("Invalid option selected. No Drink for you !! ");
    }
}
