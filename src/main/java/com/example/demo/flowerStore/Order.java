package com.example.demo.flowerStore;
import com.example.demo.delivery.Delivery;
import com.example.demo.payments.Payment;

import java.util.List;

public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(List<Item> items) {
        this.items = items;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public Delivery getDelivery() {
        return delivery;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return payment;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String processOrder(double paid) {
        payment.pay();
        delivery.deliver();
        return "Payment is successful";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }
}