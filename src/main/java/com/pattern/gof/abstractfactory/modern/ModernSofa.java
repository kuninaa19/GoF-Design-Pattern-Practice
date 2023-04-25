package com.pattern.gof.abstractfactory.modern;

import com.pattern.gof.abstractfactory.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void description() {
        System.out.println("현대 다지인 소파");
    }
}
