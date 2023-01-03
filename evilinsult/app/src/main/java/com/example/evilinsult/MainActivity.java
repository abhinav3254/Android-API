package com.example.evilinsult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.evilinsult.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    static String URL_API = "generate_insult.php?lang=en&type=json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();

        APInterface apInterface =RetrofitInstance.getRetrofit().create(APInterface.class);
        apInterface.getInsult().enqueue(new Callback<Pojo>() {
            @Override
            public void onResponse(Call<Pojo> call, Response<Pojo> response) {
                binding.number.setText(response.body().getNumber());
                binding.language.setText(response.body().getLanguage());
                binding.insult.setText(response.body().getInsult());
                binding.date.setText(response.body().getCreated());
                binding.shown.setText(response.body().getShown());
                binding.createdby.setText(response.body().getCreatedBy());
                binding.active.setText(response.body().getActive());
                binding.link.setText(response.body().getComment());
            }

            @Override
            public void onFailure(Call<Pojo> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        });


        binding.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}