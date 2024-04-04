// Problem statement
// Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.

// Note: Print the answer as integer value.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 2000
// 2.2
// 4
// Sample Output 1:
// 176
// Explanation:
// principal=2000,rate=2.2 and time=4.
// Simple interest = (Principal*rate*time) /100
// Hence answer is (2000*2.2*4)/100 = 176

import java.util.Scanner ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int p = s.nextInt();
		float r = s.nextFloat();
		int t = s.nextInt();

		int si =(int)((p*r*t)/100);
		System.out.println(si);
		
	}
}