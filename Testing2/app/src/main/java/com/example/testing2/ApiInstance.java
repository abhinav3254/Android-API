package com.example.testing2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInstance {
    @GET("/api/v1/all")
    Call<List<Pojo>> getAll();
}
