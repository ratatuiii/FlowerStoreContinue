package com.example.demo.flowerStore;


public abstract class Item {
    private String description;

    public String getDescription() {
        return description;
    }
    abstract double getPrice();
}
