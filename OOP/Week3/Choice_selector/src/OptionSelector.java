import java.util.ArrayList;
import java.util.Scanner;

public class OptionSelector {
    ArrayList<Person> personArray = new ArrayList<>();
    public OptionSelector () {
    }
    public void addOption(Person option) {
        personArray.add(option);
    }
    public Person promptMenu() {
        int amount = 0;
        System.out.println("***************** Option selector *****************");
        for (int i = 0; i < personArray.size(); i++) {
            amount++;
            System.out.println(amount + ") " + personArray.get(i).toString());
        }

        System.out.print("Please select a value: ");
        Scanner consoleScanner = new Scanner(System.in);
        int value = consoleScanner.nextInt();

        while(true) {
            if(value > amount) {
                System.out.print("Invalid value. please try again ");
                value = consoleScanner.nextInt();
            } else if (value < 0) {
                System.out.print("Invalid value. please try again ");
                value = consoleScanner.nextInt();
            } else {
                break;
            }
        }

        return personArray.get(value - 1);
    }
}
