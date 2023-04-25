package com.pattern.gof.abstractfactory.interfaces;

public interface FurnitureFactory {
    Sofa createSofa();

    Bed createBed();

    Desk createDesk();

    Chair createChair();
}
