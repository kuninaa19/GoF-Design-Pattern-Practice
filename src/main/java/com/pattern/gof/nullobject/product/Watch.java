package com.pattern.gof.nullobject.product;

public class Watch implements Product {

    private final String name;

    public Watch(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
