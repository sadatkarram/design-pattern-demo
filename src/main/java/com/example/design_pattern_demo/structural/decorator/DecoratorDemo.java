package com.example.design_pattern_demo.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        GiftWrap giftWrap = new GiftWrap(order);
        ExpressDelivery expressDelivery = new ExpressDelivery(order);

        System.out.println("Description: " + expressDelivery.getDescription());
        System.out.println("Total Cost: $" + expressDelivery.getCost());
        System.out.println("Description: " + giftWrap.getDescription());
        System.out.println("Total Cost: $" + giftWrap.getCost());

    }
}
