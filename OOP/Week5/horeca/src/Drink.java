public class Drink extends Item {
    public int amountMl;
    public boolean containsAlcohol;

    public Drink(String name, double price, int amountMl, boolean containsAlcohol) {
        super(name, price);
        this.amountMl = amountMl;
        this.containsAlcohol = containsAlcohol;
    }

    public boolean containsAlcohol() {
        return containsAlcohol;
    }

    public int getAmountMl() {
        return amountMl;
    }

}
