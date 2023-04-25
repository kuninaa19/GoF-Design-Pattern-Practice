package com.pattern.gof.abstractfactory.retro;

import com.pattern.gof.abstractfactory.interfaces.Desk;

public class RetroDesk implements Desk {
    @Override
    public void description() {
        System.out.println("레트로 디자인 책상");
    }
}
