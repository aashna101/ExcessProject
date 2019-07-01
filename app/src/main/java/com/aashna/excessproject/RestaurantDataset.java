package com.aashna.excessproject;

public class RestaurantDataset {
    String name, status, distance, rating, offer;
            int img;

    public RestaurantDataset(String name, String status, String distance, String rating, String offer, int img) {
        this.name = name;
        this.status = status;
        this.distance = distance;
        this.rating = rating;
        this.offer = offer;
        this.img = img;
    }

    public RestaurantDataset() {
    }
}
