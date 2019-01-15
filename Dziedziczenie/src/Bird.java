public class Bird extends Animal{

    private int wings;

    public Bird(String name, boolean brain, int size, int weight, int body, int wings) {
        super(name, brain, size, weight, body);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("but loudly");
    }
}
