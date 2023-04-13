public class Food extends Item {
    private int forHowManyPeople;
    private boolean hot;

    public Food(String name, double price, int forHowManyPeople, boolean hot) {
        super(name, price);
        this.forHowManyPeople = forHowManyPeople;
        this.hot = hot;
    }

    public int getForHowManyPeople() {
        return forHowManyPeople;
    }

    public boolean isHot() {
        return hot;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + "hot: " + hot + ", for " + forHowManyPeople + " people.]";
    }
}
