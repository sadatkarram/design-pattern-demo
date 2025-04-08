package com.example.design_pattern_demo.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

// Example Usage
public class EcommerceFlyweightDemo {
    public static void main(String[] args) {

        List<Product> catalog = new ArrayList<>();

        ProductAttribute nikeShoeAttr = AttributeFactory.getAttribute("Nike", "Footwear", "Leather");
        ProductAttribute adidasShoeAttr = AttributeFactory.getAttribute("Adidas", "Footwear", "Mesh");

        // Here two ProductAttribute object are reused in three product. Does save memory and resource
        catalog.add(new Product("P1001", "Nike Air Max", nikeShoeAttr));
        catalog.add(new Product("P1002", "Nike Revolution", nikeShoeAttr)); // Reuses same attribute
        catalog.add(new Product("P2001", "Adidas UltraBoost", adidasShoeAttr));


        for (Product product : catalog) {
            product.displayInfo();
            System.out.println("-----------");
        }
    }
}
