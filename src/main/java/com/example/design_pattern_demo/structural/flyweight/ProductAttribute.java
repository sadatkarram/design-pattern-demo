package com.example.design_pattern_demo.structural.flyweight;

// Definition of Shared Data: ProductAttribute (Flyweight)
public class ProductAttribute {
    private final String brand;
    private final String category;
    private final String material;

    public ProductAttribute(String brand, String category, String material) {
        this.brand = brand;
        this.category = category;
        this.material = material;
    }

    public void showAttributes() {
        System.out.println("Brand: " + brand + ", Category: " + category + ", Material: " + material);
    }
}
