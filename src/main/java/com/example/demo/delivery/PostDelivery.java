package com.example.demo.delivery;
import com.example.demo.flowerStore.Item;
import java.util.List;

public class PostDelivery implements Delivery {
    private List<Item> items;

    public PostDelivery(List<Item> items) {
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
        return "Delivered with PostDelivery";
    }
}