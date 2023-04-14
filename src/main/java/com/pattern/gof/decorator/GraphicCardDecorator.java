package com.pattern.gof.decorator;

public class GraphicCardDecorator extends ComputerDecorator {
    public static final int GRAPHIC_CARD_PRICE = 500000;

    public GraphicCardDecorator(Computer computer) {
        super(computer);
    }

    @Override
    void getDescription() {
        System.out.println("그래픽카드가 추가된 노트북입니다.");
    }

    @Override
    int getPrice() {
        return this.computer.getPrice() + GRAPHIC_CARD_PRICE;
    }
}
