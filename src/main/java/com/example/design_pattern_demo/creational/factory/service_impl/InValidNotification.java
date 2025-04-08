package com.example.design_pattern_demo.creational.factory.service_impl;

import com.example.design_pattern_demo.creational.factory.service.NotificationService;

// Concrete-Product
public class InValidNotification implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("Invalid notification type. No notification will be sent !!");
    }
}

/*
The Factory Design Pattern helps create SINGLE objects without showing the exact class of the object
being created. Instead of calling new directly, you use a factory method to get the object.
This makes it easier to change or extend object creation in the future.
*/
