package chapter_2;

import java.util.Scanner;

public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight in pounds
		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();

		// prompt the user to enter height in inches
		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();

		// CONSTANT
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;

		// Compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		// Display the result
		System.out.println("Your BMI is " + bmi);
		if (bmi < 16)
			System.out.println("You are seriously underweight");
		else if (bmi < 18)
			System.out.println("You are underweight");
		else if (bmi < 24)
			System.out.println("You are normal weight");
		else if (bmi < 29)
			System.out.println("You are overweight");
		else if (bmi < 35)
			System.out.println("You are seriously overweight");
		else
			System.out.println("You are gravely underweight");

	}

}
