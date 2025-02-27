package com.stock.observer;

import com.stock.model.Product;

public class LogAgent implements StockObserver {
    @Override
    public void update(Product product) {
        System.out.println("Producto: " + product.getName() + " -> " + product.getStock() + " unidades disponibles");
    }
}

