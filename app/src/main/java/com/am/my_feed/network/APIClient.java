package com.am.my_feed.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private final static String BASE_URL = "https://newsapi.org/v2/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
    public ApiRequests getApiService() {
        return APIClient.getClient().create(ApiRequests.class);
    }
}
