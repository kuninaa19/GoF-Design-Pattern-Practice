package com.pattern.gof.templatemethod;

public abstract class ChargerTemplate {
    protected final Charger charger;

    public ChargerTemplate(Charger charger) {
        this.charger = charger;
    }

    public void display() {
        this.getType();
        this.getVoltage();
        this.getAmpere();
        this.getWatt();
        this.getVersion();
    }

    protected abstract void getType();

    protected abstract void getWatt();

    protected abstract void getVoltage();

    protected abstract void getAmpere();

    protected abstract void getVersion();
}
