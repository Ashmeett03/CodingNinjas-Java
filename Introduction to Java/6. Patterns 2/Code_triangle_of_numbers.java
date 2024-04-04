// Problem statement
// Print the following pattern for the given number of rows.

// Pattern for N = 4



// The dots represent spaces.




// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 50
// Sample Input 1:
// 5
// Sample Output 1:
//            1
//           232
//          34543
//         4567654
//        567898765
// Sample Input 2:
// 4
// Sample Output 2:
//            1
//           232
//          34543
//         4567654
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 int i = 1;
	 while(i<=n){
     int spaces = 1;
	 while(spaces<=n-i) {
     System.out.print(" ");
	 spaces++;
     }
	 int j = 1;
	 int p = i;
	 while(j<=i) {okay
     System.out.print(p);
	 p++;
	 j++;
	 }
	 j = 1;
      p=p-2;

	 while(j<=i-1) {
     System.out.print(p);
	 p--;
	 j++;

	 }
	 System.out.println();
	 i++;
	 }
    }
}