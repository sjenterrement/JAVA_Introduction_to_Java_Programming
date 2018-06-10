package theComputerClass;

import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int floor = input.nextInt();
		for (int i = 1; i<=floor; i++) {
			for (int j = floor; j >i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j<2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
