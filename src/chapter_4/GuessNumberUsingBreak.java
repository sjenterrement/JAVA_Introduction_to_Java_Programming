package chapter_4;

import java.util.Scanner;

public class GuessNumberUsingBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generate a random number to be guessed
		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100");

		while (true) {
			// prompt the user to guess the number
			System.out.print("\nEnter your guess: ");
			int guess = input.nextInt();

			if (guess == number) {
				System.out.println("Your guess is " + number);
				break;
			} else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

	}

}
