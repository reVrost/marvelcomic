package com.marvelcomic.model;

public class ComicSummary {
    private final String resourceURI;
    private final String name;

    public ComicSummary(String resourceURI, String name) {
        this.resourceURI = resourceURI;
        this.name = name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }
}
