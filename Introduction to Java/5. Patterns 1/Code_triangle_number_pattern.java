// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
// 1
// 22
// 333
// 4444
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
// 1
// 22
// 333
// 4444
// 55555
// Sample Input 2:
// 6
// Sample Output 2:
// 1
// 22
// 333
// 4444
// 55555
// 666666
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i<=n) {
        int j = 1;
		int startingNumber = i;
		while(j<=i) {
       System.out.print(startingNumber);
	   j++;
	   }
	   System.out.println();
       i++;
       }
    }
}
