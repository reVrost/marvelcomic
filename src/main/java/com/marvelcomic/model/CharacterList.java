package com.marvelcomic.model;

import java.util.ArrayList;

public class CharacterList {
    private final int available;
    private final int returned;
    private final String collectionURI;
    private final ArrayList<CharacterSummary> items;

    public CharacterList(int available, int returned, String collectionURI, ArrayList<CharacterSummary> items) {
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

    public ArrayList<CharacterSummary> getItems() {
        return items;
    }
}
