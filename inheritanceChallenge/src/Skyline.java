public class Skyline extends Car {


    enum tireType {DRIFT, NORMAL, STREET}

    ;

    private int windows;
    private String model;
    private tireType opony;
    private boolean lights = false;

    public Skyline() {
        this(4, 1, "black", 2, "R34", tireType.STREET);
    }

    public Skyline(int windows, String model, tireType opony) {
        this(4, 1, "black", windows, model, opony);

    }

    public Skyline(int wheels, int engine, String color, int windows, String model, tireType opony) {
        super(wheels, engine, color);
        this.windows = windows;
        this.model = model;
        this.opony = opony;
    }

    public int getWindows() {
        return windows;
    }

    public String getModel() {
        return model;
    }

    public tireType getOpony() {
        return opony;
    }

    public boolean isLights() {
        return lights;
    }

    @Override
    public void move(int speed) {
        if (isOnOff()) {
            System.out.println("Nissan is moving with " + speed + " km/h");
        } else {
            System.out.println("You have to turn Nissan engine on before you ride");
        }
    }

    @Override
    public void turnEngineOn() {
        System.out.println("Nissan engine is turned on");
        super.turnEngineOn();
    }

    @Override
    public void turnEngineOff() {
        System.out.println("Nissan engine turned off");
        super.turnEngineOff();
    }

    @Override
    public void steer(String direction) {
        System.out.println("Nissan is moving " + direction);
    }

    public void turnLights() {
        if (isOnOff()) {
            if (!isLights()) {
                System.out.println("Lights turned on");
                lights = true;
            } else {
                System.out.println("Lights turned off");
                lights = false;
            }
        } else {
            System.out.println("You have to turn engine on to turn lights");
        }
    }
}