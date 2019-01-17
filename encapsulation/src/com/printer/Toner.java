package com.printer;

public class Toner {

    private int blackTonerLevel = 0;
    private int colorTonerLevel = 0;

    public int getBlackTonerLevel() {
        return blackTonerLevel;
    }

    public int getColorTonerLevel() {
        return colorTonerLevel;
    }

    public void fillBlack(int toner) {
        if (this.blackTonerLevel + toner > 100) {
            System.out.println("You cant fill that much toner");
        } else {
            this.blackTonerLevel += toner;
            System.out.println("Black toner filled up, current level: " + blackTonerLevel);
        }
    }

    public void fillColor(int toner) {
        if (this.colorTonerLevel + toner > 100) {
            System.out.println("You cant fill that much toner");
        } else {
            this.colorTonerLevel += toner;
            System.out.println("Color toner filled up, current level: " + colorTonerLevel);
        }
    }

    public void useToner(String color, int toner) {
        if (color == "black") {
            if (blackTonerLevel - toner < 0) {
                System.out.println("You cant print without toner, fill it up");
            } else {
                blackTonerLevel = blackTonerLevel - toner;
            }
        } else {
            if (colorTonerLevel - toner < 0) {
                System.out.println("You cant print without toner, fill it up");
            } else {
                colorTonerLevel = colorTonerLevel - toner;
            }
        }

    }
}
