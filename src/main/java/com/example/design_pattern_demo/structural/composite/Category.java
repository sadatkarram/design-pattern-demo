package com.example.design_pattern_demo.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Category implements ProductCatalogComponent{
    private String name;
    private List<ProductCatalogComponent> children = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void add(ProductCatalogComponent component) {
        children.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Category: " + name);
        for (ProductCatalogComponent child : children) {
            child.showDetails();
        }
    }
}
