package com.pattern.gof.nullobject.product;

public class Wallet implements Product {
    private final String name;

    public Wallet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
