package com.room;

public class Windows {
    private boolean isOpen = false;


    public Windows() {
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Window is open now");
        } else {
            System.out.println("Window is already open");
        }
    }

    public void close() {
        if (isOpen) {
            System.out.println("Windows is closed now");
            isOpen = false;
        } else {
            System.out.println("Windows is already closed");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}
