package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }
    // TEST - Scenario 1: The successful way
    // plane.loadPassengers();
    // plane.loadLuggage();
    // plane.lockDoors();
    // plane.depart();

    // TEST - Scenario 2: Failure due to locked doors
    // plane.lockDoors();
    // plane.loadPassengers(); <-- This should result in a print stating that we cannot depart!

    // TEST - Scenario 3: Failure due to not loading passengers
    // plane.loadLuggage();
    // plane.lockDoors();
    // plane.depart(); <-- This should result in a print stating that we cannot depart!
    public void run() {
        int passengers = 0;
        int luggage = 0;
        int planeSeats = 120;
        int luggagePlace = 120;
        boolean doorsUnlocked = true;

        Airplane airplane = new Airplane();

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load passengers");
            SaxionApp.printLine("* 2) Load luggage");
            SaxionApp.printLine("* 3) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                SaxionApp.printLine("Loading passengers..");

                airplane.loadPassengers();

                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.printLine("Loading luggage..");

                airplane.loadLuggage();

                SaxionApp.pause();
            } else if (menuInput == 3) {

                if(doorsUnlocked) {
                    airplane.lockDoors();
                    doorsUnlocked = false;
                } else {
                    airplane.unlockDoors();
                    doorsUnlocked = true;
                }

                SaxionApp.pause();
            } else if (menuInput == 9) {

                airplane.depart();

                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }
}
