// This is the testFacebook_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011

import java.awt.Graphics;
import java.awt.Point;
//import jpb.*;
import java.util.*;

import jpb.DrawableFrame;

public class testFacebook_Graphics_HW5 {

	public static void main(String[] args) {

		// Prompt user to enter the number of facebookpresons
		// SimpleIO.prompt("Enter the number of facebookpresons to be created: ");
		// String userInput = SimpleIO.readLine();
		// int numP = Integer.parseInt(userInput);

		Scanner userInput = new Scanner(System.in);
		System.out
				.println("Enter the number of facebookpresons to be created(1-9): ");
		int numP = 0;
		numP = userInput.nextInt();
		while (numP > 9 || numP < 1) {
			System.out
					.println("Warning:Invalid input.(The number must be between 1 and 9.)");
			System.out.println("Please input again:");
			numP = userInput.nextInt();
		}

		DrawableFrame df;
		// Create drawable frame
		df = new DrawableFrame("Facebook window");
		df.show();
		df.setSize(700, 550);

		// Obtain graphics context
		Graphics g = df.getGraphicsContext();

		FacebookPerson_Graphics_HW5[] fbp = new FacebookPerson_Graphics_HW5[numP];

		// Ask the user to enter the name for each person, and create the
		// persons
		for (int i = 0; i < numP; i++) {
			System.out.println("Enter the name for person " + (i + 1) + ":");
			String name = userInput.next();
			Point offset = new Point();
			int col = i % 3, row = i / 3;
			offset.x = col * 200 + 30 * (col + 1);
			offset.y = row * 150 + 30 * (row + 1);
			fbp[i] = new FacebookPerson_Graphics_HW5(name, g, offset);
			df.repaint();
		}
		System.out
				.println("-------select a person and type the mood below--------");

		// Ask the user to set the mood for a person, and update the mood, enter
		// "####" to exit
		while (true) {
			System.out
					.println("Enter the name for a person (enter #### to exit):");
			String name = userInput.next();
			if (name.equals("####"))
				System.exit(0);
			int personID = -1;
			for (int i = 0; i < numP; i++) {
				if (fbp[i].getName().equals(name)) {
					personID = i;
					break;
				}
			}
			if (personID != -1) { // found the person
				System.out.println("Enter the mood for the person:");
				String mood = userInput.next();
				fbp[personID].setMood(mood);
				df.repaint();
			} else
				System.out.println("unrecognized name!");
		} // end while

	} // end main

}