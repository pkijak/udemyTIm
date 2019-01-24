import java.util.Scanner;

public class menu {

    private static Storage magazyn;

    static Scanner in = new Scanner(System.in);

    public static void load() {
        System.out.println("Dostepne opcje: \n");
        System.out.println("1. Sprawdz liste posiadanych przedmiotow\n" +
                "2. Sprawdz liste sprzedanych przedmiotow\n" +
                "3. Dodaj przedmiot \n" +
                "4. Oznacz przedmiot jako sprzedany \n" +
                "5. Wykaz pieniezny");

        options();
    }

    public static void options() {

        System.out.println("Wybierz opcje: ");
        int choice = in.nextInt();
        while (choice != 9) {
            switch (choice) {
                case 1:
                    magazyn.show();
                    break;
                case 2:
                    //sold;
                    break;
                case 3:
                    magazyn.add();
                    break;
                case 4:
                    magazyn.itemInfo();
                case 5:
                    // money wykaz
            }
            load();
        }

    }
}
