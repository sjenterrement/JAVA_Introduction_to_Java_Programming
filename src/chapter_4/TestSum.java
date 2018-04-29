package chapter_4;

public class TestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize sum
		float sum=0;
		
		//add 0.01,0.02,...,0.99,1 to sum
		for (float i = 0.01f; i <=1.0; i=i+0.01f) {
			sum+=i;
		}
		
		//display result
		System.out.println("The sum is "+sum);
	}
}
