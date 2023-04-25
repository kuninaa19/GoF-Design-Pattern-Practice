package com.pattern.gof.abstractfactory.modern;

import com.pattern.gof.abstractfactory.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void description() {
        System.out.println("현대 디자인 의자");
    }
}
