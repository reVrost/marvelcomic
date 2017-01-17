package com.marvelcomic.model;

import java.util.ArrayList;

public class CreatorList {
    private final int available;
    private final int returned;
    private final String collectionURI;
    private final ArrayList<CreatorSummary> items;

    public CreatorList(int available, int returned, String collectionURI, ArrayList<CreatorSummary> items) {

        this.available = available;
        this.returned = returned;
        this.collectionURI = collectionURI;
        this.items = items;
    }

    public int getAvailable() {
        return available;
    }

    public int getReturned() {
        return returned;
    }

    public String getCollectionURI() {
        return collectionURI;
    }

    public ArrayList<CreatorSummary> getItems() {
        return items;
    }
}
