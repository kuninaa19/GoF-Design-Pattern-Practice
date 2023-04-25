package com.pattern.gof.mediator;

public class Runway {

    private final ATC atc;
    private boolean isReady;

    public Runway(ATC atc) {
        this.atc = atc;
        this.isReady = false;
    }

    public void waitCommand() {
        System.out.println("Runway: Wait..");
    }

    public void readyCommand() {
        System.out.println("Runway : Need to ready fast");
    }

    public boolean isReady() {
        return isReady;
    }

    public void changeStatus(boolean status) {
        this.isReady = status;
    }
}
