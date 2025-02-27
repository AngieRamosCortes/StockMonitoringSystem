package com.stock.repository;

import com.stock.model.Product;
import java.util.HashMap;
import java.util.Map;

public class StockRepository {
    private static StockRepository instance;
    private final Map<String, Product> products = new HashMap<>();

    private StockRepository() {}

    public static StockRepository getInstance() {
        if (instance == null) {
            instance = new StockRepository();
        }
        return instance;
    }

    public void addProduct(Product product) {
        products.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return products.get(name);
    }
}
