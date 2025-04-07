package com.example.design_pattern_demo.creational.abstract_factory.pizzahut.factory;

import java.util.Scanner;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("Combo-Meal");
        System.out.println("Enter 1 : For Veg-combo meal(Veg-Pizza + Juice)");
        System.out.println("Enter 2 : For Non-Veg-combo meal(Non-Veg-Pizza + Coke)");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice :");
        int choice = scanner.nextInt();

        MealFactory meal = prepareComboMeal(choice);
        meal.createPizza().prepare();
        meal.createDrink().pour();
    }

    private static MealFactory prepareComboMeal(int choice) {
        if (1 == choice) {
            return new VegMealFactory();
        } else if (2 == choice) {
            return new NonVegMealFactory();
        } else {
            return new InValidMealFactory();
        }
    }
}


