package com.pattern.gof.nullobject;

import com.pattern.gof.nullobject.product.Product;
import com.pattern.gof.nullobject.product.Wallet;
import com.pattern.gof.nullobject.product.Watch;

public class NullObjectDemo {
    public static void main(String[] args) {
        Product watch = new Watch("로렉스");
        Product wallet = new Wallet("페라가모");

        Market market = new Market();
        market.addProduct(watch, 2);
        market.addProduct(wallet, 2);

        Basket basket = new Basket(market);
        basket.put(watch, 1);
        basket.put(wallet, 3);

        System.out.println(basket);
    }
}
