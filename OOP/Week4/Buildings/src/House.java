public class House extends Building {
    private String owner;
    private boolean hasGarage;
    private int price;

    public House(String address, String zipCode, int area, String owner, boolean hasGarage, int price) {
        super(address, zipCode, area);
        this.owner = owner;
        this.hasGarage = hasGarage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "owner='" + owner + '\'' +
                ", hasGarage=" + hasGarage +
                ", price=" + price +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", area=" + area +
                '}';
    }
}
