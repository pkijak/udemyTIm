public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        EnhancedPlayer gracz = new EnhancedPlayer("Przemek","Sword");

        player.name = "Przemek";
        player.health = 500;
        player.weaopn = "GLOCK";


//        player.loseHealth(5);
//        player.loseHealth(95);
//        System.out.println(player.healthRemaining());

        gracz.getName();
        gracz.damagePlayer(40);

    }
}
