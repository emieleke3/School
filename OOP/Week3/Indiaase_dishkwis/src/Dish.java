import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Dish {
    private String name;
    private String ingredients;
    private String diet;
    private int prep_time;
    private int cook_time;
    private String flavor_profile;
    private String course;
    private String state;
    private String region;

    public Dish(String name, String ingredients, String diet, int prep_time, int cook_time, String flavor_profile, String course, String state, String region) {
        this.name = name;
        this.ingredients = ingredients;
        this.diet = diet;
        this.prep_time = prep_time;
        this.cook_time = cook_time;
        this.flavor_profile = flavor_profile;
        this.course = course;
        this.state = state;
        this.region = region;
    }
    public static ArrayList<Dish> readDishFromFile(String file) {
        ArrayList<Dish> dish = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(new File(file));

            fileReader.nextLine();

            while (fileReader.hasNext()) {
                String lineFromScanner = fileReader.nextLine();
                String[] lineParts = lineFromScanner.split(";");

                String name = lineParts[0];
                String ingredients = lineParts[1];
                String diet = lineParts[2];
                int prep_time = Integer.parseInt(lineParts[3]);
                int cook_time = Integer.parseInt(lineParts[4]);
                String flavor_profile = lineParts[5];
                String course = lineParts[6];
                String state = lineParts[7];
                String region = lineParts[8];


                Dish s = new Dish(name, ingredients, diet, prep_time, cook_time, flavor_profile, course, state, region);
                dish.add(s);
            }

            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot find CSV file: " + ex);
        }
        return dish;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDiet() {
        return diet;
    }

    public int getPrep_time() {
        return prep_time;
    }

    public int getCook_time() {
        return cook_time;
    }

    public String getFlavor_profile() {
        return flavor_profile;
    }

    public String getCourse() {
        return course;
    }

    public String getState() {
        return state;
    }

    public String getRegion() {
        return region;
    }
}
