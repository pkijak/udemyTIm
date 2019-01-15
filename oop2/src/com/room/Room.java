package com.room;

public class Room {

    private Doors doors;
    private Lamp lamp;
    private Walls walls;
    private Windows windows;

    public Room(Doors doors, Lamp lamp, Walls walls, Windows windows) {
        this.doors = doors;
        this.lamp = lamp;
        this.walls = walls;
        this.windows = windows;
    }

}
