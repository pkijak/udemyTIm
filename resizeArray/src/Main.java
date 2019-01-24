import java.util.Scanner;

public class Main {

    private static int[] baseData = new int[10];
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        getNumbers(baseData);
        printArray(baseData);
        resizeArray(baseData,2);
        baseData[10] = 9;
        baseData[11] = 15;
        printArray(baseData);
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void getNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Input value " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
    }

    public static void resizeArray(int[] array, int howMuch) {
        int[] original = array;

        baseData = new int[original.length + howMuch];

        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
//        for (int i = original.length; i < array.length; i++) {
//            System.out.println("Input value "+ (i + 1) + ": ");
//            array[i] = in.nextInt();
//        }


    }
}
