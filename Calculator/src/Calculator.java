import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    }


    public static void Dodawanie() {
        System.out.println("Ile liczb chcesz do siebie dodac?");
        Scanner in = new Scanner(System.in);
        int iloscLiczb = in.nextInt();
        int[] liczby = new int[iloscLiczb];
        int wynik = 0;
        for (int i = 0; i < iloscLiczb; i++) {
            System.out.println("Liczba " + (i + 1) + ":");
            liczby[i] = in.nextInt();
            wynik += liczby[i];
        }
        System.out.print("Wynik " + wynik);
    }


    public static void Odejmowanie() {
        System.out.println("Ile liczb chcesz od siebie odjac?");
        Scanner in = new Scanner(System.in);
        int iloscLiczb = in.nextInt();
        int wynik = 0;
        System.out.println("Wprowadz pierwsza liczbe: ");
        int pierwsza = in.nextInt();
        wynik = pierwsza;
        for (int i = 0; i < iloscLiczb - 1; i++) {
            System.out.println("Wprowadz liczbe " + (i + 1) + ":");
            int liczba = in.nextInt();
            wynik -= liczba;
        }
        System.out.println("Wynik: " + wynik);

    }

    public static void Mnozenie() {
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe: ");
        int liczba = in.nextInt();
        System.out.println("Wprowadz liczbe 2:");
        int liczba2 = in.nextInt();
        System.out.println("Wynik to: " + (liczba * liczba2));
    }


}