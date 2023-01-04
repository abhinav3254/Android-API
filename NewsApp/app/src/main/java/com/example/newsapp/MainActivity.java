package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.newsapp.models.NewsAPIResponse;
import com.example.newsapp.models.NewsHeadlines;
import com.example.newsapp.recyclerview.CustomAdapter;
import com.example.newsapp.retrofit_stuffs.OnFetchDataListener;
import com.example.newsapp.retrofit_stuffs.RequestManager;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener , View.OnClickListener {

    RecyclerView recyclerView;
    CustomAdapter adapter;

    Button b1,b2,b3,b4,b5,b6,b7;

    ProgressDialog progressDialog;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Fetching news..");
        progressDialog.show();

        b1 = findViewById(R.id.btn_1);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.btn_2);
        b2.setOnClickListener(this);
        b3 = findViewById(R.id.btn_3);
        b3.setOnClickListener(this);
        b4 = findViewById(R.id.btn_4);
        b4.setOnClickListener(this);
        b5 = findViewById(R.id.btn_5);
        b5.setOnClickListener(this);
        b6 = findViewById(R.id.btn_6);
        b6.setOnClickListener(this);
        b7 = findViewById(R.id.btn_7);
        b7.setOnClickListener(this);

        searchView = findViewById(R.id.search_view);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                progressDialog.setTitle("finding "+query);
                progressDialog.show();

                RequestManager requestManager = new RequestManager(MainActivity.this);
                requestManager.getNewsHeadlines(listener,"general",query);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


        RequestManager requestManager = new RequestManager(this);
        requestManager.getNewsHeadlines(listener,"general",null);

    }

    private final OnFetchDataListener<NewsAPIResponse> listener = new OnFetchDataListener<NewsAPIResponse>() {
        @Override
        public void onFetchData(List<NewsHeadlines> list, String message) {
            if (list.isEmpty()) {
                Toast.makeText(MainActivity.this, "Nothing found ??", Toast.LENGTH_SHORT).show();
            } else {
                showNews(list);
                progressDialog.dismiss();
            }
        }

        @Override
        public void onError(String message) {
            Toast.makeText(MainActivity.this, "An Error Occurred", Toast.LENGTH_SHORT).show();
        }
    };

    private void showNews(List<NewsHeadlines> list) {
        recyclerView = findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        adapter = new CustomAdapter(this,list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onNewsClicked(NewsHeadlines headlines) {
        startActivity(new Intent(this,DetailsActivity.class)
                .putExtra("data",headlines)
        );
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String category = button.getText().toString();

        progressDialog.setTitle("fetching "+category);
        progressDialog.show();
        RequestManager requestManager = new RequestManager(this);
        requestManager.getNewsHeadlines(listener,category,null);
    }
}