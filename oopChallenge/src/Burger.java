public abstract class Burger {

    private String name;
    private int basePrice;
    private String breadRollType;
    private boolean meat;
    private double currentPrice;
    private int maxDodatkow;
    private int iloscDodatkow;

    public abstract void dodajDodatek(Additions addition);

}
