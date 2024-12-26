package com.example.fooddeliveryapp;
// FoodItem.java
public class FoodItem {
    private String name;
    private String description;
    private double price;
    private int imageResource; // Resource ID for item image

    public FoodItem(String name, String description, double price, int imageResource) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}

