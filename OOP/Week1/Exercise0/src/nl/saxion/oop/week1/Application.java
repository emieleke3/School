package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import javax.security.sasl.SaslClient;
import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application(), 1000, 1000);
	}

	public void run() {
		// Create user account
		UserAccount account = readUserAccount();

		SaxionApp.pause();
		SaxionApp.clear();

		SaxionApp.printLine("******* HI-SECURITY LOG IN TERMINAL **********");
		SaxionApp.print("Username: ");
		String username = SaxionApp.readString();
		SaxionApp.print("Password: ");
		String password = SaxionApp.readString();
		SaxionApp.printLine();

		if(account.checkPassword(password)) {
			SaxionApp.printLine("********** ACCESS GRANTED **********");
			SaxionApp.setBackgroundColor(Color.green);
		} else {
			SaxionApp.printLine("********** ACCESS DENIED **********");
			SaxionApp.setBackgroundColor(Color.red);
		}
	}

	private UserAccount readUserAccount() {
		SaxionApp.print("Please enter a new user name: ");
		String username = SaxionApp.readString();

		SaxionApp.print("Please enter a password for user \"" + username + "\": ");
		String password = SaxionApp.readString();

		// TODO: Alter code below!
		UserAccount newAccount = new UserAccount(username, password);

		return newAccount;
	}


}
