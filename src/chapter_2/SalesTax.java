package chapter_2;
import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the purchase amount: ");
		double perchaseAmount=input.nextDouble();
		double tax=perchaseAmount*0.06;
     	System.out.println("Sales tax is "+(int)(tax*100)/100.0);
	}
	

}
