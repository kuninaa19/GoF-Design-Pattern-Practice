package com.pattern.gof.strategy;

public class LessThanValueStrategy implements ValueStrategy {
    @Override
    public int calculate(int value) {
        return value / 2;
    }
}
