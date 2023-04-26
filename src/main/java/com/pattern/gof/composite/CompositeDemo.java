package com.pattern.gof.composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Product snack = new Snack();
        Product bag = new Bag();

        Product products = new Products();
        products.addProduct(snack);
        products.addProduct(bag);

        System.out.println(snack);
        System.out.println(bag);
        System.out.println(products);

    }

}
