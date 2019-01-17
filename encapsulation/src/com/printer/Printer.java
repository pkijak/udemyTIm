package com.printer;

public class Printer {

    private int printedPages = 0;
    private Toner toner;
    private boolean duplexPrinter;


    public Printer(Toner toner) {
        this.toner = toner;
    }

    public void printPage(Page page) {

        System.out.println("Printing page number " + (printedPages + 1));
        if (page.getProcentZadrukowania() > 0 && page.getProcentZadrukowania() < 35) {
            toner.useToner(page.getColor(), 5);
        } else if (page.getProcentZadrukowania() > 35 && page.getProcentZadrukowania() < 70) {
            toner.useToner(page.getColor(), 10);
        } else {
            toner.useToner(page.getColor(), 15);
        }
        System.out.println("Page printed...");
    }

    public Toner getToner() {
        return toner;
    }

    public void checkTonerLevel() {
        System.out.println("Black toner level: " + toner.getBlackTonerLevel() + "%");
        System.out.println("Color toner level: " + toner.getColorTonerLevel() + "%");
    }

    public int getPrintedPages() {
        return printedPages;
    }
}
