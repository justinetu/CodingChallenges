/*
	Given a total due and an array representing the amount of change in your pocket, 
	determine whether or not you are able to pay for the item. Change will always be 
	represented in the following order: quarters, dimes, nickels, pennies.

	To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 
	25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.

	Examples
	changeEnough([2, 100, 0, 0], 14.11) ➞ false

	changeEnough([0, 0, 20, 5], 0.75) ➞ true

	changeEnough([30, 40, 20, 5], 12.55) ➞ true

	changeEnough([10, 0, 0, 50], 3.85) ➞ false

	changeEnough([1, 0, 5, 219], 19.99) ➞ false

	Notes
	quarter: 25 cents / $0.25
	dime: 10 cents / $0.10
	nickel: 5 cents / $0.05
	penny: 1 cent / $0.01
 */

public class Program {

   
    public static void main(String[] args) {
        int[] array1 = {2, 100, 0, 0};
        int[] array2 = {0, 0, 20, 5};
        int[] array3 = {30, 40, 20, 5};
        int[] array4 = {10, 0, 0, 50};
        int[] array5 = {1, 0, 5, 219};
        
       System.out.println(changeEnough(array1, 14.11));
       System.out.println(changeEnough(array2, 0.75));
       System.out.println(changeEnough(array3, 12.55));
       System.out.println(changeEnough(array4, 3.85));
       System.out.println(changeEnough(array5, 19.99));
    }
    
    public static boolean changeEnough(int[] change, double amountDue) {
		//Dvide the first num in the array by 4
		double qtrs = change[0] / 4.0;
		
		//Divide second num by 10
		double dimes = change[1] / 10.0;
		
		//Multiply third num by 5 then divide 100
		double nickels = change[2] * 5.0 / 100.0;
		
		//Divide pennies by 100
		double pennies = change[3] / 100.0;
		
		//Add the values and store total in sum
		double sum = qtrs + dimes + nickels + pennies;
		
		// Convert our sum to a string to account for 2 decimal places	
		String sum2 = String.format("%.2f", sum);
		
		// Convert sum2 to a double
		Double d = Double.parseDouble(sum2);
		
		//Write condition
		if(d >= amountDue) 
			return true;
		
		return false;
	}	
    
}
