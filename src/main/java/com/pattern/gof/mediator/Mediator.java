package com.pattern.gof.mediator;

public interface Mediator {
    void takeOff();

    void setRunway(Runway runway);

    void setPlane(Plane plane);

}
