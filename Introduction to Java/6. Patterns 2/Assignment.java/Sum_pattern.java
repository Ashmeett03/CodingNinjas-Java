// Problem statement
// Write a program to print triangle of user defined integers sum.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6
// Sample Input 2 :
//  5
// Sample Output 2 :
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n  = s.nextInt();
		int sum = 0;
		int i = 1;
		while(i<=n) {
			sum = sum + i;
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
                } else {
					System.out.print("+");
				}
				j++;
			}
			
			System.out.println(sum);
			i++;
		}
    }
}