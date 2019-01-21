public class Main {

    public static void main(String[] args) {

        int[] intArray = {5, 4, 3, 2, 1};
        printArray(intArray);
        reverse(intArray);
        printArray(intArray);

    }

    public static void reverse(int[] array) {

        int[] tempArray = new int[array.length];
        int licznik = 0;
        for (int i = tempArray.length - 1; i >= 0; i--) { // odwrócenie kolejności elementów
            tempArray[i] = array[licznik];
            licznik++;
        }
        for (int i = 0; i < tempArray.length; i++) {
            array[i] = tempArray[i];
        }
    }

    public static void printArray(int[] array) {
        System.out.println("Zawartosc tablicy to:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
