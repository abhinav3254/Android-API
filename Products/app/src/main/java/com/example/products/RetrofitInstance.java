package com.example.products;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    static String BASE_URL = "https://dummyjson.com/";
    static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit == null)
         retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
