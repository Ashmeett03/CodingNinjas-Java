// Problem statement
// Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= |S| <= 10^7
// where |S| represents the length of string, S.
// Sample Input 1:
// Welcome to Coding Ninjas
// Sample Output 1:
// Ninjas Coding to Welcome
// Sample Input 2:
// Always indent your code
// Sample Output 2:
// code your indent Always
public class Solution {
	public static String reverseWordWise(String input) {
		int end = input.length() - 1,start,j;
		String result ="",word = "";
		for(int i= input.length() - 1;i >= 0;i--) {
			if(input.charAt(i) == ' ') {
				start = i + 1;
				word = "";
				for(j = start;j <= end;j++) {
					word += input.charAt(j);
				}
				end  = i - 1;
				result = result + word + " ";
			}
		}
		word = "";
		for(j = 0;j <= end;j++) {
			word = word + input.charAt(j);
		}
		result += word;
		return result;
	}


	}
