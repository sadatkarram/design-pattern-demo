package com.example.design_pattern_demo.structural.adapter.translator;

// Adapter (Translator - converts English to French)
public class FrenchToEnglishAdapter implements EnglishSpeaker{

    private FrenchEmployee frenchEmployee;

    public FrenchToEnglishAdapter(FrenchEmployee frenchEmployee) {
        this.frenchEmployee = frenchEmployee;
    }

    @Override
    public void speakInEnglish(String message) {
        // Adapter logic: translates and delegates
        System.out.println("Translating English to French...");
        frenchEmployee.parlerEnFrancais(message);
    }
}
