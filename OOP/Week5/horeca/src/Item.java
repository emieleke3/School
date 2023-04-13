import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static ArrayList<Item> readItemFromFile(String file) {
        ArrayList<Item> item = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(new File(file));

            fileReader.nextLine();

            while (fileReader.hasNext()) {
                String lineFromScanner = fileReader.nextLine();
                String[] lineParts = lineFromScanner.split(",");

                String name = lineParts[1];
                double price = Double.parseDouble(lineParts[2]);
                int mlOrAmount = Integer.parseInt(lineParts[3]);
                boolean alcOrFood = Boolean.parseBoolean(lineParts[4]);

                if(lineParts[0].equals("f")) {
                    Food f = new Food(name, price, mlOrAmount, alcOrFood);
                    item.add(f);
                } else if (lineParts[0].equals("d")) {
                    Drink d = new Drink(name, price, mlOrAmount, alcOrFood);
                    item.add(d);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot find CSV file: " + ex);
        }

        return item;
    }

    public String toString() {
        return name + " (" + price + ")" ;
    }
}


