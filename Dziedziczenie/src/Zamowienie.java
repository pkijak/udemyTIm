public class Zamowienie {

    private int id;
    private int cena;
    private int test;
    private String name;

    
    public Zamowienie() {
        this(0,"default");
    }

    public Zamowienie(int test, String name) {
        this(0,0,test,name);
    }

    public Zamowienie(int id, int cena, int test, String name) {
        this.id = id;
        this.cena = cena;
        this.test = test;
        this.name = name;
    }
}
