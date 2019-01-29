package resellNote;

import java.util.concurrent.atomic.AtomicInteger;

public class Item {

    private String name;
    private int price;
    private int condition;
    private String color = "none";
    private int size = 0;
    private boolean sold;
    private int id;

    static AtomicInteger nextId = new AtomicInteger();

    public Item(String name, int price, int condition, String color) {
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.color = color;
        id = nextId.getAndIncrement();

    }

    public Item(String name, int price, int condition, int size) {
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.size = size;
        id = nextId.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCondition() {
        return condition;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void changeCondition(int condition) {
        this.condition = condition;
    }
}