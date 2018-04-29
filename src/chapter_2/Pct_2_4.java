package chapter_2;
import java.util.Scanner;
public class Pct_2_4 {    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a=1;
		double d=1.0;
		Scanner input = new Scanner(System.in);
		System.out.print("sign:");
		int sign=input.nextInt();
	    switch(sign) {
		case 1:
			a=46/9; break;
		case 2:
			a=46%9+4*4-2; break;
		case 3:
			a=45+43%5*(23*3%2); break;
		case 4:
			a%=3/a+3; break;
		case 5:
			d=4+d*d+4; break;
		case 6:
			d+=1.5*3+(++a); break;
		case 7:
			d-=1.5*3+a++; break;
		default:
			break;
		}
	   // a=46/9;
	    
		System.out.println("a: "+a);
		System.out.println("d: "+d);
	}

}
