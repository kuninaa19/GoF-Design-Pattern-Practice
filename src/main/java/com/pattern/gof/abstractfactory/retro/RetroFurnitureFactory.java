package com.pattern.gof.abstractfactory.retro;


import com.pattern.gof.abstractfactory.interfaces.*;

public class RetroFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new RetroSofa();
    }

    @Override
    public Bed createBed() {
        return new RetroBed();
    }

    @Override
    public Desk createDesk() {
        return new RetroDesk();
    }

    @Override
    public Chair createChair() {
        return new RetroChair();
    }
}
