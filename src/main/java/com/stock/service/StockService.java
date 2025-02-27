package com.stock.service;

import com.stock.model.Product;
import com.stock.observer.StockObserver;
import java.util.ArrayList;
import java.util.List;

public class StockService {
    private final List<StockObserver> observers = new ArrayList<>();

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void updateStock(Product product, int newStock) {
        product.setStock(newStock);
        notifyObservers(product);
    }

    private void notifyObservers(Product product) {
        for (StockObserver observer : observers) {
            observer.update(product);
        }
    }
}
