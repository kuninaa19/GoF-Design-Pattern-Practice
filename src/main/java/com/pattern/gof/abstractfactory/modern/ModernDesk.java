package com.pattern.gof.abstractfactory.modern;

import com.pattern.gof.abstractfactory.interfaces.Desk;

public class ModernDesk implements Desk {
    @Override
    public void description() {
        System.out.println("현대 디자인 책상");
    }
}
