package com.marvelcomic.model;

public class TextObject {
    private final String type;
    private final String language;
    private final String text;

    public TextObject(String type, String language, String text) {
        this.type = type;
        this.language = language;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }
}
