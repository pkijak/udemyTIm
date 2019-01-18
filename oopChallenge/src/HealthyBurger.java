public class HealthyBurger extends Hamburger {

    private String name;
    private int basePrice = 2;
    private double price = 0;
    private String breadType;
    private boolean meat;
    private Additions[] additions = new Additions[6];
    private int liczbaDodatkow = 0;


    public HealthyBurger(String name, String breadType, boolean meat) {
        super(name, breadType, meat);

    }


    public void dodajDodatek(Additions dodatek) {
        if (liczbaDodatkow >= additions.length) {
            System.out.println("Maksymalna ilosc dodatkow osiagnieta");
        } else {
            additions[liczbaDodatkow] = dodatek;
            if (liczbaDodatkow == 0) {
                price = basePrice + additions[liczbaDodatkow].getPrice();
            } else {
                price += additions[liczbaDodatkow].getPrice();
            }
            System.out.println(additions[liczbaDodatkow].getName() + " zostal dodany do Twojego burgera, " +
                    "jego cena wynosi " + additions[liczbaDodatkow].getPrice());
            liczbaDodatkow++;
        }
    }

    public void obliczBurgera() {
        System.out.println("Cena poczatkowa Twojego burgera wynosila " + this.basePrice + "zl");
        System.out.println("Dodales do niego obecnie: ");
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] != null) {
                System.out.println((i + 1 + ". " + additions[i].getName()
                        + "(" + additions[i].getPrice() + "zl)"));

            } else {
                System.out.println("Brak dodatku");
            }
        }
        System.out.println("Calkowity koszt burgera to " + price + "zl");
    }
}