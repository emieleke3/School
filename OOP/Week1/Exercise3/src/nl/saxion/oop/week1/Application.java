package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        ArrayList<Car> cars = new ArrayList<>();
    }
}