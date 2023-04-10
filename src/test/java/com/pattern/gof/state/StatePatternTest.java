package com.pattern.gof.state;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StatePatternTest {
    @Test
    void 컵_물_꽉찬_상태_만들기() {
        Cup cup = new Cup(500, 0, new EmptyState());
        cup.fill(500);

        assertThat(cup.getState()).isInstanceOf(FullState.class);
    }

    @Test
    void 컵_물_비움_상태_만들기() {
        Cup cup = new Cup(500, 500, new FullState());
        cup.pour(500);

        assertThat(cup.getState()).isInstanceOf(EmptyState.class);
    }

    @Test
    void 컵_물_중간_상태_만들기() {
        Cup cup = new Cup(500, 500, new ModerateState());
        cup.pour(200);

        assertThat(cup.getState()).isInstanceOf(ModerateState.class);
    }

    @Test
    void 컵_물_채우기() {
        Cup cup = new Cup(500, 300, new ModerateState());
        cup.fill(200);

        assertThat(cup.getState()).isInstanceOf(FullState.class);
    }

    @Test
    void 컵_물_비우기() {
        Cup cup = new Cup(500, 300, new ModerateState());
        cup.pour(300);

        assertThat(cup.getState()).isInstanceOf(EmptyState.class);
    }
}