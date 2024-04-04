// Problem statement
// Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.

// A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?

// Example : Pattern for N = 4

// ****
//  ***     
//   **
//    *
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 50
// 1 <= N <= 300

// Time Limit: 1 sec
// Sample Input 1:
// 2
// 3
// 2
// Sample Output 1:
// ***
//  **     
//   *

// **
//  *     
// Explanation for Sample Input 1:
//  In the first test case, the value of ‘N’ is 3, so three rows are to be printed from 1 to 3 where each row starts from 3, which goes on till 1. Hence the answer is [“***”,”**”,”*”].

//  In the second test case, the value of ‘N’ is 2, so the two rows are to be printed from 1 to 3 where each row starts from 3, which goes on till 1. Hence the answer is [“**”,”*”].
// Sample Input 2:

// 2
// 4
// 5
// Sample Output 2:
// ****
//  ***     
//   **
//    *

// *****
//  ****     
//   ***
//    **
//     *
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Size of the pattern

            // Loop through rows
            for (int i = 0; i < N; i++) {
                // Print leading spaces
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = i; k < N; k++) {
                    System.out.print("*");
                }
                System.out.println(); // Move to the next line
            }
            // Separate the output of each test case
            if (t < T - 1) {
                System.out.println();
            }
        }
        scanner.close();
    }
}