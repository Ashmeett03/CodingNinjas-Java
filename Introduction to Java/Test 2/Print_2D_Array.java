// Problem statement
// Given a 2D integer array with n rows and m columns. Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1 :
// 1 2 3
// 1 2 3
// 1 2 3
// 4 5 6
// 4 5 6
// 7 8 9
public class Solution {
	public static void print2DArray(int input[][]) {
		// Write your code here

          for (int i=0;i<input.length;i++)
        {
            int count = input.length-i;
            while (count>0)
            {
                for (int j=0;j<input[0].length;j++)
                {
                    System.out.print(input[i][j] + " ");
                }
                count--;
                System.out.println("");
            }
        }

	}
}
