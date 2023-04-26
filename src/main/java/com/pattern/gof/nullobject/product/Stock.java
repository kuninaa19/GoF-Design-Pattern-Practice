package com.pattern.gof.nullobject.product;

public class Stock {

    public static final String REMAIN_STOCK_EXCEPTION = "재고는 1이상의 값을 가져야합니다";
    public static final int MIN_STOCK = 1;

    private int stock;

    public Stock() {
        stock = 0;
    }

    public Stock(int stock) {
        isValid(stock);
        this.stock = stock;
    }

    private void isValid(int stock) {
        if (stock < MIN_STOCK) {
            throw new IllegalArgumentException(REMAIN_STOCK_EXCEPTION);
        }
    }

    public void addStock(int quantity) {
        isValid(quantity);

        this.stock += quantity;
    }

    public int maxBuyStock(int quantity) {
        return Math.min(stock, quantity);
    }

    public boolean hasStock(int stock) {
        isValid(stock);

        return this.stock >= stock;
    }

    public void removeStock(int quantity) {
        stock -= quantity;
    }

    @Override
    public String toString() {
        return String.valueOf(stock);
    }
}
