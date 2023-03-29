import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean loop = true;

        int randNumber = rand.nextInt(100);
        randNumber += 1;


        int turn = 0;

        System.out.println("********************************************************");
        System.out.println("*** Higher! Lower!                                   ***");
        System.out.println("********************************************************");

        while (loop) {

            Scanner s = new Scanner(System.in);
            System.out.print("Please guess a number: ");
            int input = s.nextInt();

            if (input > randNumber) {
                System.out.println("Too high!");
                turn++;
            } else if (input < randNumber) {
                System.out.println("Too low!");
                turn++;
            } else {
                System.out.println("\n\n Correct! The correct answer was " + randNumber);
                System.out.println("You needed " + turn + " turns to guess the correct answer.");

                Scanner r = new Scanner(System.in);
                System.out.println("Do you want to play again (y/n): ");
                String reset = r.nextLine();
                reset.toLowerCase();

                if (reset.equals("n")) {
                    loop = false;
                } else if (reset.equals("y")) {
                    randNumber = rand.nextInt(100);
                }

            }
        }
    }
}