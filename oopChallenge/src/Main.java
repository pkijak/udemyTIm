public class Main {


    public static void main(String[] args) {

        Hamburger burger = new Hamburger("Biale", true);

        Additions pomidor = new Additions("Pomidor", 0.31);
        Additions salata = new Additions("Salata", 0.31);
        Additions ogorek = new Additions("Ogorek", 0.31);
        Additions papryka = new Additions("Papryka", 0.31);
        Additions cebula = new Additions("Cebula", 0.31);
        Additions kukurydza = new Additions("Kukurydza", 0.31);
        Additions ser = new Additions("Ser", 0.31);
        Additions czosnek = new Additions("Czosnek", 0.31);

        burger.dodajDodatek(pomidor);
        burger.dodajDodatek(salata);
        burger.dodajDodatek(kukurydza);
        burger.dodajDodatek(czosnek);
        burger.dodajDodatek(ser);
    }
}
