package com.example.design_pattern_demo.creational.singleton;

public class OnePunch {
    // private static instance of class
    private static OnePunch onePunch;

    // private constructor
    private OnePunch() {
    }

    // Step 3: Public access method
    public static OnePunch getInstance() {
        if (onePunch == null) {
            onePunch = new OnePunch();
        }
        return onePunch;
    }

    public void showMessage() {
        System.out.println("Hello from Saitama !!");
    }
}
