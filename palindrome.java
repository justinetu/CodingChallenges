/*
  A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

  Given a string , print Yes if it is a palindrome, print No otherwise.
  
  Constraints
  
  will consist at most lower case english letters.
  
  Sample Input
  
  madam
  
  Sample Output

  Yes
*/

class palindrome {
  public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int left = 0;
        int right = A.length() - 1;
        String result = "";
        while(left < right) {
            if(A.charAt(left) == A.charAt(right)) {
                ++left;
                --right;
            }
            else {
                result = "No";
                break;
            }
        }
        if(result.isEmpty()) System.out.println("Yes");
        else System.out.println(result);
}
