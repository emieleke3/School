import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = Item.readItemFromFile("CSV/menu_items.csv");

        System.out.println("******* Order system *******");
        System.out.println("1) Show menu and place order");
        System.out.println("2) Show entire order");
        System.out.println("0) Exit!");

        System.out.println("******************************");
        Scanner s = new Scanner(System.in);
        System.out.println("Please make a selection from the menu: ");
        int input = s.nextInt();

        if(input == 1) {
            for (Item item: items) {
                System.out.print(item.getName() + " ");
                System.out.println("(" + item.getPrice() + ")");
            }
        }


    }


}
