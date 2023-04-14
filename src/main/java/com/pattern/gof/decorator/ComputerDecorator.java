package com.pattern.gof.decorator;

public abstract class ComputerDecorator extends Computer{
    protected Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }
}
