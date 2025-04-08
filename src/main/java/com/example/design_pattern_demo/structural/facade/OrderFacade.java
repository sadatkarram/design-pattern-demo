package com.example.design_pattern_demo.structural.facade;

// Simplified Interface for Client
public class OrderFacade {
    private InventoryService inventory = new InventoryService();
    private PaymentService payment = new PaymentService();
    private ShippingService shipping = new ShippingService();

    public void placeOrder(String product, String account, double amount) {
        inventory.checkStock(product);
        payment.makePayment(account, amount);
        shipping.arrangeShipping(product);
        System.out.println("Order placed successfully!");
    }
}
