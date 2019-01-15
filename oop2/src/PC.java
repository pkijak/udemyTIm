public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void loadPorgram(String program) {
        motherboard.loadPorgram(program);
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        System.out.println("Welcome to " + motherboard.getManufacturer() + " systemn!");
        monitor.drawPixelAt(50,50,"red");
    }
}
