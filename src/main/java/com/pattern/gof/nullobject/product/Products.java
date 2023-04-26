package com.pattern.gof.nullobject.product;

public class Products implements Product {
    private final Product product;
    private final Stock stock;

    public Products(Product product, Stock stock) {
        this.product = product;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return product + " 구매 " + stock + "개" + System.lineSeparator();
    }
}
