public class Main {


    public static void main(String[] args) {
//          LISTA DODATKOW
//                Pomidor("Pomidor",0.30),
//                Cebula("Cebula",0.30),
//                Ogorek("Ogorek",0.40),
//                Papryka("Papryka",0.15),
//                Kielbasa("Kielbasa",0.50);

        Hamburger burger = new Hamburger("Test","Bialy",true);

        burger.dodajDodatek(Additions.Pomidor);
        burger.dodajDodatek(Additions.Pomidor);
        burger.dodajDodatek(Additions.Kielbasa);
        burger.dodajDodatek(Additions.Kielbasa);

        burger.obliczBurgera();

    }
}
