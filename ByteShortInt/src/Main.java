public class Main {

    public static void main(String[] args) {

        // int has width \  of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);

        System.out.println("myTotal = " + myTotal);

        // byte has width of 8
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte myNewByteValue = (byte) (myMinByte/2);
        System.out.println("myNewByteValue = " + myNewByteValue);


        // short is width of 16
        short myShortValue = 30000;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has width of 64
        long myLongvalue = 100L;
        long myNewLongValue = (long) (myLongvalue/2);
        System.out.println("myNewLongeValue = " + myNewLongValue);



    }
}
