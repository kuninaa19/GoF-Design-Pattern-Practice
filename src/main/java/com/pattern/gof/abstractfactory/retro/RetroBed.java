package com.pattern.gof.abstractfactory.retro;


import com.pattern.gof.abstractfactory.interfaces.Bed;

public class RetroBed implements Bed {
    @Override
    public void description() {
        System.out.println("레트로 디자인 침대");
    }
}
