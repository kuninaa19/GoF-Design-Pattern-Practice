package com.pattern.gof.strategy;

public class Calculator {
    private final ValueStrategy strategy;

    public Calculator(ValueStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int i) {
        int sum = 0;
        sum += strategy.calculate(i);

        return sum;
    }
}
