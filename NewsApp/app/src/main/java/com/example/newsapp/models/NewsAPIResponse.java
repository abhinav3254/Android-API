package com.example.newsapp.models;

//Main response from the API

import java.io.Serializable;
import java.util.List;

public class NewsAPIResponse implements Serializable {
    public String status;
    public int totalResults;
    public List<NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }
}
