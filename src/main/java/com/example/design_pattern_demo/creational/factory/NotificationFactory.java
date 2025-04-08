package com.example.design_pattern_demo.creational.factory;

import com.example.design_pattern_demo.creational.factory.service.NotificationService;
import com.example.design_pattern_demo.creational.factory.service_impl.EmailNotification;
import com.example.design_pattern_demo.creational.factory.service_impl.InValidNotification;
import com.example.design_pattern_demo.creational.factory.service_impl.SMSNotification;

//Concrete-Creator = here we have factory-method [createNotification()]
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
