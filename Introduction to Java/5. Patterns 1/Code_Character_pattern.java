// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 4
// A
// BC
// CDE
// DEFG
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints
// 0 <= N <= 13
// Sample Input 1:
// 5
// Sample Output 1:
// A
// BC
// CDE
// DEFG
// EFGHI
// Sample Input 2:
// 6
// Sample Output 2:
// A
// BC
// CDE
// DEFG
// EFGHI
// FGHIJK
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 int i = 1;
	 while(i<=n) {
		 int j = 1;
		 int Start = 'A'+i-1;
		 while(j<=i){
		 System.out.print((char)(Start));
		 j++;
		 Start++;
		 }
		 System.out.println();
		 i++;
		 }
        }
    }
