package com.room;

public class Room {

    private Doors doors;
    private Lamp lamp;
    private Walls wall1;
    private Walls wall2;
    private Walls wall3;
    private Walls wall4;
    private Windows windows;

    public Room(Doors doors, Lamp lamp, Walls wall1, Walls wall2, Walls wall3, Walls wall4, Windows windows) {
        this.doors = doors;
        this.lamp = lamp;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.windows = windows;
    }

    public Doors getDoors() {
        return doors;
    }

    public void enter() {
        openDoors();
        lightsOn();
        System.out.println("You has entered the room");
    }

    public void openWindows() {
        windows.open();
    }


    private void openDoors() {
        doors.open();
    }

    private void lightsOn() {
        lamp.lightOn();
    }


}
