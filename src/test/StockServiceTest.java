package com.stock.service;

import com.stock.model.Product;
import com.stock.observer.LogAgent;
import com.stock.observer.WarningAgent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {
    @Test
    void testUpdateStock() {
        Product product = new Product("Xbox One S", 299.99, 10, "Consola");
        StockService stockService = new StockService();
        stockService.addObserver(new LogAgent());
        stockService.addObserver(new WarningAgent());

        stockService.updateStock(product, 4);
        assertEquals(4, product.getStock());
    }
}

