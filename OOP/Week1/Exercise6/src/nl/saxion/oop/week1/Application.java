package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {
		// We used the following code to produce the sample output.

		ArrayList<Integer> bmList = new ArrayList<>();


		BingoMill bm = new BingoMill();

		shuffle(bmList);

		SaxionApp.printLine("Drawing 10 random numbers using the Bingo Mill!");
//		for (int i = 0; i < 10; i++) {
//			SaxionApp.printLine("Draw " + i + ": " + bm.draw() + " (" + bm.getNumberOfBallsRemaining() + " balls remaining)");
//		}

		// TODO: Your implementation here

	}

	public void shuffle(ArrayList<Integer> bmList) {
		for (int i = 1; i < 76; i++) {
			bmList.add(i);
		}

	}
}
