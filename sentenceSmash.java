/*
  Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. 
  You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, 
  there shouldn't be a space at the beginning or the end of the sentence!

Example
['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
*/

public static String smash(String... words) {
    // TODO Write your code below this comment please
  
    // If the array is empty, return an empty string
    if(words.length == 0)
      return "";
    // Concatenating each word in the array a long with an extra space to a string
    for(String word : words) {
      concat += word + ' ';
    }
    
    // Removing the extra space at the end since we can't have spaces at the beginning or end. Then return the string
    concat = concat.substring(0, concat.length() - 1);
    return concat;
  }
}
