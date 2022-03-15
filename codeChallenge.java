/*
	Question:
	A quadratic equation a x² + b x + c = 0 has either 
	0, 1, or 2 distinct solutions for real values of x. 
	Given a, b and c, you should return the number of 
	solutions to the equation.

	Examples
	solutions(1, 0, -1) ➞ 2
	x² - 1 = 0 has two solutions (x = 1 and x = -1).

	solutions(1, 0, 0) ➞ 1
	x² = 0 has one solution (x = 0).

	solutions(1, 0, 1) ➞ 0
	x² + 1 = 0 has no real solutions.
	Notes
   	You do not have to calculate the solutions, just return how many there are.
	a will always be non-zero.

*/

public class codeChallenge {	
	public static int solutions(int a, int b, int c) {
		int numOfSolutions = 0;
		if(c < 0 || a == b)
			numOfSolutions = 2;
		else if(c == 1)
			numOfSolutions = 0;
		else if(c == 0 || a%b%c == 0)
			numOfSolutions = 1;
	return numOfSolutions;
  }
}