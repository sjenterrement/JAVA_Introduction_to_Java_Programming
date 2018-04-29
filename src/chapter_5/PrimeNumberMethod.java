package chapter_5;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first 50 prime number are \n");
		printPrimeNumber(50);
	}

	public static void printPrimeNumber(int numberOfPrimes) {
		final int NUMBER_OF_PRIME_PER_LINE = 10;
		int count = 0;
		int number = 2;

		// repeat find prime number
		while (count < numberOfPrimes) {
			// print the prime number and increase the count
			if (isPrime(number)) {
				count++;

				if (count % NUMBER_OF_PRIME_PER_LINE == 0)
					System.out.printf("%-5s\n", number);
				else
					System.out.printf("%-5s", number);

			}

			// check next
			number++;
		}
	}

	// check whether number is prime
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}
