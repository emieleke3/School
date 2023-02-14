package nl.saxion.oop.week1;

public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats, int compartmentClass)
    {
        this.numberOfSeats = numberOfSeats;
        this.compartmentClass = compartmentClass;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public int getCompartmentClass() {
        return compartmentClass;
    }
    public int getNumberofSeatsFilled() {
        return numberOfSeatsInUse;
    }

    public int enter() {
        return numberOfSeatsInUse++;
    }
    public int leaves() {
        return numberOfSeatsInUse--;
    }
}
