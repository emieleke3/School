package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;
import java.util.Collections;

public class BingoMill {

    public ArrayList<Integer> numberList;

    public BingoMill() {
        this.numberList = new ArrayList<>();
        makeList();
        shuffle();
    }

    public int getNumberOfBallsRemaining() {
        return numberList.size();
    }

    public int draw() {
        int rnd = numberList.get(0);
        numberList.remove(0);
        return rnd;
    }

    public void reset() {

    }

    public void shuffle() {
        for(int i = 0; i < 300; i++) {
            int randIndex1 = SaxionApp.getRandomValueBetween(0, 75);
            int randIndex2 = SaxionApp.getRandomValueBetween(0,75);
            Collections.swap(numberList, randIndex1, randIndex2);
        }
    }

    public void makeList() {
        for(int i = 1; i <= 75; i++)
        {
            numberList.add(i);
        }
    }
 }
