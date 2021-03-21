package com.sda.alina;

public class U1 extends Rocket {

    public U1() {
        super(18000, 10000, 100);
    }

    @Override
    public boolean launch() {
        double chance = 0.05 * getCargoWeight() / maxWeight;
        double random = Math.random() / 10;
        return random >= chance;
    }

    @Override
    public boolean land() {
        double chance = 0.01 * getCargoWeight() / maxWeight;
        double random = Math.random() / 10;
        return random >= chance;
    }
}
