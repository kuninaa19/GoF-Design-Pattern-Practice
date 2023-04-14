package com.pattern.gof.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorPatternTest {
    @Test
    void 일반_노트북() {
        Computer computer = new Laptop();

        assertThat(computer.getPrice()).isEqualTo(1000000);
    }

    @Test
    void 그래픽_카드_추가() {
        Computer computer = new Laptop();
        Computer graphicCardWithComputer = new GraphicCardDecorator(computer);

        assertThat(graphicCardWithComputer.getPrice()).isEqualTo(1500000);
    }

    @Test
    void 메모리_추가() {
        Computer computer = new Laptop();
        Computer MemoryWithComputer = new MemoryDecorator(computer);

        assertThat(MemoryWithComputer.getPrice()).isEqualTo(1300000);
    }
}
