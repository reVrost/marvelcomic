package com.marvelcomic.httpclient;

import com.marvelcomic.api.MarvelApi;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

public class ApiClient<T> implements IApiClient{

    private String apiUrl;

    public ApiClient(String subUrl) {
       apiUrl = MarvelApi.HOST + subUrl;
    }

    public static String getApiKey(long timestamp) {
        String stringToHash = timestamp + MarvelApi.PRIVATE_KEY + MarvelApi.API_KEY;
        String hash = DigestUtils.md5Hex(stringToHash);
        return "?apikey=" + MarvelApi.API_KEY + "&hash=" + hash + "&ts=" + timestamp;
    }

    @Override
    public HttpResponse get(String id) {

        try {
            HttpClient httpClient = ClientBuilder.getClient();
            String url = apiUrl + id + getApiKey(System.currentTimeMillis());
            System.out.println(url);
            HttpGet getRequest = new HttpGet(url);
            getRequest.addHeader("accept", "application/json");
            HttpResponse response = httpClient.execute(getRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                // Pseudo logging
                System.out.println("Failed : HTTP error code : "
                        + response.getStatusLine().getStatusCode()
                        + EntityUtils.toString(response.getEntity(), "UTF-8"));
                return null;
            }

            HttpResponse result = httpClient.execute(getRequest);
            return result;
        }
        catch (Exception ex) {
            System.out.println("Failed to request api: " + ex.getMessage());
            return null;
        }
    }

}
