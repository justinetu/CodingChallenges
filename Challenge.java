import java.util.HashSet;
public class Challenge {

	/*
		Question:
		Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

		Examples
		equal(3, 4, 3) ➞ 2
		equal(1, 1, 1) ➞ 3
		equal(3, 4, 1) ➞ 0
	*/

	/*
		My Approach
	--> Create an empty set
	--> Since we're given exactly 3 integers, we can store each value in an array.
		 
   -->	We can then loop through the array to see whether the number is in the set.

	--> In addition, we'll create a count variable that we'll initialize
		to 1 that will acount for the number of times each number appears.

	--> In our loop which marches through each value in the array, we 
		create a condition that says if the number at the current index
		in the array is in the set, we don't add the number to the set
		but we increase the count by 1.

	--> If the number at the current index is NOT in the set, we add it
		to the set and skip to the next value. If no 2 numbers in the 
		repeat, in other words, if count remains 0, we set it to 0.
	*/
	
	public static int equal(int a, int b, int c) {
		HashSet<Integer> set = new HashSet<>();
		int[] array = new int[3];
    	array[0] = a;
    	array[1] = b;
    	array[2] = c;
    	int count = 1;
		
    	for(int i = 0; i < array.length; i++) {    	
      	if(set.contains(array[i]))
        	count++;
      	if(!set.contains(array[i]))
        	set.add(array[i]); 
    	}
      	if(count == 1)
        	count = 0;

        	return count;
		}

	public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 4;
        
        
  
         System.out.println(Challenge(a, a, a));
         set.clear();
         System.out.println(Challenge(b, c, b));
         set.clear();
         System.out.println(Challenge(b, c, a));
         
        
        
    }
	
	
	}

	