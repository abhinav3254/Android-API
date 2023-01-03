package com.example.evilinsult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APInterface {

    @GET("generate_insult.php?lang=en&type=json")
    abstract Call<Pojo> getInsult();
}
