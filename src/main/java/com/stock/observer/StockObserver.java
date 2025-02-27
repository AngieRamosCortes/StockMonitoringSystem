package com.stock.observer;

import com.stock.model.Product;

public interface StockObserver {
    void update(Product product);
}

