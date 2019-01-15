public class Main {

    //KALKULATOR
    /*
    public static void main(String[] args) {
        System.out.println("Menu: \n" +
                "1. Dodawanie\n" +
                "2. Odejmowanie\n" +
                "3. Mnozenie\n" +
                "4.- wyjscie");
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Wprowadz polecenie:");
            int choice = in.nextInt();
            if (choice > 4 || choice < 1) {
                System.out.println("chyba cie pojebalo kurwa robaku jebany");
            } else {
                switch (choice) {
                    case 1:
                        Calculator.Dodawanie();
                        break;
                    case 2:
                        Calculator.Odejmowanie();
                        break;
                    case 3:
                        Calculator.Mnozenie();
                        break;
                    case 4:
                        flag = false;
                        System.out.println("Wyszedles z kalkulatora");
                        break;
                }
            }
        }
    }
    */

    public static void main(String[] args) {

        Test obiekt = new Test(12, "pies");

        obiekt.wypisz_lata();

        Test obiek2 = new Test(30,"test2");

        obiekt.wypisz_lata();
        obiek2.wypisz_lata();

    }


}