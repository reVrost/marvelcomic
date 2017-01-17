package com.marvelcomic.model;

public class ComicPrice {
    private final String type;
    private final float price;

    public ComicPrice(String type, float price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
