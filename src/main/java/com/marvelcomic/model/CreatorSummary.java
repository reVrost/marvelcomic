package com.marvelcomic.model;

public class CreatorSummary {
    private final String resourceURI;
    private final String name;
    private final String role;

    public CreatorSummary(String resourceURI, String name, String role) {

        this.resourceURI = resourceURI;
        this.name = name;
        this.role = role;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
