package com.example.demo.delivery;

// import Flower.Item;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.Setter;

// import java.util.List;
// @Getter @Setter @AllArgsConstructor
// public class PostDelivery implements Delivery{
//     private List<Item> items;
//     @Override
//     public String deliver() {
//         return "Delivered with post successfully";
//     }
// }
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