import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = Item.readItemFromFile("CSV/menu_items.csv");
        Bill bill = new Bill();
        int menuItem = 0;

        while(true) {
            System.out.println("******* Order system *******");
            System.out.println("1) Show menu and place order");
            System.out.println("2) Show entire order");
            System.out.println("0) Exit!");
            System.out.println("******************************");
            Scanner s = new Scanner(System.in);
            System.out.print("Please make a selection from the menu: ");
            int input = s.nextInt();

            if(input == 1) {
                for (Item item: items) {
                    menuItem++;
                    System.out.println( menuItem + " " + item);
                }
                System.out.print("\nPlease select a value: ");
                int select = s.nextInt();
                bill.chooseItem(items.get(select - 1));
            } else if (input == 2) {
                bill.showBill();
            } else if (input == 0) {
                break;
            }
        }
    }


}
