package com.marvelcomic.repository;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.marvelcomic.api.MarvelResponse;
import com.marvelcomic.httpclient.IApiClient;
import com.marvelcomic.model.Comic;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.lang.reflect.Type;


public class ComicRepository implements IRepository<Comic> {
    private IApiClient apiClient;

    public ComicRepository(IApiClient client) {
        apiClient = client;
    }

    @Override
    public Comic get(String id) {
        try {
            HttpResponse result = apiClient.get(id);
            String json = EntityUtils.toString(result.getEntity(), "UTF-8");

            GsonBuilder gson = new GsonBuilder();
            Type collectionType = new TypeToken<MarvelResponse<Comic>>(){}.getType();
            MarvelResponse<Comic> res = gson.create().fromJson(json, collectionType);

            // Get first item
            return res.getData().getResults().get(0);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
