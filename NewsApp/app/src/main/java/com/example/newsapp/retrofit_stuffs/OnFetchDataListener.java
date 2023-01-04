package com.example.newsapp.retrofit_stuffs;

import com.example.newsapp.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsAPIResponse> {
    void onFetchData (List<NewsHeadlines> list,String message);
    void onError (String message);
}
