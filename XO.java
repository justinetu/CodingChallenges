/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

public class XO {
  
  public static boolean getXO (String str) {
     
    // Good Luck!!
    
    int x_count = 0;
    int o_count = 0;
    for(int i = 0; i < str.length(); i++) {
      if(str.toLowerCase().charAt(i) == 'x') ++x_count;
      if(str.toLowerCase().charAt(i) == 'o') ++o_count;
    }
    return x_count == o_count;
  }
}
