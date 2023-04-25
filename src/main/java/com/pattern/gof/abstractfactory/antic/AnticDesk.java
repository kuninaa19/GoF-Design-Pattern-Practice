package com.pattern.gof.abstractfactory.antic;

import com.pattern.gof.abstractfactory.interfaces.Desk;
public class AnticDesk implements Desk {
    @Override
    public void description() {
        System.out.println("엔틱 디자인 책상");
    }
}
