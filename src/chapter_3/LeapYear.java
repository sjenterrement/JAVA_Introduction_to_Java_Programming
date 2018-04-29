package chapter_3;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a Scanner
		Scanner input=new Scanner(System.in);
		System.out.print("Enetr a year: ");
		int year=input.nextInt();
		
		//check if the year is leaf year
		boolean isLeafYear=
				(year%4==0&&year%100!=0||year%400==0);
		
		//display the result
		System.out.println(year+" is a leaf year? "+isLeafYear);

	}

}
