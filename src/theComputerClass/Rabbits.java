package theComputerClass;

public class Rabbits {
	public static int Fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 12; i++) {
			System.out.println("Month: " + i + "\nthe number of rabbits: " + 2 * Fibonacci(i) + " rabbits");
		}

	}

}
