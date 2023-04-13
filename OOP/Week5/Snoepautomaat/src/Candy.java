public class Candy extends Product {
    private double price;
    private int weightInGrams;

    public Candy(String name, double price, int weightInGrams) {
        super(name, price);
        this.price = price;
        this.weightInGrams = weightInGrams;
    }
}
