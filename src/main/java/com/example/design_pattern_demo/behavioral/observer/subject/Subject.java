package com.example.design_pattern_demo.behavioral.observer.subject;

import com.example.design_pattern_demo.behavioral.observer.observer.Observer;


public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

