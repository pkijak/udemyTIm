public class Main {


    public static void main(String[] args) {
//          LISTA DODATKOW
//                Pomidor("Pomidor",0.30),
//                Cebula("Cebula",0.30),
//                Ogorek("Ogorek",0.40),
//                Papryka("Papryka",0.15),
//                Kielbasa("Kielbasa",0.50);

        Hamburger burger = new Hamburger("Test","Bialy",true);
//
//        burger.dodajDodatek(Additions.Pomidor);
//        burger.dodajDodatek(Additions.Cebula);
//        burger.dodajDodatek(Additions.Ogorek);
//        burger.dodajDodatek(Additions.Papryka);
//        burger.obliczBurgera();

        Hamburger zdrowy = new HealthyBurger("Wege","White",false);

        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.dodajDodatek(Additions.Ogorek);
        zdrowy.obliczBurgera();


    }
}
