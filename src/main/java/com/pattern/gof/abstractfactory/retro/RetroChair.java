package com.pattern.gof.abstractfactory.retro;


import com.pattern.gof.abstractfactory.interfaces.Chair;

public class RetroChair implements Chair {
    @Override
    public void description() {
        System.out.println("레트로 디자인 의자");
    }
}
