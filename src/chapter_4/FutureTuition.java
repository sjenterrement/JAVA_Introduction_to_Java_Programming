package chapter_4;

public class FutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;// year 1
		int year = 1;
		while (tuition < 20000) {
			tuition = tuition * 1.07;
			year++;
		}

		System.out.println("Tuition will be doubled in " + year + " year");
	}
}
