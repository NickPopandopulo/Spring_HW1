package com.app.geekbrains;

public class Product {
    private int id;
    private String title;
    private double cost;
    private static int ID_COUNT = 0;

    public Product(String title, double cost) {
        this.id = ++ID_COUNT;
        this.title = title;
        this.cost = cost;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
