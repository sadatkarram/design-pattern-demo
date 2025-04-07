package com.example.design_pattern_demo.creational.factory;

public class NotificationFactory {

    public NotificationService createNotification(String type) {
        System.out.println("Notification type :" + type);
        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotification();
        } else {
            return new InValidNotification();
        }
    }
}
