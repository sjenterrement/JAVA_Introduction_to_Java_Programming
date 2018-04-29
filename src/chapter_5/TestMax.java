package chapter_5;

public class TestMax {
	// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum between " + i + " and " + j + " is " + k);

	}

	// return the max between two number
	public static int max(int num1, int num2) {
		int result;

		if (num1 > num2)
			result = num1;

		else
			result = num2;

		return result;
	}

}
