package chapter_5;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a scanner
		Scanner input = new Scanner(System.in);

		// prompt the user to enter two integer
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}

	// return the gcd of two integers
	public static int gcd(int n1,int n2) {
		int gcd=1;//initial gcd is 1
		int k=2;//possible gcd
		
		while (k<=n1&&k<=n2) {
			if (n1%k==0&&n2%k==0) 
				gcd=k;//update
			k++;
		}
		
		return gcd;
	}

}
