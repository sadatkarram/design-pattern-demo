package com.example.design_pattern_demo.behavioral.observer;

import com.example.design_pattern_demo.behavioral.observer.concerete_observer.EmailNotifier;
import com.example.design_pattern_demo.behavioral.observer.concerete_observer.SmsNotifier;
import com.example.design_pattern_demo.behavioral.observer.concrete_subject.ProductStock;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        ProductStock stock = new ProductStock();

        stock.addObserver(new EmailNotifier());
        stock.addObserver(new SmsNotifier());

        stock.restockProduct("Samsung Galaxy S24");
    }
}
