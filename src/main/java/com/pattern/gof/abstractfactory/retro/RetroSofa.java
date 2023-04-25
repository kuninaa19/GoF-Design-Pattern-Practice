package com.pattern.gof.abstractfactory.retro;


import com.pattern.gof.abstractfactory.interfaces.Sofa;

public class RetroSofa implements Sofa {
    @Override
    public void description() {
        System.out.println("레트로 디자인 소파");
    }
}
