// Problem statement
// Given a string, determine if it is a palindrome, considering only alphanumeric characters.

// Palindrome
// A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
// Example:
// If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

// The expected output for this example will print, 'true'.
// From that being said, you are required to return a boolean value from the function that has been asked to implement.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1 :
// abcdcba
// Sample Output 1 :
// true 
// Sample Input 2:
// coding
// Sample Output 2:
// false
public class Solution {
    public static boolean isPalindrome(String s) {
    String str = s.toLowerCase();
    int count = 0;
    char[] arr = new char[str.length()];

    for (int i = 0; i < str.length();) {
        if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {
            i++;
        } else {
            arr[count] = str.charAt(i);
            count++;
            i++;
        }
    }

    int i = 0;
    int j = count - 1;

    while (i < j) {
        if (arr[i] != arr[j]) {
            return false;
        }
        i++;
        j--;
    }

    return true;
}
}
