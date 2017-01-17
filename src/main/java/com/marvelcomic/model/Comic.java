package com.marvelcomic.model;

import java.util.ArrayList;

public class Comic {

    private final int id;
    private final int digitalId;
    private final String title;
    private final double issueNumber;
    private final String variantDescription;
    private final String description;
    private final String modified;
    private final String isbn;
    private final String upc;
    private final String diamondCode;
    private final String ean;
    private final String issn;
    private final String format;
    private final int pageCount;
    private final ArrayList<TextObject> textObjects;
    private final String resourceURI;
    private final ArrayList<Url> urls;
    private final SeriesSummary series;
    private final ArrayList<ComicSummary> variants;
    private final ArrayList<ComicSummary> collections;
    private final ArrayList<ComicSummary> collectedIssues;
    private final ArrayList<ComicDate> dates;
    private final ArrayList<ComicPrice> prices;
    private final Image thumbnail;
    private final ArrayList<Image> images;
    private final CreatorList creators;
    private final CharacterList characters;
    private final StoryList stories;
    private final EventList events;

    public Comic(int id,
                 int digitalId,
                 String title,
                 double issueNumber,
                 String variantDescription,
                 String description,
                 String modified,
                 String isbn, String upc,
                 String diamondCode,
                 String ean,
                 String issn,
                 String format,
                 int pageCount,
                 ArrayList<TextObject> textObjects,
                 String resourceURI,
                 ArrayList<Url> urls,
                 SeriesSummary series,
                 ArrayList<ComicSummary> variants,
                 ArrayList<ComicSummary> collections,
                 ArrayList<ComicSummary> collectedIssues,
                 ArrayList<ComicDate> dates,
                 ArrayList<ComicPrice> prices,
                 Image thumbnail,
                 ArrayList<Image> images,
                 CreatorList creators,
                 CharacterList characters,
                 StoryList stories,
                 EventList events)
    {
        this.id = id;
        this.digitalId = digitalId;
        this.title = title;
        this.issueNumber = issueNumber;
        this.variantDescription = variantDescription;
        this.description = description;
        this.modified = modified;
        this.isbn = isbn;
        this.upc = upc;
        this.diamondCode = diamondCode;
        this.ean = ean;
        this.issn = issn;
        this.format = format;
        this.pageCount = pageCount;
        this.textObjects = textObjects;
        this.resourceURI = resourceURI;
        this.urls = urls;
        this.series = series;
        this.variants = variants;
        this.collections = collections;
        this.collectedIssues = collectedIssues;
        this.dates = dates;
        this.prices = prices;
        this.thumbnail = thumbnail;
        this.images = images;
        this.creators = creators;
        this.characters = characters;
        this.stories = stories;
        this.events = events;
    }

    public int getId() {
        return id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public String getTitle() {
        return title;
    }

    public double getIssueNumber() {
        return issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getUpc() {
        return upc;
    }

    public String getDiamondCode() {
        return diamondCode;
    }

    public String getEan() {
        return ean;
    }

    public String getIssn() {
        return issn;
    }

    public String getFormat() {
        return format;
    }

    public int getPageCount() {
        return pageCount;
    }

    public ArrayList<TextObject> getTextObjects() {
        return textObjects;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public ArrayList<Url> getUrls() {
        return urls;
    }

    public SeriesSummary getSeries() {
        return series;
    }

    public ArrayList<ComicSummary> getVariants() {
        return variants;
    }

    public ArrayList<ComicSummary> getCollections() {
        return collections;
    }

    public ArrayList<ComicSummary> getCollectedIssues() {
        return collectedIssues;
    }

    public ArrayList<ComicDate> getDates() {
        return dates;
    }

    public ArrayList<ComicPrice> getPrices() {
        return prices;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public CreatorList getCreators() {
        return creators;
    }

    public CharacterList getCharacters() {
        return characters;
    }

    public StoryList getStories() {
        return stories;
    }

    public EventList getEvents() {
        return events;
    }
}

