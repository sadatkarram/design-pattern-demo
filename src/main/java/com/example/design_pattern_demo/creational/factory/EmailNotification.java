package com.example.design_pattern_demo.creational.factory;

public class EmailNotification implements NotificationService {

    @Override
    public void notifyUser() {
        System.out.println("Email Notification Sent !!");
    }
}
