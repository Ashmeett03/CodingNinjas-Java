// Problem statement
// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.

// Note:
// Fibonacci series is the series of numbers where each number is obtained by adding two previous numbers. The first two numbers in the Fibonacci series are 0 and 1.


// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= n <= 10^4
// Sample Input 1 :
// 5
// Sample Output 1 :
// true
// Sample Input 2 :
// 14
// Sample Output 2 :
// false    
public class Solution {
	
	public static boolean checkMember(int n){
	 int num1 = 0;
	 int num2 = 1;
	 
	  while(num1<n) {
		 int num3 = num1+num2;
		 num1=num2;
		 num2=num3;
	  }
		  if(num1 == n){
			  return true;
		  }
		return false;
	}
}