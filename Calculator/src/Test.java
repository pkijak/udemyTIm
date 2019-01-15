public class Test {

    static int wiek = 13;
    int lata;
    static String name;

    public Test(int lata, String name) {
        this.lata = lata;
        this.name = name;
    }

    public static void wypisz_wiek() {
        System.out.println(wiek);
        System.out.println(name);

    }


    public void wypisz_lata() {
        System.out.println(wiek);
        System.out.println(lata);
        System.out.println(name);
    }
}
