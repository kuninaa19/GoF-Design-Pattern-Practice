package com.pattern.gof.templatemethod;

public class DetailChargerScript extends ChargerTemplate {
    public DetailChargerScript(Charger charger) {
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
        System.out.println(charger.getVoltage());
    }

    @Override
    protected void getAmpere() {
        System.out.println(charger.getAmpere());
    }

    @Override
    protected void getVersion() {
        System.out.println(charger.getVersion());
        System.out.println("충전기 타입의 버전으로 QC의 경우 1.0, 2.0, 3.0, 4.0 버전이 있습니다");
    }
}
