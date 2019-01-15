public class Main {

    public static void main(String[] args) {

        Car pojazd = new Car(4,1,"red");
        Car pojazd2 = new Car("blue");
        Car pojazd3 = new Car();

        System.out.println(pojazd3.getColor());
/*
        pojazd.move(5);
        pojazd.turnEngineOn();
        pojazd.move(3);
        pojazd.turnEngineOff();
*/
        Skyline nissan = new Skyline();
        Skyline nissan2 = new Skyline(4,1,"blue",2,"nie pamietam", Skyline.tireType.NORMAL);


        nissan.move(5);
        nissan.turnLights();
        nissan.turnEngineOn();
        nissan.turnLights();





    }
}
