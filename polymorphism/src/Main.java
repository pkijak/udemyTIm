class Car {

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        engine = true;
        wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate";
    }

    public String stop() {
        return "Car -> stop";
    }

}

class Supra extends Car {

    public Supra() {
        super("Supra", 2);
    }

    @Override
    public String startEngine() {
        return "Supra -> start engine";
    }

    @Override
    public String accelerate() {
        return " Supra -> accelerate";
    }

    @Override
    public String stop() {
        return "Supra -> stop";
    }
}

class Skyline extends Car {

    public Skyline() {
        super("Skyline", 6);
    }

    @Override
    public String startEngine() {
        return "Skyline -> start engine";

    }

    @Override
    public String accelerate() {
        return "Skyline -> accelerate";
    }

    @Override
    public String stop() {
        return "Skyline -> stop";
    }
}

class Fiat extends Car {

    public Fiat() {
        super("FIat", 2);
    }

    @Override
    public String startEngine() {
        return "Fiat start engine";

    }

    @Override
    public String accelerate() {
        return "Fiat accelerate";
    }

    @Override
    public String stop() {
        return "Fiat stop";
    }
}


public class Main {


    public static void main(String[] args) {
        Car supra = new Supra();
        Car skyline = new Skyline();
        Car fiat = new Fiat();

        System.out.println(supra.accelerate());
        System.out.println(skyline.startEngine());
        System.out.println(fiat.stop());

    }
}
