package com.example.design_pattern_demo.structural.adapter.translator;

// Client (Office communication system)
public class OfficeCommunication {

    private EnglishSpeaker employee;

    public OfficeCommunication(EnglishSpeaker employee) {
        this.employee = employee;
    }

    public void sendMessage(String message) {
        System.out.println("Sending message in English...");
        employee.speakInEnglish(message);
    }
}
