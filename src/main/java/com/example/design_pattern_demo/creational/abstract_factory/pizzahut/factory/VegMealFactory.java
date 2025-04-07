package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory;

import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Drink;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service.Pizza;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.Juice;
import com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory.service_impl.VegPizza;

// Concrete Factory
public class VegMealFactory implements MealFactory {
    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }

    @Override
    public Drink createDrink() {
        return new Juice();
    }
}
