import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Sorting array 0.1");
        int[] intArray = getIntegers(3);
        printArray(intArray);
        int[] sorted = sortArray(intArray);
        printArray(sorted);
        printArray(intArray);
    }


    public static int[] getIntegers(int numbers) {
        Scanner in = new Scanner(System.in);
        int values[] = new int[numbers];
        for (int i = 0; i < values.length; i++) {
            System.out.println("Wprowadz liczbe [" + (i + 1) + "]: ");
            values[i] = in.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.println("Zawartosc tablicy to:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " : " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        boolean flag = true;
        int temp;

        int[] sortedArray = new int[array.length];
        for(int i =0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }

        while (flag) {
            flag = false;
            for (int i = 0; i < (sortedArray.length - 1); i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
