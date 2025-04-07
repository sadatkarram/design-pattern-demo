package com.example.design_pattern_demo.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        McVegBurger.Builder builder = new McVegBurger.Builder();
        builder.isCheeseRequired(false);
        builder.isSpicy(true);

        McVegBurger mcVegBurger = new McVegBurger(builder);
        System.out.println(mcVegBurger.toString());

        builder.isCheeseRequired(false);
        builder.isPattyRequired(false);
        builder.isSpicy(false);
        builder.isSaucesRequired(false);
        McVegBurger mcVegBurger1 = new McVegBurger(builder);
        System.out.println(mcVegBurger1.toString());
    }
}
