package com.marvelcomic.api;


public class MarvelResponse<T> {
    private final int code;
    private final String status;
    private final String copyright;
    private final String attributionText;
    private final String attributionHTML;
    private final String etag;
    private MarvelDataWrapper<T> data;

    public MarvelResponse(int code,
                          String status,
                          String copyright,
                          String attributionText,
                          String attributionHTML,
                          String etag,
                          MarvelDataWrapper<T> data)
    {
        this.code = code;
        this.status = status;
        this.copyright = copyright;
        this.attributionText = attributionText;
        this.attributionHTML = attributionHTML;
        this.etag = etag;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public MarvelDataWrapper<T> getData() {
        return data;
    }

    public void setData(MarvelDataWrapper<T> data) {
        this.data = data;
    }
}
