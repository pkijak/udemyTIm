public class Main {

    public static void main(String[] args) {


        Motherboard motherboard = new Motherboard("Super", "Lenovo", 5, 2, "Updated");
        Monitor monitor = new Monitor("R20", "LG", 21, new Resolution(1920, 1080));
        Case theCase = new Case("Testowy", "chujwie", "Mocny", new Dimensions(50, 80, 30));

        PC komputer = new PC(theCase, monitor, motherboard);

//        komputer.getMonitor().drawPixelAt(50,30,"red");
//        komputer.getMotherboard().loadPorgram("testowy");
//        komputer.getTheCase().pressPowerButton();

        komputer.powerUp();
        komputer.loadPorgram("test");

    }
}
