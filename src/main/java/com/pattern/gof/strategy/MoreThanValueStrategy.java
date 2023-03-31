package com.pattern.gof.strategy;

public class MoreThanValueStrategy implements ValueStrategy {

    @Override
    public int calculate(int value) {
        return value * 2;
    }
}
