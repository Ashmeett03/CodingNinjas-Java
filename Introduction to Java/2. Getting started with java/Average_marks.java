// Problem statement
// Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.

// Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section.

// All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print the integer part of the average only and neglect the decimal part.




// Detailed explanation ( Input/output format, Notes, Images )
// Constraints
// Marks for each student lie in the range 0 to 100 (both inclusive)
// Sample Test 1
// Input:
// R
// 0 100 99 
// Output:
// R 
// 66

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);

	  char name = s.next().charAt(0);
	  int m1 = s.nextInt();
	  int m2 = s.nextInt();
	  int m3 = s.nextInt();

	  int totalmarks = m1+m2+m3;
	  int averagemarks = (m1+m2+m3)/3;

	  System.out.println(name);
	  System.out.println(averagemarks);


		
	}

}
