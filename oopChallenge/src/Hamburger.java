public class Hamburger {

    private String name = "Base Burger";
    private int basePrice = 3;
    private String breadRollType;
    private boolean meat;
    private double currentPrice = 3;
    private int maxDodatkow = 4;
    private int iloscDodatkow = 0;

    public Hamburger(String breadRollType, boolean meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public void dodajDodatek(Additions addition) {

        if (iloscDodatkow == maxDodatkow) {
            System.out.println("Nie mozesz dodac nic wiecej do tego burgera");
        } else {
            currentPrice = currentPrice + addition.getPrice();
            System.out.println(addition.getName() + " zostal dodany do Twojego burgera");
            iloscDodatkow++;
        }
    }

    public void getPrice() {
        System.out.println("Obecny koszt burgera to : " + currentPrice);
    }

}
