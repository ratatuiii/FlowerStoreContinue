package com.example.demo.delivery;

import com.example.demo.flowerStore.Item;
import java.util.List;

public class DHLDelivery implements Delivery {
    private List<Item> items;

    public DHLDelivery(List<Item> items) {
        this.items = items;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String deliver() {
        return "Delivered with DHL";
    }
}
