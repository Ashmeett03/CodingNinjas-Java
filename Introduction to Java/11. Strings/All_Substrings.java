// Problem statement
// For a given input string(str), write a function to print all the possible substrings.

// Substring
// A substring is a contiguous sequence of characters within a string. 
// Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 0 <= N <= 10^6
// Where N is the length of the input string.

// Time Limit: 1 second
// Sample Input 1:
// abc
// Sample Output 1:
// a 
// ab 
// abc 
// b 
// bc 
// c 
//  Sample Input 2:
// co
// Sample Output 2:
// c 
// co 
// o
import java.util.Scanner;
public class Solution {

	public static void printSubstrings(String str) {
		for(int i = 0; i < str.length();i++) {
			for(int j = i+1 ;j <= str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		//Your code goes here
	}

}
}
