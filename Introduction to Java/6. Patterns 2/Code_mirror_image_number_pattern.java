// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4




// The dots represent spaces.



// Detailed explanation ( Input/output format, Notes, Images )
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 3
// Sample Output 1:
//       1 
//     12
//   123
// Sample Input 2:
// 4
// Sample Output 2:
//       1 
//     12
//   123
// 1234
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
	  int n = s.nextInt();
	  int i = 1;
	  while(i<=n) {
     int j = 1;
	 while( j <= n - i) {
     System.out.print(" ");
	 j++;
     }
	 j = 1;
	 while(j<=i) {
     System.out.print(j);
	 j++;
     }
	 System.out.println();
	 i++;
     }
    }
}
