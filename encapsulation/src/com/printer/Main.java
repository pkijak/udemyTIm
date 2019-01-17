package com.printer;

public class Main {

    public static void main(String[] args) {

        Page strona1 = new Page(70,"black");
        Page strona2 = new Page(40,"red)");
        Page strona3 = new Page(10,"black");

        Printer drukarka = new Printer(new Toner());

        drukarka.getToner().fillBlack(100);
        drukarka.getToner().fillColor(100);

        for(int i = 0; i <= 10; i++)
        {
            drukarka.printPage(strona2);
        }
        System.out.println("Printed pages: " + drukarka.getPrintedPages());

    }
}
