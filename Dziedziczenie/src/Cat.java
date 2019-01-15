public class Cat extends Bird {

    public Cat(String name, boolean brain, int size, int weight, int body, int wings) {
        super(name, brain, size, weight, body, wings);
    }


    public void walk() {

    }

    public void run() {

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("cat cant fuckin fly");
    }


    //overloadinbg - rozne parametry
    public void fly(int speed) {
        System.out.println("lecisz z predkoscia kurwa: " + speed);
        this.fly();
    }
}
