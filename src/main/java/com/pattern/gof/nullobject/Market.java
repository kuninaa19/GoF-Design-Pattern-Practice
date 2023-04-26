package com.pattern.gof.nullobject;

import com.pattern.gof.nullobject.product.NullProduct;
import com.pattern.gof.nullobject.product.Product;
import com.pattern.gof.nullobject.product.Products;
import com.pattern.gof.nullobject.product.Stock;

import java.util.HashMap;
import java.util.Map;

public class Market {

    private final Map<Product, Stock> products;

    public Market() {
        products = new HashMap<>();
    }

    public Product pick(Product product, int quantity) {
        Stock stock = products.get(product);
        if (stock == null) {
            return new NullProduct();
        }

        int buyStock = stock.maxBuyStock(quantity);
        if (!stock.hasStock(buyStock)) {
            return new NullProduct();
        }

        stock.removeStock(buyStock);
        return new Products(product, new Stock(buyStock));
    }

    public void addProduct(Product product, int quantity) {
        Stock stock = this.products.get(product);
        if (stock == null) {
            stock = new Stock();
            this.products.put(product, stock);
        }

        stock.addStock(quantity);
    }
}