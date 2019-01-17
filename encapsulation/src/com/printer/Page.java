package com.printer;

public class Page {

    private int procentZadrukowania;
    private String color;

    public Page(int procentZadrukowania, String color) {
        this.procentZadrukowania = procentZadrukowania;
        this.color = color;
    }

    public int getProcentZadrukowania() {
        return procentZadrukowania;
    }

    public String getColor() {
        return color;
    }
}
