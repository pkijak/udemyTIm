package resellNote;

import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

    private final int MAX_CAPACITY = 5;
    private int currentItems;

    private static Scanner in = new Scanner(System.in);

    ArrayList<Item> item = new ArrayList<>(MAX_CAPACITY);


    public void itemsList() {
        System.out.println("Dostepne przedmioty ");
        int position = 0;
        for (Item i : item) {
            System.out.println((position + 1) + " - " + i.getName() + " (" + i.getPrice() + "pln, " + i.getCondition() + "/10, " + i.getSize() + "US, " + i.getColor() + ")");
            position++;
        }
    }

    public void addQuick(String name, int price, int condition, int size) {
        item.add(new Item(name, price, condition, size));
        System.out.println("Przedmiot dodany");
    }

    public void addQuick(String name, int price, int condition, String color) {
        item.add(new Item(name, price, condition, color));
        System.out.println("Przedmiot dodany");
    }

    public void add(String typ) {
        System.out.println("Wprowadz nazwe przedmiotu :");
        String name = in.nextLine();
        System.out.println("Podaj cene przedmiotu: ");
        int price = in.nextInt();
        System.out.println("Podaj stan przedmiotu: ");
        int condition = in.nextInt();
        if (typ.equalsIgnoreCase("but")) {

            System.out.println("Podaj rozmiar buta: ");
            int size = in.nextInt();
            item.add(new Item(name, price, condition, size));
            System.out.println("But " + name + " dodany do listy");

        } else {
            System.out.println("Podaj kolor przedmiotu: ");
            String color = in.nextLine();
            item.add(new Item(name, price, condition, color));
            System.out.println("Przedmiot " + name + " dodany do listy");
        }
    }

    public void getIDitem() {
        System.out.println(item.get(0).getId());
        System.out.println(item.get(1).getId());
        System.out.println(item.get(2).getId());
    }
}