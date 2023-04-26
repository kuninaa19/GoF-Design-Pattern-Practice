package com.pattern.gof.composite;

public class Snack extends Product {
    @Override
    void addProduct(Product product) {
    }

    @Override
    void removeProduct(Product product) {
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String toString() {
        return "과자 가격 : "+ getPrice();
    }
}
