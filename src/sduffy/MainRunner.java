package sduffy;

import java.util.Scanner;

public class MainRunner {
	public static void main (String [] args) {
		int [] orig = new int[3]; //Holds the origin coordinates
		int [] tar = new int[3]; //Holds the target coordinates
		int [] rel = new int[3]; //Holds the relative coordinates
		getCoords("origin", orig);
		getCoords("target", tar);
		Calculator c = new Calculator(orig, tar, rel);
		c.findRelative();
		c.printRelativeCoords();
	}
	
	public static void getCoords(String name, int [] coords) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the " + name + " coordinates (\"x y z\") and press enter:");
		for (int i = 0; i < coords.length; i++) {
			coords[i] = scan.nextInt();
		}
	}
}
