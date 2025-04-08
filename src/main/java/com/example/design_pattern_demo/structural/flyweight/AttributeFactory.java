package com.example.design_pattern_demo.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Factory to Manage Flyweights: AttributeFactory
public class AttributeFactory {

    private static final Map<String, ProductAttribute> cache = new HashMap<>();

    public static ProductAttribute getAttribute(String brand, String category, String material) {
        String key = brand + "-" + category + "-" + material;
        if (!cache.containsKey(key)) {
            System.out.println("Creating new ProductAttribute: " + key);
            cache.put(key, new ProductAttribute(brand, category, material));
        }
        return cache.get(key);
    }
}
