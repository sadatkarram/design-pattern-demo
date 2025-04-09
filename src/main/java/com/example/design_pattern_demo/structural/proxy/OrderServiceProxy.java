package com.example.design_pattern_demo.structural.proxy;

public class OrderServiceProxy implements OrderService{

    private RealOrderService realService = new RealOrderService();
    private String userRole;

    public OrderServiceProxy(String role) {
        this.userRole = role;
    }

    @Override
    public void viewOrderHistory(String customerName) {
        if ("ADMIN".equalsIgnoreCase(userRole)) {
            realService.viewOrderHistory(customerName);
        } else {
            System.out.println("Access denied: Only admins can view order history.");
        }
    }
}
