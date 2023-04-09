package com.example.testingone;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInstance {
    @GET("/posts")
    Call<List<Pojo>> getAll();
}
