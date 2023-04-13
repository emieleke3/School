import java.util.ArrayList;

public class Bill {
    private ArrayList<Item> bill = new ArrayList<>();

    public void chooseItem(Item item) {
        bill.add(item);
    }

    public void showBill() {
        double total = 0;
        StringBuilder foodBuilder = new StringBuilder("foodItems: \n");
        StringBuilder drinkBuilder = new StringBuilder("drinkItems: \n");

        for(Item item: bill) {
            if(item instanceof Drink)
            {
                drinkBuilder.append(item + "\n");
            } else {
                foodBuilder.append(item + "\n");
            }
            total += item.getPrice();
        }
        System.out.println(drinkBuilder);
        System.out.println(foodBuilder);
        System.out.println("The total amount for this order: " + total + "\n\n");
    }
}
