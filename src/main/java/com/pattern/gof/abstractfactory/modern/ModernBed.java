package com.pattern.gof.abstractfactory.modern;

import com.pattern.gof.abstractfactory.interfaces.Bed;

public class ModernBed implements Bed {
    @Override
    public void description() {
        System.out.println("현대 디자인 침대");
    }
}
