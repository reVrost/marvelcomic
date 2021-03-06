package com.marvelcomic.model;

public class ComicDate {
    private final String type;
    private final String date;

    public ComicDate(String type, String date) {
        this.type = type;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }
}
