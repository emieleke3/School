import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CandyMachine machine = new CandyMachine();

        machine.addProduct(0, new Drink("RedBull", 2.50, 50, true));
        machine.addProduct(1, new Drink("Cola", 2.00, 40, false));

        machine.addProduct(2,  new Candy("Kit Kat", 2.00, 12));
        machine.addProduct(3,  new Candy("Bueno", 3.00, 20));
        machine.addProduct(3,  new Candy("Snickers", 1.50, 15));


    }

}
