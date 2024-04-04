// Problem statement
// Write a program to print N number of rows for Half Diamond pattern using stars and numbers

// Note : There are no spaces between the characters in a single line.


// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Sample Input 2 :
//  5
// Sample Output 2 :
// *
// *1*
// *121*
// *12321*
// *1234321*
// *123454321*
// *1234321*
// *12321*
// *121*
// *1*
// *
import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int i = 1;
     System.out.println("*");
     while(i<=n) {
      System.out.print("*");

      int num = 1;
      while(num<=i)  {
      System.out.print(num);
      num = num+1;
     }
      int dec = i-1;
      while(dec>=1) {
     System.out.print(dec);
     dec = dec-1;
     }
    // int star = 2*dec+1;
   //  while(star>=1) {
//System.out.print("*");
     // star=star-1;
   //  }
     System.out.println("*");
     i++;
     }
     int k = 1;
      while(k<=n-1) {
     System.out.print("*");
     int j =1;
     while(j<=n-k) {
     System.out.print(j);
     j++;
    }
    int m =n-k-1;
    while(m>=1) {
     System.out.print(m);
     m--;
      }
      System.out.println("*");
      k++;
    


      }
      System.out.println("*");
    }
}