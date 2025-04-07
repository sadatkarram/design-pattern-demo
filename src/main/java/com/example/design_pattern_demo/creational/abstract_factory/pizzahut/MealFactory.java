package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Pizza;

// Abstract Factory
public interface MealFactory {
    Pizza createPizza();

    Drink createDrink();
}
