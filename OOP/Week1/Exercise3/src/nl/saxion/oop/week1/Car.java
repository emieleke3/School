package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Car {
    private String type;
    private String numberPlate;
    private double tankSize;
    private double currentTank;
    private double consumption;
    private int kilometers;

    public Car (String type, String numberPlate, double tankSize, double currentTank, double consumption, int kilometers) {
        this.type = type;
        this.numberPlate = numberPlate;
        this.tankSize = tankSize;
        this.currentTank = currentTank;
        this.consumption = consumption;
        this.kilometers = kilometers;
    }

    public void toStringCar() {
        SaxionApp.printLine(type + numberPlate + ", " + currentTank + " litres " + kilometers);
    }
    public void drive() {
        SaxionApp.print("How many kilometers are you going to drive? ");
        int amount = SaxionApp.readInt();

        double calculation = 1 / consumption * amount;

        if (calculation >= currentTank) {
            SaxionApp.printLine("You cant drive that far!");
        } else {
            double amountLeft = currentTank - calculation;
            currentTank = amountLeft;
            SaxionApp.printLine("You have " + amountLeft + " in your tank");
        }
    }
    public void fuel() {
            SaxionApp.printLine("How much liters do you want?");
            double amount = SaxionApp.readInt();

            double refilledAmount = currentTank + amount;

            if (refilledAmount > tankSize) {
                SaxionApp.printLine("You cant add that many liters");
            } else {
                currentTank = refilledAmount;
                SaxionApp.printLine("Your tank is now: " + currentTank);
            }
    }
}
