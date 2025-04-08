package com.example.design_pattern_demo.structural.composite;


// Client
public class CompositePatternDemo {

    public static void main(String[] args) {
        System.out.println("LEAF-LEVEL : ");
        Product phone = new Product("iPhone 14");
        Product laptop = new Product("MacBook Pro");
        phone.showDetails();
        laptop.showDetails();


        System.out.println("COMPOSITE - LEVEL : Electronics");
        Category electronics = new Category("Electronics");
        electronics.add(phone);
        electronics.add(laptop);
        electronics.showDetails();


        System.out.println("COMPOSITE - LEVEL : Clothing");
        Product jeans = new Product("Levi's Jeans");
        Category clothing = new Category("Clothing");
        clothing.add(jeans);
        clothing.showDetails();


        System.out.println("COMPOSITE - LEVEL : All Products");
        Category all = new Category("All Products");
        all.add(electronics);
        all.add(clothing);
        all.showDetails();
    }
}
