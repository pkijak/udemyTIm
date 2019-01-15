public class VegeBurgerFactory extends BurgerFactory {

    @Override
     public VegeBurger createBurger() {
        System.out.println("Vege burger created");
        return new VegeBurger();
    }
}
