package chapter_3;

import java.util.Scanner;

public class GuessBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String set1 = " 1  3  5  7\n" + " 9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31";

		String set2 = " 2  3  6  7\n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31";

		String set3 = " 4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31";

		String set4 = " 8  9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31";

		String set5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31";

		int day1 = 0;
		int day2 = 0;
		int day3=0;

		// create a Scanner
		Scanner input = new Scanner(System.in);

		// prompt the user to answer questions
		System.out.print("Is your birthday in set1?\n");
		System.out.print(set1);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		int answer1 = input.nextInt();
		int answer2= input.nextInt();
		int answer3=input.nextInt();

		if (answer1 == 1)
			day1 += 1;
		if(answer2==1)
			day2+=1;
		if(answer3==1)
			day3+=1;
			

		// prompt the user to answer questions
		System.out.print("Is your birthday in set2?\n");
		System.out.print(set2);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer1 = input.nextInt();
		answer2= input.nextInt();
		answer3=input.nextInt();

		if (answer1 == 1)
			day1 += 2;
		if(answer2==1)
			day2+=2;
		if(answer3==1)
			day3+=2;

		// prompt the user to answer questions
		System.out.print("Is your birthday in set3?\n");
		System.out.print(set3);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer1 = input.nextInt();
		answer2= input.nextInt();
		answer3=input.nextInt();

		if (answer1 == 1)
			day1 += 4;
		if(answer2==1)
			day2+=4;
		if(answer3==1)
			day3+=4;

		// prompt the user to answer questions
		System.out.print("Is your birthday in set4?\n");
		System.out.print(set4);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer1 = input.nextInt();
		answer2= input.nextInt();
		answer3=input.nextInt();

		if (answer1 == 1)
			day1 += 8;
		if(answer2==1)
			day2+=8;
		if(answer3==1)
			day3+=8;

		// prompt the user to answer questions
		System.out.print("Is your birthday in set5?\n");
		System.out.print(set5);
		System.out.print("\nEnter 0 for No and 1 for Yes: ");
		answer1 = input.nextInt();
		answer2= input.nextInt();
		answer3=input.nextInt();

		if (answer1 == 1)
			day1 += 16;
		if(answer2==1)
			day2+=16;
		if(answer3==1)
			day3+=16;
		
		System.out.println("\nYour birthday is "+(2018-day1)+"Äê"+day2+"ÔÂ"+day3+"ÈÕ"+"!");

	}

}
