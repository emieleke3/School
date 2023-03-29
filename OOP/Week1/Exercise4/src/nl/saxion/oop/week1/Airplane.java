package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Airplane {

    private boolean passengers;
    private boolean luggage;
    private boolean doorsUnlocked = true;
    private boolean depart;

    public boolean depart() {

        if(!doorsUnlocked && luggage && passengers) {
            SaxionApp.printLine("The plane has departed!");
            depart = true;
        } else {
            SaxionApp.printLine("The plane is not ready to depart!");
        }

        return depart;
    }
    public void lockDoors() {
        doorsUnlocked = false;
        SaxionApp.printLine("Locking doors!");
    }
    public void unlockDoors() {
        doorsUnlocked = true;
        SaxionApp.printLine("Unlocking doors!");
    }
    public void loadLuggage() {
        if(doorsUnlocked) {
            luggage = true;
        } else {
            SaxionApp.printLine("Unable to load luggage, doors are locked!");
        }
    }
    public void loadPassengers() {
        if(doorsUnlocked) {
            passengers = true;
        } else {
            SaxionApp.printLine("Unable to load passengers, doors are locked!");
        }
    }
}
