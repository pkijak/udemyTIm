package resellNote;

import java.util.ArrayList;
import java.util.Scanner;

public class Storage {

    private final int MAX_CAPACITY = 5;
    private int currentItems;

    private static Scanner in = new Scanner(System.in);

    ArrayList<Item> items = new ArrayList<>(MAX_CAPACITY);


    public void itemsList() { // list przemdmiotow
        System.out.println("Dostepne przedmioty ");
        int position = 1;
        for (Item i : items) {
            System.out.println((position) + " - " + i.getName() + " (" + i.getPrice() + "pln, " + i.getCondition() + "/10, " + i.getSize() + "US, " + i.getColor() + ")");
            position++;
        }
    }

    public void addQuick(String name, int price, int condition, int size) { // szybkie dodawanie w konstruktorze dla buta
        items.add(new Item(name, price, condition, size));
        System.out.println("Przedmiot dodany");
    }

    public void addQuick(String name, int price, int condition, String color) { // szybkie dodawanie w konstruktorze dla ciucha
        items.add(new Item(name, price, condition, color));
        System.out.println("Przedmiot dodany");
    }

    public void add(String typ) {   // dodawanie przedmiotu, typ to but lub inny

        System.out.println("Wprowadz nazwe przedmiotu :");
        String name = in.nextLine();

        System.out.println("Podaj cene przedmiotu: ");
        int price = in.nextInt();

        System.out.println("Podaj stan przedmiotu: ");
        int condition = in.nextInt();


        if (typ.equalsIgnoreCase("but")) {

            System.out.println("Podaj rozmiar buta: ");
            int size = in.nextInt();
            items.add(new Item(name, price, condition, size));
            System.out.println("But " + name + " dodany do listy");

        } else {

            System.out.println("Podaj kolor przedmiotu: ");
            String color = in.nextLine();
            items.add(new Item(name, price, condition, color));
            System.out.println("Przedmiot " + name + " dodany do listy");
        }
    }

    public void modify() {

        System.out.println("Which item do you want to edit?");
        int position = 0;
        for (Item i : items) {
            System.out.print((position + 1) + ". " + i.getName() + " - ");
            position++;
        }
        System.out.println("");
        System.out.print("Choose item to edit: ");
        int editItem = in.nextInt();

        System.out.println("What would you like to edit to " + items.get((editItem-1)).getName() + "?");
        System.out.println("[Name] [Price] [Condition] [Size] [Color}");
        System.out.print("Edit: ");

        String edit = in.nextLine().toLowerCase(); // choose what to edit, ignore case sensitive

        switch (edit) {

            case "name":
                break;
            case "price":
                break;
            case "condition":
                break;
            case "size":
                break;
            case "color":
                break;

            default:
                System.out.println("ok fuck you");

        }

    }



    public void remove(int position) {  // usuwanie przedmiotu
        items.remove((position - 1));
    }

    public void getIDitem() {  // pobieranie id itemu
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getId());
        }
    }
}
