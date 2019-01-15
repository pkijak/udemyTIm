package com.room;

public class Lamp {

    private String model;
    private boolean isOn = false;

    public Lamp(String model) {
        this.model = model;
    }

    public void lightOn() {
        if (!isOn) {
            System.out.println("Lights on");
            isOn = true;
        } else {
            System.out.println("Lights are already on");
        }
    }

    public void lightOff() {
        if (isOn) {
            System.out.println("Lights off");
            isOn = false;
        } else {
            System.out.println("Light already off");
        }
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }
}
