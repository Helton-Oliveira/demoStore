package com.e_commerce.demo.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestFromApi {
    private static final String BASE_URL = "https://fakestoreapi.com/products";

    public static String request() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL))
                .build();
        HttpResponse<String> response = null;
        try {
             response = client
                     .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e){
            e.getMessage();
        }

        assert response != null;
        return response.body();
    }
}
