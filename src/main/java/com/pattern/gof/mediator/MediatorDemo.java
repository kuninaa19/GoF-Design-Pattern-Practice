package com.pattern.gof.mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        ATC atc = new ATC();
        Runway runway = new Runway(atc);
        Plane plane = new Plane();
        plane.setATC(atc);

        atc.setPlane(plane);
        atc.setRunway(runway);

        runway.changeStatus(true);
        plane.changeStatus(true);

        plane.takeOff();
    }
}
