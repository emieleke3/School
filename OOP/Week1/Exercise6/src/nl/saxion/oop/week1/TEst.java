package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class TEst implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new TEst());
	}

	public void run() {
		boolean loop = true;
		boolean loop2 = true;
		while(loop)
		{
			SaxionApp.printLine("Guess a number!");
			int randomGuess = SaxionApp.readInt();

			int dice1 = SaxionApp.getRandomValueBetween(1, 7);
			int dice2 = SaxionApp.getRandomValueBetween(1, 7);
			int dice3 = SaxionApp.getRandomValueBetween(1, 7);
			int dice4 = SaxionApp.getRandomValueBetween(1, 7);
			int dice5 = SaxionApp.getRandomValueBetween(1, 7);

			SaxionApp.printLine("Select the dice you think is closest to your guessed amount!");
			SaxionApp.printLine("1) dice 1");
			SaxionApp.printLine("2) dice 2");
			SaxionApp.printLine("3) dice 3");
			SaxionApp.printLine("4) dice 4");
			SaxionApp.printLine("5) dice 5");
			SaxionApp.printLine("6) exit");

			ArrayList<Integer> selectedDice = new ArrayList<>();

			while (loop2)
			{
				int select = SaxionApp.readInt();
				switch (select) {
					case 1:
						selectedDice.add(dice1);
						break;
					case 2:
						selectedDice.add(dice2);
						break;
					case 3:
						selectedDice.add(dice3);
						break;
					case 4:
						selectedDice.add(dice4);
						break;
					case 5:
						selectedDice.add(dice5);
						break;
					case 6:
						loop2 = !loop2;
						break;
				}
			}

			SaxionApp.printLine("Selected dice: ");

			int selectedTotal = 0;
			for(int i = 0; i < selectedDice.size(); i++)
			{
				int dice = selectedDice.get(i);
				SaxionApp.print(dice + ", ");
				selectedTotal += dice;
			}

			SaxionApp.printLine();
			SaxionApp.printLine();

			SaxionApp.printLine("Selected total: " + selectedTotal);
			SaxionApp.printLine("Guessed total: " + randomGuess);

			if(randomGuess == selectedTotal) {
				SaxionApp.printLine("Sicko mode yo");
			} else {
				SaxionApp.printLine("Jij bent mie dom");
			}

			loop = false;
		}

	}

}
