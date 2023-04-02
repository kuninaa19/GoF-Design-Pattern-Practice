package com.pattern.gof.templatemethod;

public class Charger {
    private final String type;
    private final float voltage;
    private final float ampere;
    private final float version;

    public Charger(String type, float voltage, float ampere, float version) {
        this.type = type;
        this.voltage = voltage;
        this.ampere = ampere;
        this.version = version;
    }

    public String getType() {
        return "충전기타입 : " + type;
    }

    public String getVoltage() {
        return "충전기 전압 : " + voltage;
    }

    public String getAmpere() {
        return "충전기 암페어 : " + ampere;
    }

    public String getVersion() {
        return "충전기 버전 : " + version;
    }

    public String getWatt() {
        return "충전기 와트 :" + (int) (voltage * ampere);
    }
}
