package resellNote;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static String commands = "[-1 - QUIT] [0 - DOSTEPNE POLECENIA][1 - LISTA PRZEDMIOTOW] [2 - DODAJ PRZEDMIOT]  " +
            "[3 - EDYTUJ PRZEDMIOT] [4 - USUN PRZEDMIOT] [5 - BILANS]";

    public static void main(String[] args) {
        System.out.println("[    resell note    ]");
        System.out.println("Menu:\n" +
                "[-1] Quit \n" +
                "[0] Dostepne polecenia\n" +
                "[1] Lista Przedmiotow\n" +
                "[2] Dodaj Przedmiot \n" +
                "[3] Edytuj Przedmiot\n" +
                "[4] Usun Przedmiot\n" +
                "[5] Bilans\n");

        Storage storage = new Storage();


        int choice = 0;
        boolean quit = false;

        while (!quit) {
            try {
                System.out.print("Wprowadz polecenie: ");
                choice = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Polecenie niepoprawne");
                in.nextLine();
            }

            switch (choice) {
                default:
                    System.out.println("Wybrano niepoprawna opcje, wprowadz polecenie");
                    break;
                case -1:
                    System.out.println("Zamykanie aplikacji");
                    quit = true;
                    break;
                case 0:
                    System.out.println(commands);
                    break;
                case 1:
                    storage.itemsList();
                    break;
                case 2:
                    storage.addQuick("Pirate Black", 900, 8, 11);
                    storage.addQuick("Bogo", 1200, 9, "Black");
                    storage.addQuick("Beluga", 1400, 7, 10);
                    break;
                case 3:
                    storage.modify();
                    break;
                case 4:
                    System.out.println("Usun przedmiot");
                    storage.remove(in.nextInt());
                    break;
                case 5:
                    storage.getIDitem();

                    break;
            }
        }
    }
}
