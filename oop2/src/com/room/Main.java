package com.room;

public class Main {

    public static void main(String[] args) {

        Doors doors = new Doors(false, "red", "wood");
        Lamp lamp = new Lamp("R13");
        Walls walls = new Walls(15, "black");
        Windows windows = new Windows();


        Room room = new Room(doors,lamp,walls,walls,walls,walls,windows);

        room.enter();
        room.openWindows();

        room.getDoors().close();

    }


}
