import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        FoodQuiz quiz = new FoodQuiz(score);
        Random rand = new Random();
        boolean loop = true;
        int questionNumber = 0;
        int amountQuestions = 1;
        ArrayList<Dish> dishes = Dish.readDishFromFile("data/indian_food.csv");

        while (loop) {
            questionNumber++;
            int randNumber = rand.nextInt(dishes.size() + 1);

            System.out.println("\n ********** Question " + questionNumber + ": **********");

            System.out.println("Dish name: " + dishes.get(randNumber).getName());
            System.out.println("Ingredients: " + dishes.get(randNumber).getIngredients());


            System.out.println(FoodQuiz.getQuestionText());
            for (String answers: FoodQuiz.getAnswerOptions()) {
                System.out.println(amountQuestions++ + ". " + answers);
            }

            Scanner s = new Scanner(System.in);
            System.out.println("Please enter the number of your answer: ");
            int input = s.nextInt();

            if(input == 1 && dishes.get(randNumber).getCourse().equals("main course")
                    || input == 2 && dishes.get(randNumber).getCourse().equals("dessert")
                    || input == 3 && dishes.get(randNumber).getCourse().equals("starter")
                    || input == 4 && dishes.get(randNumber).getCourse().equals("snack")) {
                System.out.print("Correct! ");
                quiz.increaseScore();
                System.out.println("SCORE: " + quiz.getScore());
            } else {
                System.out.println("Wrong!");
                break;
            }
        }
    }
}