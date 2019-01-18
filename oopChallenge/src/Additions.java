public enum Additions {

    Pomidor("Pomidor",0.30),
    Cebula("Cebula",0.30),
    Ogorek("Ogorek",0.40),
    Papryka("Papryka",0.15),
    Kielbasa("Kielbasa",0.50);

    private String name;
    private double price;

    Additions(String name, double price) {
       this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
