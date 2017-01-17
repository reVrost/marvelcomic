package com.marvelcomic.model;

import java.util.ArrayList;

public class EventList {
    private final int available;
    private final int returned;
    private final String collectionURI;
    private final ArrayList<EventSummary> items;

    public EventList(int available, int returned, String collectionURI, ArrayList<EventSummary> items) {
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

    public ArrayList<EventSummary> getItems() {
        return items;
    }
}
