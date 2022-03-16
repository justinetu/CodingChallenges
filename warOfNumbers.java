/*	Question

	There's a great war between the even and odd numbers. 
	Many numbers already lost their lives in this war and it's your task to end this. You have to determine which group sums 	larger: the evens, or the odds. The larger group wins.

	Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between the sum of the even and odd numbers.

	Examples
	warOfNumbers([2, 8, 7, 5]) ➞ 2
	2 + 8 = 10
	7 + 5 = 12
	12 is larger than 10
	So we return 12 - 10 = 2

	warOfNumbers([12, 90, 75]) ➞ 27

	warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
	Notes
	The given array contains only positive integers.


*/

public class Challenge {
  public static int warOfNumbers(int[]numbers){
		/* 
			 Create 2 variales that stores the sum of the even numbers
			 and the sum of the odd numbers and initialize them to 0.
			 loop through the array
			 if the current value is even, we add the value to our evenSum
			 variable. If the value is odd, we add the number to the oddSum
			 variable.
			 After the loop, we check to see which sum is greater.
			 If the evenSum is greater than the oddSum, we subtract the 
			 oddSum from the evenSum and if the oddSum is greater than 
			 the evenSum, we subtract the evenSum from the oddSum. 
			 If they're equal, we'll set the difference value equal
			 to 0 which is the difference of two of the same numbers.
			 We store the difference in a variable called difference 
			 then we return it.
		*/
		
		int evenSum = 0;		
		int oddSum = 0;
		int difference = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) 
				evenSum += numbers[i];
			else
				oddSum += numbers[i];
		}
		if(evenSum > oddSum)
			difference = evenSum - oddSum;
		else if(oddSum > evenSum)
			difference = oddSum - evenSum;
		else
			difference = 0;
		return difference;
  }
}