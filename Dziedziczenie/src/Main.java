public class Main {



    public static void main(String[] args) {

        BurgerFactory fabryka = new BurgerFactory();
        VegeBurgerFactory fabrykaVege = new VegeBurgerFactory();


        fabrykaVege.createBurger();
        fabryka.createBurger();


    }
}
