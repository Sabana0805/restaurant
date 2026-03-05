package com.example.demo.model;

public class RestaurantData {
    private int id;
    private String name;
    private int capacity;
    private String imageUrl; // Field for menu item/restaurant image
    private int quantity;    // Column for stock or order quantity

    public RestaurantData() {}

    public RestaurantData(int id, String name, int capacity, String imageUrl, int quantity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}