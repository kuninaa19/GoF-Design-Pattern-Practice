package com.pattern.gof.state;

public class ModerateState implements State {
    @Override
    public void pour(int amount, Cup cup) {
        cup.decreaseAmount(amount);

        if (cup.isEmpty()) {
            cup.changeState(new EmptyState());
        }
    }

    @Override
    public void fill(int amount, Cup cup) {
        cup.increaseAmount(amount);

        if (cup.isFull()) {
            cup.changeState(new FullState());
        }
    }
}