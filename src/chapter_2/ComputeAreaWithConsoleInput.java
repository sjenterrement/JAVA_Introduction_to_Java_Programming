package chapter_2;
import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Enter the number for radius: ");
		double radius=input.nextDouble();
		double area=radius*radius*3.14159;
		System.out.println("The area for the circle of radius "+ radius + " is " + area);
	}
}
