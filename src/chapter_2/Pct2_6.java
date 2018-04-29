package chapter_2;
import java.util.Scanner;
public class Pct2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int day=input.nextInt();
		int remain,week;
		String data = null;
		remain=day%7;
		week=(2+remain)%7;
		switch(week) {
		case 1:
			data="Monday";break;
		case 2:
			data="Tuesday";break;
		case 3:
			data="Wednesday";break;
		case 4:
			data="Thursday";break;
		case 5: 
			data="Friday";break;
		case 6:
			data="Saturday";break;
		case 7:
			data="Sunday";break;
		default:
			break;
		}
		System.out.println(day+" days after the day is: "+data);
	}

}
