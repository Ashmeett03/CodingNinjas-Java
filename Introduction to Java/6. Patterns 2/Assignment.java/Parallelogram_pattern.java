// Problem statement
// Write a program to print parallelogram pattern for the given N number of rows.

// For N = 4



// The dots represent spaces.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***
// Sample Input 2 :
// 5
// Sample Output 2 :
// *****
//  *****
//   *****
//    *****
//     *****
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int i = 1;
	while(i<=n) {
		int j = 1;
		while(j<i) {
	 System.out.print(" ");
	 j++;
    }
	    int k = 1;
		while(k<=n) {
       System.out.print("*");
	   k++;
	}
     System.out.println();
	 i++;
	}
}
}