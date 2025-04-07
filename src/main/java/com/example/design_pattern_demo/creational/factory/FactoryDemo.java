package com.example.design_pattern_demo.creational.factory;

import java.util.Scanner;

// Acting as Client
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
