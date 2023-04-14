package com.pattern.gof.decorator;

public class Laptop extends Computer{
    @Override
    void getDescription() {
        System.out.println("일반 노트북 입니다.");
    }

    @Override
    int getPrice() {
        return 1000000;
    }
}
