package com.pattern.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Products extends Product {

    private final List<Product> products;

    public Products() {
        products = new ArrayList<>();
    }

    @Override
    void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    void removeProduct(Product product) {
        this.products.remove(product);
    }

    @Override
    public int getPrice() {
        return this.products.stream().mapToInt(Product::getPrice).sum();
    }

    @Override
    public String toString() {
        return "전체 가격 : " + getPrice();
    }
}
