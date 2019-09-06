package com.company;

public class Character {

    private String name;
    private int energy;
    private int health;
    private int possitionX;
    private int getPossitionX;

    public Character(){

    }

    public Character(String name, int energy, int health, int possitionX, int getPossitionX) {
        this.name = name;
        this.energy = energy;
        this.health = health;
        this.possitionX = possitionX;
        this.getPossitionX = getPossitionX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPossitionX() {
        return possitionX;
    }

    public void setPossitionX(int possitionX) {
        this.possitionX = possitionX;
    }

    public int getGetPossitionX() {
        return getPossitionX;
    }

    public void setGetPossitionX(int getPossitionX) {
        this.getPossitionX = getPossitionX;
    }
}
