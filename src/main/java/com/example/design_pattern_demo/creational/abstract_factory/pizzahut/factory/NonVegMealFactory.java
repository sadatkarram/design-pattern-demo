package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Pizza;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.Coke;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.NonVegPizza;

public class NonVegMealFactory implements MealFactory {
    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }

    @Override
    public Drink createDrink() {
        return new Coke();
    }
}
