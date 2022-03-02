
/*
		Question:
		Create a method that accepts a string (of a person's first and last name) and returns a string with the first and last name swapped.

		Examples:

		nameShuffle("Donald Trump") ➞ "Trump Donald"

		nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"

		nameShuffle("Seymour Butts") ➞ "Butts Seymour"
*/

public class ShuffleTheName {
    
    public static String nameShuffle(String str) {
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                s1 = str.substring(0, i);
                s2 = str.substring(i + 1, str.length());
            }   
        }
        
        String swap = "" + s2 + " " + s1;
        
        
        return swap;
    }

    
    public static void main(String[] args) {
        
        System.out.println(nameShuffle("Donald Trump"));
		 System.out.println(nameShuffle("Rosie O'Donnell"));
        System.out.println(nameShuffle("Seymour Butts"));
        
    }
    
}