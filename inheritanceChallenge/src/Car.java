public class Car extends Vehicle {


    private int wheels;
    private int engine;
    private boolean onOff;
    private String color;
    private int gear = 0;


    public Car() {
        this(4, 1, "black");
    }

    public Car(String color) {
        this(4, 1, color);
    }

    public Car(int wheels, int engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public String getColor() {
        return color;
    }

    public void steer(String direction) {
        System.out.println("Car is moving " + direction);
    }

    public void move(int speed) {
        if (!onOff) {
            System.out.println("You have to start engine before riding a car");
        } else {
            System.out.println("This car is moving with " + speed + " km/h");
        }
    }

    public void turnEngineOn() {
        if (onOff) {
            System.out.println("Engine already on");
        } else {
            System.out.println("Engine on");
            onOff = true;
        }
    }

    public void turnEngineOff() {
        if (!onOff) {
            System.out.println("Engine already off");
        } else {
            System.out.println("Engine off");
            onOff = false;
        }
    }

    public void gearUp() {
        if (isOnOff()) {
            gear++;
            System.out.println("You changed gear, now you are riding on " + gear + " gear");
        } else {
            System.out.println("You have to turn engine on to change gear");
        }
    }

    public void gearDown() {
        if (isOnOff()) {
            gear--;
            System.out.println("You changed gear, now you are riding on " + gear + " gear");
        } else {
            System.out.println("You have to turn engine on to change gear");
        }
    }
}