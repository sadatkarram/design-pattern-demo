package com.example.design_pattern_demo.structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        OrderService adminAccess = new OrderServiceProxy("ADMIN");
        OrderService userAccess = new OrderServiceProxy("CUSTOMER");

        adminAccess.viewOrderHistory("Ram");  // Allowed
        userAccess.viewOrderHistory("Ram");
    }
}
