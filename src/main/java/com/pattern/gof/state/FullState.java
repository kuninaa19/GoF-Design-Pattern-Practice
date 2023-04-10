package com.pattern.gof.state;

public class FullState implements State {
    @Override
    public void pour(int amount, Cup cup) {
        cup.decreaseAmount(amount);

        if (cup.isEmpty()) {
            cup.changeState(new EmptyState());

            return;
        }

        cup.changeState(new ModerateState());
    }

    @Override
    public void fill(int amount, Cup cup) {
        System.out.println("물이 꽉 찼어요");
    }
}
