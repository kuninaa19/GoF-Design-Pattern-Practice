package com.pattern.gof.abstractfactory.antic;

import com.pattern.gof.abstractfactory.interfaces.Chair;

public class AnticChair implements Chair {
    @Override
    public void description() {
        System.out.println("엔틱 디자인 의자");
    }
}
