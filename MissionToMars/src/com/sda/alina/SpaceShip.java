package com.sda.alina;

public interface SpaceShip {

    boolean launch();

    boolean land();

    boolean canCarry(Item item);

    void carry(Item item);

}
