package com.room;

public class Doors {

    private boolean isOpen;
    private String color;
    private String material;

    public Doors(boolean isOpen, String color, String material) {
        this.isOpen = isOpen;
        this.color = color;
        this.material = material;
    }

    public void close() {
        System.out.println("Doors closed");
    }

    public void open() {
        System.out.println("Doors open");
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}


