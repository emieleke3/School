package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        int numberOfSeats = 50;
        int compartmentClass = 2;
        TrainCompartment train = new TrainCompartment(numberOfSeats, compartmentClass);

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show compartment details ");
            SaxionApp.printLine("* 2) Passenger enters");
            SaxionApp.printLine("* 3) Passenger leaves");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                int seats = train.getNumberOfSeats();
                int trainClass = train.getCompartmentClass();
                int seatsInUse = train.getNumberofSeatsFilled();

                SaxionApp.printLine("Number of seats: " + seats);
                SaxionApp.printLine("Compartment class: " + trainClass);
                SaxionApp.printLine("Number of seats in use: " + seatsInUse);
                SaxionApp.pause();

            } else if (menuInput == 2) {

                // TODO: Your implementation here
                SaxionApp.printLine("A passenger enters the train...");
                train.enter();
                SaxionApp.pause();
            } else if (menuInput == 3) {
                // TODO: Your implementation here
                SaxionApp.printLine("A passenger leaves the train...");
                train.leaves();
                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }
}