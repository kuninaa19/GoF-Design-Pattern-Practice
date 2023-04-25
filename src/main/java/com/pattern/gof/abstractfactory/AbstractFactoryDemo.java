package com.pattern.gof.abstractfactory;


import com.pattern.gof.abstractfactory.interfaces.*;
import com.pattern.gof.abstractfactory.retro.RetroFurnitureFactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new RetroFurnitureFactory();

        Bed bed = furnitureFactory.createBed();
        Sofa sofa = furnitureFactory.createSofa();
        Chair chair = furnitureFactory.createChair();
        Desk desk = furnitureFactory.createDesk();

        bed.description();
        sofa.description();
        chair.description();
        desk.description();
    }
}
