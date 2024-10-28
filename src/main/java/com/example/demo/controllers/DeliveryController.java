package com.example.demo.controllers;

import com.example.demo.delivery.PostDelivery;
import com.example.demo.delivery.DHLDelivery;
import com.example.demo.delivery.Delivery;
import com.example.demo.flowerStore.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeliveryController {
    private List<Delivery> deliveries;
    public DeliveryController() {
        deliveries = new ArrayList<>();
        deliveries.add(new DHLDelivery(new ArrayList<Item>()));
        deliveries.add(new PostDelivery(new ArrayList<Item>()));
    }

    public void addDelivery(Delivery delivery) {deliveries.add(delivery);}

    @RequestMapping("/deliveries")
    public List<Delivery> getDeliveries() {
        return deliveries;
    }
}
