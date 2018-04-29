package chapter_1;

public class Cal_Pi {

	public static void main(String[] args) {
		double sum=1;
		for(int i=1;;i++) {
			double term=1.0/(i*2+1);
			if(i%2==0) sum+=term;
			else sum-=term;
			if(term<1e-6) break;
		}
		System.out.println(4.0*sum);
	}
}
