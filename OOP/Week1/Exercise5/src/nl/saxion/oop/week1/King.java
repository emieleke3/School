package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class King {

    public int xCoordinate;
    public int yCoordinate;
    private int gridSize = 75; // For drawing

    public boolean canMove(
            int xCoordinate, int yCoordinate) {
        return (this.xCoordinate-xCoordinate == 1||xCoordinate-this.xCoordinate==1)&&
                (this.yCoordinate-yCoordinate == 1||yCoordinate-this.yCoordinate==1) ||
                (this.yCoordinate==yCoordinate &&(xCoordinate-this.xCoordinate== 1||this.xCoordinate-xCoordinate==1)) ||
                (this.xCoordinate==xCoordinate && (this.yCoordinate-yCoordinate == 1 || yCoordinate-this.yCoordinate==1));
    }

    public void draw() {
        int calcX = 100 + xCoordinate * gridSize;
        int calcY = 100 + yCoordinate * gridSize;

        SaxionApp.drawImage("C:\\Users\\emiel\\Documents\\GitHub\\School\\OOP\\Week1\\resources\\king_dark.png", calcX + 10, calcY + 5);
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
