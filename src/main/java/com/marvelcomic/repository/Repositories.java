package com.marvelcomic.repository;

import com.marvelcomic.httpclient.ApiClient;
import com.marvelcomic.model.Comic;

public class Repositories {

    public static long CACHE_DURATION = 300000; // 300 Milliseconds

    public static CachedRepository<Comic> comicRepo =
            new CachedRepository<Comic>(new ComicRepository(new ApiClient("/comics/")), CACHE_DURATION);

    public static CachedRepository<Comic> GetComicRepository() {
        return comicRepo;
    }
}
