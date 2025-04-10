package com.example.design_pattern_demo.behavioral.observer.concrete_subject;

import com.example.design_pattern_demo.behavioral.observer.observer.Observer;
import com.example.design_pattern_demo.behavioral.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class ProductStock implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private String product;

    public void restockProduct(String product) {
        this.product = product;
        System.out.println(product + " restocked!");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(product);
        }
    }
}
