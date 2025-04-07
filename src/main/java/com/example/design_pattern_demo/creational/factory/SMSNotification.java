package com.example.design_pattern_demo.creational.factory;

public class SMSNotification implements NotificationService {

    @Override
    public void notifyUser() {
        System.out.println("SMS Notification Sent !!");
    }
}
