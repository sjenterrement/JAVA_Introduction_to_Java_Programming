package chapter_5;

public class TestMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke the max method with int parameters
		System.out.println("The maximum between 3 and 4 is: " + max(3, 4));

		// invoke the max method with the double parameters
		System.out.println("The maximum between 3.0 and 5.4 is: " + max(3.0, 5.4));

		// invoke the max method with three double parameters
		System.out.println("The maximum between 3.0 and 5.4 and 10.14mis: " + max(3.0, 5.4, 10.14));
	}

	// return the max bewteen two int value
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	// return the max between double values
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	// return the max among three double values
	public static double max(double num1, double num2, double num3) {
		return max(max(num1, num2), num3);
	}

}
