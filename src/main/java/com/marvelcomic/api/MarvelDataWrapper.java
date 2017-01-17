package com.marvelcomic.api;

import java.util.ArrayList;

public class MarvelDataWrapper<T> {
    private final int total;
    private final int limit;
    private final int count;
    private final int offset;
    private final ArrayList<T> results;

    public MarvelDataWrapper(int total, int limit, int count, int offset, ArrayList<T> results) {

        this.total = total;
        this.limit = limit;
        this.count = count;
        this.offset = offset;
        this.results = results;
    }

    public int getTotal() {
        return total;
    }

    public int getLimit() {
        return limit;
    }

    public int getCount() {
        return count;
    }

    public int getOffset() {
        return offset;
    }

    public ArrayList<T> getResults() {
        return results;
    }
}
