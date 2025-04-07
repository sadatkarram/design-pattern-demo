package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Pizza;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.NoDrink;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.NoPizza;

public class InValidMealFactory implements MealFactory {
    @Override
    public Pizza createPizza() {
        return new NoPizza();
    }

    @Override
    public Drink createDrink() {
        return new NoDrink();
    }
}
