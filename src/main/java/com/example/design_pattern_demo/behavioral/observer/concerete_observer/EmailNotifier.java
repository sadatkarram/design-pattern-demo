package com.example.design_pattern_demo.behavioral.observer.concerete_observer;


import com.example.design_pattern_demo.behavioral.observer.observer.Observer;

//  Concrete Observers
public class EmailNotifier implements Observer {

    @Override
    public void update(String product) {
        System.out.println("Email: " + product + " is back in stock!");
    }
}
