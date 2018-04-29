package chapter_4;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_PRIME = 50;
		final int NUMBER_OF_PER_LINE = 10;
		int count = 0;
		int number = 2;

		System.out.println("The first 50 prime number are \n");

		// repeatedly find prime number
		while (count < NUMBER_OF_PRIME) {
			// assume the number is prime
			boolean isprime = true;

			// test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isprime = false;
					break;
				}
			}

			// print the prime number and increase the count
			if (isprime) {
				count++;

				if (count % NUMBER_OF_PER_LINE == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}

			number++;
		}

	}

}
