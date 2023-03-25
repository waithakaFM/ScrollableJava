package com.francis.scrollablejava;


public class Food {
    private String name;
    private double price;
    private int imageId;

    public Food(String name, double price, int imageId) {
        this.name = name;
        this.price = price;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getImageResourceId() {
        return imageId;
    }
}

