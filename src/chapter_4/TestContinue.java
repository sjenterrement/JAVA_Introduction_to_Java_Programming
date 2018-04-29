package chapter_4;

public abstract class TestContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
			

		}

		System.out.println("The is sum " + sum);
	}

}
