package com.sda.alina;

public class U2 extends Rocket {

    public U2() {
        super(29000, 18000, 120);
    }

    @Override
    public boolean launch() {
        double chance = 0.04 * getCargoWeight() / maxWeight;
        double random = Math.random() / 10 ;
        return random >= chance;
    }

    @Override
    public boolean land() {
        double chance = 0.08 * getCargoWeight() / maxWeight;
        double random = Math.random()/ 10;
        return random >= chance;
    }
}
