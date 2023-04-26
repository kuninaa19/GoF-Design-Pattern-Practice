package com.pattern.gof.composite;

public abstract class Product {

    public static final String NOT_ALLOWED_ADD = "추가 할 수 없음";

    void addProduct(Product product) {
        throw new IllegalArgumentException(NOT_ALLOWED_ADD);
    }

    abstract void removeProduct(Product product);

    abstract int getPrice();
}
