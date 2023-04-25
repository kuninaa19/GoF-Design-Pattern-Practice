package com.pattern.gof.mediator;

public class Plane {

    private boolean isReady;
    private ATC atc;

    public void changeStatus(boolean status) {
        this.isReady = status;
    }

    public void takeOff() {
        atc.takeOff();
    }

    public void takeOffCommand() {
        System.out.println("Plane: take off ~");
        changeStatus(false);
        atc.setPlane(null);
    }

    public void waitCommand() {
        System.out.println("Plane: Wait...");
    }

    public void readyCommand() {
        System.out.println("Plane : Need to ready fast");
    }

    public boolean isReady() {
        return this.isReady;
    }

    public void setATC(ATC atc) {
        this.atc = atc;
    }
}
