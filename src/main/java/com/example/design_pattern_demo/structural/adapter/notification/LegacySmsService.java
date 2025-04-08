package com.example.design_pattern_demo.structural.adapter.notification;

//Legacy Service (Incompatible Interface)
public class LegacySmsService {

    public void sendText(String mobile, String msg) {
        System.out.println("Sending SMS to " + mobile + ": " + msg);
    }
}
