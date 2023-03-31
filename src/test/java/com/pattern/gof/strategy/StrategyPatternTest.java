package com.pattern.gof.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyPatternTest {
    @Test
    void calculateMoreThan100() {
        ValueStrategy strategy = new MoreThanValueStrategy();
        Calculator calculator = new Calculator(strategy);

        assertThat(calculator.calculate(100)).isEqualTo(200);
    }

    @Test
    void calculateLessThan100() {
        ValueStrategy strategy = new LessThanValueStrategy();
        Calculator calculator = new Calculator(strategy);

        assertThat(calculator.calculate(100)).isEqualTo(50);

    }
}
