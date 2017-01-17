package com.marvelcomic.model;

public class StorySummary {
    private final String resourceURI;
    private final String name;
    private final String type;
    public StorySummary(String resourceURI, String name, String type) {
        this.resourceURI = resourceURI;
        this.name = name;
        this.type = type;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
