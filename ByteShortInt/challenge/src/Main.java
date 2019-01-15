public class Main {

    public static void main(String[] args) {

        byte myByte = 45;
        short myShort = 1700;
        int myInt = 9990;


        long sumLong = 50000L + 10L *(myByte+myShort+myInt);
        System.out.println(sumLong);
    }
}
