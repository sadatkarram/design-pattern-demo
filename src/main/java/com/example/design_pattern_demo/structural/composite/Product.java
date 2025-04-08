package com.example.design_pattern_demo.structural.composite;

// Leaf
public class Product implements ProductCatalogComponent{
   private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + name);
    }
}
