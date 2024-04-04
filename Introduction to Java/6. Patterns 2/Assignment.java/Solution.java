// Problem statement
// Write a program to print the pattern for the given N number of rows.

// For N = 4

// 1357
// 3571
// 5713
// 7135
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 135
// 351
// 513
// Sample Input 2 :
//  5
// Sample Output 2 :
// 13579
// 35791
// 57913
// 79135
// 91357
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int startNumber = 1;
        int i = 1;
        while(i<=n) {
            int currentNumber = startNumber;
            int j = 1;
            while(j<=n) {
                System.out.print(currentNumber);
                currentNumber = ( currentNumber + 2) % (2 * n);
                j++;
            }
            System.out.println();
            startNumber = ( startNumber + 2) % (2 *n);
            i++;
        }
    }
}