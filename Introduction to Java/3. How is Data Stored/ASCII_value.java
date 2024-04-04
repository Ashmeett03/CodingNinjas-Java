// Problem statement
// Given a character, you need to print the ASCII value of that character.

// Example:
// Input: ch = ‘a’

// Output: 97

// Explanation: ASCII value of ‘a’ is 97.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= TEST <= 10
// All characters are either lowercase or uppercase letters.

// Time Limit: 1-sec
// Sample Input 1:
// ‘a’
// Sample Output 1:
// 97
// Explanation Of Sample Input 1:
// For test case 1:

// Input: ch = ‘a’

// Output: 97

// Explanation: ASCII value of ‘a’ is 97.
// Sample Input 2:
// ‘B’
// Sample Output 2:
// 66
import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
		
	


     Scanner s = new Scanner(System.in);

	 char ch = s.next().charAt(0);
	 int a = (int) ch;
	 System.out.println(a);
	}
}