public class Animal {

    private String name;
    private boolean brain;
    private int size;
    private int weight;
    private int body;

    public Animal(String name, boolean brain, int size, int weight, int body) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public boolean isBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getBody() {
        return body;
    }

    public void move(int speed) {

    }

    public void eat() {
        System.out.println(this.name + " is eating");

    }
}
