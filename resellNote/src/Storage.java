import java.util.Scanner;

public class Storage {

    private static Scanner in = new Scanner(System.in);
    private static Item[] items = new Item[10];
    private static int liczbaItemow = 0;


    public static void show() {
        System.out.println("Aktualnie posiadane przez Ciebie przedmioty to: ");
    }

    public static void add() {
        System.out.println("Wprowadz nazwe przedmiotu: ");
        String name = in.nextLine();
        System.out.println("Wprowadz cene za ktora kupiles przedmiot: ");
        int cena = in.nextInt();
        System.out.println("Stan przedmiotu: ");
        int stan = in.nextInt();
        items[liczbaItemow] = new Item(name, cena, stan);


    }

    public static int getLiczbaItemow() {
        return liczbaItemow;
    }

    public static void itemInfo() {
        System.out.println("Wprowadz numer przedmiotu: " );
        int id = in.nextInt();
        System.out.println("Wybrany przez Ciebie przedmiot to : \n" +
                "Nazwa: " + items[id].getNazwa() +
                "\n Cena: " + items[id].getCena() +
                "\n Stan: " + items[id].getStan() + "/10");
        System.out.println("testuje sobie co tu mozna wstawic");
    }
}
