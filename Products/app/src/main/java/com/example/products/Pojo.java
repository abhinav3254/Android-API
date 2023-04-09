package com.example.products;

import java.util.ArrayList;
import java.util.List;

public class Pojo {
    public List<Product> products;
    public String total;
    public String skip;
    public String limit;

    public Pojo(List<Product> products, String total, String skip, String limit) {
        this.products = products;
        this.total = total;
        this.skip = skip;
        this.limit = limit;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSkip() {
        return skip;
    }

    public void setSkip(String skip) {
        this.skip = skip;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    class Product {
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

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public double getDiscountPercentage() {
            return discountPercentage;
        }

        public void setDiscountPercentage(double discountPercentage) {
            this.discountPercentage = discountPercentage;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public ArrayList<String> getImages() {
            return images;
        }

        public void setImages(ArrayList<String> images) {
            this.images = images;
        }
    }
}