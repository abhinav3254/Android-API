package com.example.testing2;

import java.util.ArrayList;

public class Pojo {
    public ArrayList<Product> products;
    public int total;
    public int skip;
    public int limit;

    public Pojo(ArrayList<Product> products, int total, int skip, int limit) {
        this.products = products;
        this.total = total;
        this.skip = skip;
        this.limit = limit;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getTotal() {
        return total;
    }

    public int getSkip() {
        return skip;
    }

    public int getLimit() {
        return limit;
    }

    class Product{
        public int id;
        public String title;
        public String description;
        public int price;
        public double discountPercentage;
        public double rating;
        public int stock;
        public String brand;
        public String category;
        public String thumbnail;
        public ArrayList<String> images;

        public Product(int id, String title, String description, int price, double discountPercentage, double rating, int stock, String brand, String category, String thumbnail, ArrayList<String> images) {
            this.id = id;
            this.title = title;
            this.description = description;
            this.price = price;
            this.discountPercentage = discountPercentage;
            this.rating = rating;
            this.stock = stock;
            this.brand = brand;
            this.category = category;
            this.thumbnail = thumbnail;
            this.images = images;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public int getPrice() {
            return price;
        }

        public double getDiscountPercentage() {
            return discountPercentage;
        }

        public double getRating() {
            return rating;
        }

        public int getStock() {
            return stock;
        }

        public String getBrand() {
            return brand;
        }

        public String getCategory() {
            return category;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public ArrayList<String> getImages() {
            return images;
        }
    }
}
