import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
//        load();
        klienci();
    }

    public static void load() throws Exception{
        System.out.println("[ 1. Klienci / 2. Zamowienia / 3. Produkty / 4. Administracja (5. Wypisz menu)  ]");

        boolean flag = true;
        while (flag) {
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    klienci();
                    break;
                case 2:
                    System.out.println("Zamowienia");
                    break;
                case 3:
                    System.out.println("Produkty");
                    break;
                case 4:
                    System.out.println("Administracja");
                    break;
                case 5:
                    load();
                    break;
            }
        }
    }

    public static void klienci() throws Exception {


        System.out.println("#klient");
        try {


            File plik = new File("klient.txt");
            Scanner odczyt = new Scanner(plik);
            System.out.println(odczyt.nextLine());

            FileInputStream fis = new FileInputStream(plik);
            byte[] byteArray = new byte[(int)plik.length()];
            fis.read(byteArray);
            String data = new String(byteArray);
            String[] stringArray = data.split("\n");
            System.out.println(stringArray.length);
            System.out.println(stringArray[2]);
            System.out.println(stringArray[4]);
            //liczenie linii po, rozdzielane znakiem enter - przestudiuj

        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

        String[] klienci = new String[0];
    }
}
