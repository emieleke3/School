public class Drink extends Product {
    private int sugarAmount;
    private boolean isCaffeine;

    public Drink(String name, double price, int sugarAmount, boolean isCaffeine) {
        super(name, price);
        this.sugarAmount = sugarAmount;
        this.isCaffeine = isCaffeine;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public boolean isCaffeine() {
        return isCaffeine;
    }
}
