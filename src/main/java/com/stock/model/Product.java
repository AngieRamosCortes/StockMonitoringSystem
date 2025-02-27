package com.stock.model;

public class Product {
    private String name;
    private double price;
    private int stock;
    private String category;

    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public String getName (){
        return name;
    }

    public int setStock (int stock){
        this.stock = stock;
        return stock;
    }

    public int getStock (){
        return stock;
    }
}


    
    



