// Problem statement
// Print the following pattern for the given N number of rows.

// Pattern for N = 5
// E
// ED
// EDC
// EDCB
// EDCBA
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7

// Sample Output 1:
// G
// GF
// GFE
// GFED
// GFEDC
// GFEDCB
// GFEDCBA
// Sample Input 1:
// 6
// Sample Output 1:
// F
// FE
// FED
// FEDC
// FEDCB
// FEDCBA  
import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		while(i<n) {
			int j = n;
      while(j>=n-i) {
		System.out.print((char)('A'+j-1));
	   j--;
	}
	System.out.println();
	i++;
		}
		 
	}
}