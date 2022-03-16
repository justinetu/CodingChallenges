/*
	Question
	Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

	Examples
	squarePatch(3) ➞ [
  	[3, 3, 3],
  	[3, 3, 3],
  	[3, 3, 3]
	]

	squarePatch(5) ➞ [
  	[5, 5, 5, 5, 5],
  	[5, 5, 5, 5, 5],
  	[5, 5, 5, 5, 5],
 	[5, 5, 5, 5, 5],
  	[5, 5, 5, 5, 5]
	]

	squarePatch(1) ➞ [
  	[1]
	]

	squarePatch(0) ➞ []
	Notes
	n >= 0.
	If n = 0, return an empty array.
*/

public class PerfectSquarePatch {
	/*
		Right off the bat we can set the size of the array to the value n 
		for both columns and rows. So for example given the integer 5,
		the array would look like this --> int[][] array = new int[5][5].
		Lastly, we will iterate through the array assigning the given 
		value to each position in the array. We can do this using a 
		double for loop.
	*/
	
	public static int[][] squarePatch(int n) {
		int[][] patch = new int[n][n];
		for(int row = 0; row < patch.length; row++) {
			for(int col = 0; col < patch.length; col++) {
				patch[row][col] = n;
		}
	}
		return patch;
	}
}