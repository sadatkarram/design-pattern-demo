package com.example.design_pattern_demo.creational.factory;

import com.example.design_pattern_demo.creational.factory.service.NotificationService;

import java.util.Scanner;

/*
Creator = It will create Factory class instance which will then
use factory-method <createNotification()> to create actual Product object<Concrete-Product>
*/
public class FactoryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of notification :");
        String type = scanner.nextLine();

        NotificationFactory factory = new NotificationFactory();
        NotificationService notification = factory.createNotification(type);
        notification.notifyUser();

    }
}
