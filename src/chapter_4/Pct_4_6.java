package chapter_4;

public class Pct_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,c;
		System.out.println("Ӣ��                               ǧ��                               ǧ��                               Ӣ��");
		for (int i = 1; i <=100; i++) {
			a=1.609*i;
			System.out.printf("%-3d       %-7.3f      ",i,a);
			int b=20+5*(i-1);
			c=b/1.609;
			System.out.printf("%-3d       %.3f\n",b,c);
			
		}

	}

}
