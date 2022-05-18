public class Stuttering {

	/*
	Question:
	Write a function that stutters a word as if someone is struggling to read it. 
	The first two letters are repeated twice with an ellipsis ... and space after
	each, and then the word is pronounced with a question mark?.

	Examples
	stutter("incredible") ➞ "in... in... incredible?"

	stutter("enthusiastic") ➞ "en... en... enthusiastic?"

	stutter("outstanding") ➞ "ou... ou... outstanding?"

	Notes
	Assume all inputs are in lower case and at least two-character long.
	Check on the Resources tab for more helpful tips on String formatting in Java.
	*/


    public static String stutter(String word) {
        String s = word.substring(0, 2);  //Grab first 2 characters in the string
        s = s + "... " + s + "... " + word + "?";
        
        return s;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(stutter("incredible"));
        System.out.println(stutter("enthusiastic"));
        System.out.println(stutter("outstanding"));
    }
    
}
