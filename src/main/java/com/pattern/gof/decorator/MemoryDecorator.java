package com.pattern.gof.decorator;

public class MemoryDecorator extends ComputerDecorator {

    public static final int MEMORY_PRICE = 300000;

    public MemoryDecorator(Computer computer) {
        super(computer);
    }

    @Override
    void getDescription() {
        System.out.println("메모리용량이 추가된 노트북입니다.");
    }

    @Override
    int getPrice() {
        return this.computer.getPrice() + MEMORY_PRICE;
    }
}
