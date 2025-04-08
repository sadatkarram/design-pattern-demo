package com.example.design_pattern_demo.structural.adapter.translator;

public class AdapterDemo {
    public static void main(String[] args) {
        FrenchEmployee newGuy = new FrenchEmployee();
        EnglishSpeaker adapter = new FrenchToEnglishAdapter(newGuy); // Adapter in action

        OfficeCommunication office = new OfficeCommunication(adapter);
        office.sendMessage("Please join the 10 AM team meeting.");
    }
}
