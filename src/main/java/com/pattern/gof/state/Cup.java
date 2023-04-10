package com.pattern.gof.state;

import java.util.Objects;

public class Cup {
    private final int capacity;
    private int amount;
    private State state;

    public Cup(int capacity, int amount, State state) {
        this.capacity = capacity;
        this.amount = amount;
        this.state = state;
    }

    public void pour(int amount) {
        this.state.pour(amount, this);
    }

    public void fill(int amount) {
        this.state.fill(amount, this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean isEmpty() {
        return this.amount == 0;
    }

    public boolean isFull() {
        return this.capacity == this.amount;
    }

    public State getState() {
        return this.state;
    }

    public void increaseAmount(int amount) {
        int sum = this.amount + amount;

        if (this.capacity <= sum) {
            System.out.println("넣은 물 양은 " + (this.capacity - this.amount) + "입니다.");

            this.amount = this.capacity;

            return;
        }

        this.amount += amount;
    }

    public void decreaseAmount(int amount) {
        int sum = this.amount - amount;

        if (sum < 0) {
            System.out.println("부은 물 양은 " + this.amount + "입니다.");
            this.amount = 0;

            return;
        }

        this.amount = sum;
    }
}
