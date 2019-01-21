import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        int[] numbersArray = readIntegers(5);
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println((i + 1) + ": " + numbersArray[i]);
        }
        int minValue = findMin(numbersArray);
        System.out.println("Minimum value of this array is " + minValue);

    }


    public static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        System.out.println("You have to enter " + count + " numbers: ");

        for (int i = 0; i < intArray.length; i++) {
            if (in.hasNextInt()) {
                intArray[i] = in.nextInt();
            } else {
                System.out.println("Its not a number");
                break;
            }
        }
        return intArray;
    }

    public static int findMin(int[] array) {

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    flag = true;
                }
            }
        }
        return array[0];
    }
}
