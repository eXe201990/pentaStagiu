package com.company;

public class MainRestaurants {
    public static void main(String[] args) {
        Vegetarian vegetarian = new Vegetarian();
        vegetarian.addGuest(2);
        vegetarian.displayInfo();


        FastFood fastFood = new FastFood();
        fastFood.addGuest(5);
        fastFood.displayInfo();
    }
}
