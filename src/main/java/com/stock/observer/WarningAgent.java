package com.stock.observer;

import com.stock.model.Product;

public class WarningAgent implements StockObserver {
    @Override
    public void update(Product product) {
        if (product.getStock() < 5) {
            System.out.println("ALERTA!!! El stock del Producto: " + product.getName() + " es muy bajo, solo quedan " + product.getStock() + " unidades.");
        }
    }
}
