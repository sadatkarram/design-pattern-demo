package com.example.design_pattern_demo.behavioral.template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        OrderProcessor guest = new GuestOrder();
        OrderProcessor user = new RegisteredUserOrder();

        guest.processOrder("Smartwatch");
        System.out.println("---");
        user.processOrder("Laptop");
    }
}

/*Guest selected: Smartwatch
Guest pays with COD
Delivering product via standard delivery
---
User selected: Laptop
User pays with saved card
Delivering with priority for registered user*/
