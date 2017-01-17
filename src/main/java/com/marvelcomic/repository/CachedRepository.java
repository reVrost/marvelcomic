package com.marvelcomic.repository;

import java.util.HashMap;
import java.util.Map;

public class CachedRepository<T> {

    private Map<String, T> cache;
    private long lastModified;
    private long cacheDuration;
    private IRepository<T> apiRepo;

    public CachedRepository(IRepository<T> apiRepo, long cacheDuration) {
        cache = new HashMap<String, T>();
        this.apiRepo = apiRepo;
        this.cacheDuration = cacheDuration;
        lastModified = System.currentTimeMillis();
    }

    public T get(String id) {
        long current = System.currentTimeMillis();
        if (current - lastModified > cacheDuration) {
            // Clear caches
            cache = new HashMap<String, T>();
            lastModified = current;
        }

        if (cache.containsKey(id)) {
           return cache.get(id);
        }
        else {
            T item = apiRepo.get(id);
            if (item != null)
                cache.put(id, item);
            return item;
        }
    }
}
