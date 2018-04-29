package chapter_4;

public class MultiplicatonTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display the table heading
		System.out.println("           Multiplication Table");

		// display the number title
		System.out.print("    ");
		for (int i = 1; i <= 9; i++) {
			System.out.print("   " + i);
		}
		System.out.println("\n----------------------------------------");

		// print table body
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= i; j++) {
				// display the product and align properly
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}
