// Problem statement
// Given a number N, print sum of all even numbers from 1 to N.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
//  6
// Sample Output 1 :
// 12
// Sample Input 2 :
//  7
// Sample Output 2 :
// 12
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		 n = s.nextInt();

		int i=0;
		int sum=0;
		while (i<=n) {
			sum = sum + i;
			i=i+2;
		}
			System.out.println(sum);
     }

}