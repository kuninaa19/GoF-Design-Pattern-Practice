package com.pattern.gof.nullobject;

import com.pattern.gof.nullobject.product.Product;

import java.util.*;

public class Basket {
    private final List<Product> products;
    private final Market market;

    public Basket(Market market) {
        this.market = market;
        products = new ArrayList<>();
    }

    public void put(Product wishProduct, int quantity) {
        Product product = market.pick(wishProduct, quantity);
        products.add(product);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("장바구니 리스트");
        stringBuilder.append(System.lineSeparator());

        for (Product product : products) {
            stringBuilder.append(product);
        }

        return stringBuilder.toString();
    }
}
