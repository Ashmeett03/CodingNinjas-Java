// Problem statement
// Print the following pattern for given number of rows.

// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321
import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (n - j + 1 == i) {
                    System.out.print("*");
                } else {
                    System.out.print(n - j + 1);
                }
                j++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }

	}

