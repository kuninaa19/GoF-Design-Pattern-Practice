package com.pattern.gof.templatemethod;

public class SimpleChargerScript extends ChargerTemplate {

    public SimpleChargerScript(Charger charger) {
        super(charger);
    }

    @Override
    protected void getType() {
        System.out.println(charger.getType());
    }

    @Override
    protected void getWatt() {
        System.out.println(charger.getWatt());
    }

    @Override
    protected void getVoltage() {

    }

    @Override
    protected void getAmpere() {

    }

    @Override
    protected void getVersion() {
        System.out.println(charger.getVersion());
    }
}
