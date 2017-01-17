package com.marvelcomic.httpclient;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;

public class ClientBuilder {

   public static HttpClient getClient() {
       try {
           SSLContext sslContext = SSLContexts.custom()
                   .loadTrustMaterial(null, (chain, authType) -> true)
                   .build();

           SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                   sslContext,
                   NoopHostnameVerifier.INSTANCE);

           HttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
           return httpClient;
       }
       catch (Exception ex) {
           throw new RuntimeException("Could not create http client, Reason: " + ex.getMessage());
       }
   }
}
