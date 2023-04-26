package com.pattern.gof.composite;

public class Bag extends Product {
    @Override
    void addProduct(Product product) {
    }

    @Override
    void removeProduct(Product product) {
    }

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public String toString() {
        return "가방 가격 : "+ getPrice();
    }
}
