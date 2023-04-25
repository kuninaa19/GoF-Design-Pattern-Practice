package com.pattern.gof.abstractfactory.antic;

import com.pattern.gof.abstractfactory.interfaces.Sofa;

public class AnticSofa implements Sofa {
    @Override
    public void description() {
        System.out.println("엔틱 디자인 소파");
    }
}
