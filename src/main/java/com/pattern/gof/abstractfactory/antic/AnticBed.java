package com.pattern.gof.abstractfactory.antic;


import com.pattern.gof.abstractfactory.interfaces.Bed;

public class AnticBed implements Bed {
    @Override
    public void description() {
        System.out.println("엔틱 디자인 침대");
    }
}
