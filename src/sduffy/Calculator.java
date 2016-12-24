package sduffy;

/**
 * Actually does the relative coordinate calculation
 * Finds the relative coordinates of the target coordinates relative to the origin coordinates.
 * @author Scott
 */
public class Calculator {
	int [] orig; //Holds the origin coordinates
	int [] tar; //Holds the target coordinates
	int [] rel; //Holds the relative coordinates
	
	/**
	 * New Calculator object with specified coordinate arrays
	 * @param nOrig - The origin coordinates
	 * @param nTar - The target coordinates
	 * @param nRel - The relative coordinates of the target coordinates relative to the origin coordinates
	 */
	public Calculator (int [] nOrig, int [] nTar, int [] nRel) {
		orig = nOrig; //Holds the origin coordinates
		tar = nTar; //Holds the target coordinates
		rel = nRel; //Holds the relative coordinates
	}
	
	/**
	 * This actually does the calculation
	 */
	public void findRelative() {
		rel[0] = tar[0] - orig[0];
		rel[1] = tar[1] - orig[1];
		rel[2] = tar[2] - orig[2];
	}
	
	public void printRelativeCoords() {
		String result = "~";
		if (rel[0] != 0) { //If this is not 0
			result += rel[0];
		}
		
		result += " ~";
		
		if (rel[1] != 0) { //If this is not 0
			result += rel[1];
		}
		
		result += " ~";
		
		if (rel[2] != 0) { //If this is not 0
			result += rel[2];
		}
		System.out.print(result);
	}
}







