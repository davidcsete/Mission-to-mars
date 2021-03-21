package com.sda.alina;

import java.util.ArrayList;
import java.util.List;

public class Rocket implements SpaceShip {

    private List<Item> items = new ArrayList<>();
    protected int maxWeight;
    protected int weight;
    private int cargoWeight = 0;
    private int cost;

    public Rocket(int maxWeight, int weight, int cost) {
        this.maxWeight = maxWeight;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
//        int currentWeight = 0;
//        for (Item listItem : items) {
//            currentWeight = currentWeight + listItem.getWeight();
//        }
        return weight + cargoWeight + item.getWeight() <= maxWeight;
    }

    @Override
    public void carry(Item item) {
        items.add(item);
        cargoWeight = cargoWeight + item.getWeight();
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public int getCost() {
        return cost;
    }
}
