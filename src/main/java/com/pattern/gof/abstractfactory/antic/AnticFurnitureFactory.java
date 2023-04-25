package com.pattern.gof.abstractfactory.antic;


import com.pattern.gof.abstractfactory.interfaces.FurnitureFactory;
import com.pattern.gof.abstractfactory.interfaces.*;

public class AnticFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new AnticSofa();
    }

    @Override
    public Bed createBed() {
        return new AnticBed();
    }

    @Override
    public Desk createDesk() {
        return new AnticDesk();
    }

    @Override
    public Chair createChair() {
        return new AnticChair();
    }
}
