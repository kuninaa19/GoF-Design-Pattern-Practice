package com.pattern.gof.state;

public class EmptyState implements State {
    @Override
    public void pour(int amount, Cup cup) {
        System.out.println("물이 없어요");
    }

    @Override
    public void fill(int amount, Cup cup) {
        cup.increaseAmount(amount);

        if (cup.isFull()) {
            cup.changeState(new FullState());
            return;
        }

        cup.changeState(new ModerateState());
    }
}
