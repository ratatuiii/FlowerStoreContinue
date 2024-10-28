package com.example.demo.controllers;

import com.example.demo.delivery.DHLDelivery;
import com.example.demo.flowerStore.Item;
import com.example.demo.flowerStore.Order;
import com.example.demo.payments.CreditCardPayment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {
    private List<Order> orders;
    public OrderController() {
        orders = new ArrayList<>();
        Order order = new Order(new ArrayList<>());
        order.setPayment(new CreditCardPayment(50));
        order.setDelivery(new DHLDelivery(new ArrayList<Item>()));
        orders.add(order);

    }
    public void addOrder(Order order) {orders.add(order);}

    @RequestMapping("/orders")
    public List<Order> getOrders() {
        return orders;
    }
}
