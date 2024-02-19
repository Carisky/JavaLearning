package src.Homework7;

import src.Homework7.Enums.Brand;
import src.Homework7.Enums.Color;
import src.Homework7.Enums.PowerState;
import src.Homework7.Interfaces.Powered;

public class Gamepad implements Powered {
    private final Brand brand;
    private final String consoleSerial;
    private final int connectedNumber;
    private final Color color;
    private double chargeLevel;
    private PowerState isOn;

    public Gamepad(Brand brand, int connectedNumber) {
        this.brand = brand;
        this.consoleSerial = "";
        this.connectedNumber = connectedNumber;
        this.color = Color.RED;
        this.chargeLevel = 100.0;
        this.isOn = PowerState.OFF;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getConsoleSerial() {
        return consoleSerial;
    }

    public int getConnectedNumber() {
        return connectedNumber;
    }

    public Color getColor() {
        return color;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public PowerState getIsOn() {
        return isOn;
    }

    public void setChargeLevel(double chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    @Override
    public void powerOn() {
        isOn = PowerState.ON;
    }

    @Override
    public void powerOff() {
        isOn = PowerState.OFF;
    }

    public void turnOff() {
        isOn = PowerState.OFF;
    }
}