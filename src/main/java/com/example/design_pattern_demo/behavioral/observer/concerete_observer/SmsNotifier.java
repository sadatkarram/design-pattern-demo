package com.example.design_pattern_demo.behavioral.observer.concerete_observer;

import com.example.design_pattern_demo.behavioral.observer.observer.Observer;

//  Concrete Observers
public class SmsNotifier implements Observer {

    @Override
    public void update(String product) {
        System.out.println("SMS: " + product + " is back in stock!");
    }
}
