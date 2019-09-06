package com.company;

public class SmartRefrigerator implements Connectable {
    private double price;
    private String model;

    SmartRefrigerator() {
        this.price = 150;
        this.model = "Old Model";
    }

    SmartRefrigerator(double price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("SmartRefrigerators: Connect to bluetooth in progress...");
    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
}
