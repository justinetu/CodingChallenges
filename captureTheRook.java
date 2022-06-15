/*
	Question
	Write a function that returns true if two rooks can attack each other, and false otherwise.

	Examples
	canCapture(["A8", "E8"]) ➞ true

	canCapture(["A1", "B2"]) ➞ false

	canCapture(["H4", "H3"]) ➞ true

	canCapture(["F5", "C8"]) ➞ false
*/

public class captureTheRook {
	public static boolean canCapture(String[] rooks) {
		if(rooks[0].charAt(0) == rooks[1].charAt(0) || 
			 rooks[0].charAt(1) == rooks[1].charAt(1))
			return true;
		return false;
	}
}