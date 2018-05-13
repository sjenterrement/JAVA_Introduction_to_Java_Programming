package casual;

public class Ytb_2018_5_13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	// factorial
	public static long fact(long n) {
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
}
