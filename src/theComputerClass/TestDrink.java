package theComputerClass;

import java.util.Scanner;

public class TestDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your number of drink:");
		int drinkType=input.nextInt();
		Drink drink=Drink.getDrinkType(drinkType);
		if(drinkType>3)
			System.out.println("�Բ���û��������������");
		else
			System.out.println(drink.taste());

	}

}
