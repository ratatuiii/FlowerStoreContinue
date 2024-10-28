package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.flowerStore.Flower;
import com.example.demo.flowerStore.RomashkaFLower;
import com.example.demo.flowerStore.CactusFlower;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FlowerController {
    private List<Flower> flowers;

    public FlowerController() {
        flowers = new ArrayList<>();
        flowers.add(new RomashkaFLower());
        flowers.add(new CactusFlower());
    }

    public void addFlower(Flower flower) {flowers.add(flower);}

    @RequestMapping("/flowers")
    public List<Flower> getFlowerTypes() {
        return flowers;
    }
}
