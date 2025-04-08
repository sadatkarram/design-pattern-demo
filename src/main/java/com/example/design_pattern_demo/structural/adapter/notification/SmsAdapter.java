package com.example.design_pattern_demo.structural.adapter.notification;

// Adapter
public class SmsAdapter implements NotificationService{

    private final LegacySmsService legacySmsService;

    public SmsAdapter(LegacySmsService legacySmsService) {
        this.legacySmsService = legacySmsService;
    }

    @Override
    public void sendNotification(String recipient, String message) {
        legacySmsService.sendText(recipient, message);
    }
}
