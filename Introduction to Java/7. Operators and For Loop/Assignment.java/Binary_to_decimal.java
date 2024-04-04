// Problem statement
// Given a binary number as an integer N, convert it into decimal and print.

// Detailed explanation ( Input/output format, Notes, Images )
// Constraints :
// 0 <= N <= 10^9
// Sample Input 1 :
// 1100
// Sample Output 1 :
// 12
// Sample Input 2 :
// 111
// Sample Output 2 :
// 7
import java.util.Scanner;
public class Main {

	public static   void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//12
		int i=0;
		int s=0;
		while(n>0)//12>0 true//1>0true
		{
		int a=n%10;//12%10=2//1%10=1
		n=n/10;//12/10=1//1/10=0
	
		s=s+a*(int)Math.pow(2,i++);//0+2*2^0=2//2+1*(2^1)
		}
		System.out.print(s);
	

	}
		
	}