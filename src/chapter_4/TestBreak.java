package chapter_4;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int number=0;
		while (number<20) {
			number++;
			sum+=number;
			if(sum>=100)
				break;
		}

		System.out.println("The number is "+number);
		System.out.println("The sum is "+sum);
	}

}