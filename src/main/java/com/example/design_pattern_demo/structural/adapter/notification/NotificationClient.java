package com.example.design_pattern_demo.structural.adapter.notification;

// Usage
public class NotificationClient {

    public static void main(String[] args) {
        LegacySmsService oldService = new LegacySmsService();
        NotificationService adapter = new SmsAdapter(oldService);
        adapter.sendNotification("9876543210", "Your order has been shipped.");
    }
}
