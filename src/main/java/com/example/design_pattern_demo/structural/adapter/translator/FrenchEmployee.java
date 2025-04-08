package com.example.design_pattern_demo.structural.adapter.translator;

// Adaptee (New employee speaks only French)
public class FrenchEmployee {
    public void parlerEnFrancais(String message) {
        System.out.println("En Français: " + message);
    }
}
