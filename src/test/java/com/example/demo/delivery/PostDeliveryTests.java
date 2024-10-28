package com.example.demo.delivery;

import com.example.demo.flowerStore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.example.demo.flowerStore.CactusFlower;
import com.example.demo.flowerStore.RomashkaFLower;

class PostDeliveryTests {

    private PostDelivery dhlDelivery;
    private List<Item> items;

    @BeforeEach
    void setUp() {
        items = List.of(new CactusFlower());
        dhlDelivery = new PostDelivery(items);
    }

    @Test
    void testDeliver() {
        String result = dhlDelivery.deliver();
        assertEquals("Delivered with PostDelivery", result);
    }

    @Test
    void testGetItems() {
        assertSame(items, dhlDelivery.getItems());
    }

    @Test
    void testSetItems() {
        List<Item> newItems = List.of(new RomashkaFLower());
        dhlDelivery.setItems(newItems);
        assertSame(newItems, dhlDelivery.getItems());
    }
}
