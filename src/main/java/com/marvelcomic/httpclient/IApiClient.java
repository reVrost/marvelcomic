package com.marvelcomic.httpclient;

import org.apache.http.HttpResponse;

/**
 * Created by revrost on 18/01/2017.
 */
public interface IApiClient {
    HttpResponse get(String id);
}
