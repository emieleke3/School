package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class King {

    public int xCoordinate;
    public int yCoordinate;

    private int gridSize = 75; // For drawing

    public boolean canMove(int xCoordinate, int yCoordinate) {
        return false;
    }

    public void draw() {
        int calcX = 100 + xCoordinate * gridSize;
        int calcY = 100 + yCoordinate * gridSize;

        SaxionApp.drawImage("resources/king_light.png", calcX + 10, calcY + 5);
    }

    public void showMoves() {
        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {
                if(canMove(row, col)) {
                    SaxionApp.setFill(Color.GREEN);

                    SaxionApp.drawCircle(100 + row * gridSize + (gridSize / 2), 100 + col * gridSize + (gridSize / 2), 25);
                }
            }
        }

    }
}
