package com.marvelcomic.model;

public class SeriesSummary {
    private final String resourceURI;
    private final String name;

    public SeriesSummary(String resourceURI, String name) {
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
