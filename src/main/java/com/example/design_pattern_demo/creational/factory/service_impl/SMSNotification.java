package com.example.design_pattern_demo.creational.factory.service_impl;

import com.example.design_pattern_demo.creational.factory.service.NotificationService;

// Concrete-Product
public class SMSNotification implements NotificationService {

    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Sent !!");
    }
}
