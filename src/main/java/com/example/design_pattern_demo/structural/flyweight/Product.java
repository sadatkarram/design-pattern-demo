package com.example.design_pattern_demo.structural.flyweight;


// Product Class (holds unique ID + shared attributes)
public class Product {

    private final String id; // Unique per product
    private final String name;
    private final ProductAttribute attribute; // Shared object

    public Product(String id, String name, ProductAttribute attribute) {
        this.id = id;
        this.name = name;
        this.attribute = attribute;
    }

    public void displayInfo() {
        System.out.println("Product ID: " + id + ", Name: " + name);
        attribute.showAttributes();
    }
}
