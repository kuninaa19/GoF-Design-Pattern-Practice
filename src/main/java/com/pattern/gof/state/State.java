package com.pattern.gof.state;

public interface State {
    void pour(int amount, Cup cup);

    void fill(int amount, Cup cup);
}