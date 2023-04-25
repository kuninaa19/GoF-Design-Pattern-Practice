package com.pattern.gof.abstractfactory.modern;

import com.pattern.gof.abstractfactory.interfaces.*;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Bed createBed() {
        return new ModernBed();
    }

    @Override
    public Desk createDesk() {
        return new ModernDesk();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
