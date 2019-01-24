public class Item {

    private String nazwa;
    private int cena;
    private int stan;

    public Item(String nazwa, int cena, int stan) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.stan = stan;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getCena() {
        return cena;
    }

    public int getStan() {
        return stan;
    }
}
