// Problem statement
// Print the following pattern for the given number of rows.

// Note: N is always odd.


// Pattern for N = 5



// The dots represent spaces.




// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 1 <= N <= 49
// Sample Input 1:
// 5
// Sample Output 1:
//   *
//  ***
// *****
//  ***
//   *
// Sample Input 2:
// 3
// Sample Output 2:
//   *
//  ***
//   *
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1= n+1/2;
        int n2 = n/2;
        int i = 1;
        while(i<=n) {  
          int j = 1;
          while(j<=n) {
              if(j<=n-i)
              System.out.print(" ");
         else
          System.out.print("*");
          j++;
          }
          System.out.println();
          i++;
        }
       while(i<=n) {
      int j = 1;
      while(j<=n) {
      if(j<=n-i)
      System.out.print(" ");
      else
       System.out.print("*");
      j++;
      }
     System.out.println();
    i++;
     }
        
     }
 }