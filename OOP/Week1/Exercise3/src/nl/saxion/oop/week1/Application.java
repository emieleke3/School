package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        String type = "Toyota";
        String numberPlate = "(bla-32-1)";
        double tankSize = 50.0;
        double consumption = 8.0;
        double currentTank = 50.0;
        int kilometers = 0;

        Car car = new Car(type, numberPlate, tankSize, currentTank, consumption, kilometers );

        int menuInput = -1;

        do {
           SaxionApp.printLine("*********************************");
           SaxionApp.printLine("1) Display statistics of the car");
           SaxionApp.printLine("2) Drive some kilometers");
           SaxionApp.printLine("3) Refuel");
           SaxionApp.printLine("0) Exit program");
           SaxionApp.printLine("*********************************");
           menuInput = SaxionApp.readInt();

           if (menuInput == 1) {
                car.toStringCar();
                SaxionApp.pause();
                SaxionApp.clear();
           }
           if (menuInput == 2) {
                car.drive();
                SaxionApp.pause();
                SaxionApp.clear();
           }
           if (menuInput == 3) {
                car.fuel();
                SaxionApp.pause();
                SaxionApp.clear();
           }

        } while (menuInput != 0);
    }

}