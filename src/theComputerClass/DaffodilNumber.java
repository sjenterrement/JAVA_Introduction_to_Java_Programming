package theComputerClass;

public class DaffodilNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for (int i = 100; i <= 999 ; i++) {
			a=i%10;
			b=i/10%10;
			c=i/100;
			if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i)
				System.out.println("Daffodil number: "+i);
		}

	}

}
