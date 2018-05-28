package exam;

import java.util.Scanner;

public class GetMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0, min = 10000;
		int[] a = new int[10];
		System.out.print("input ten numbers: ");
		Scanner input = new Scanner(System.in);
		if (input.hasNext()) {
			for (int i = 0; i < a.length; i++) {
				a[i] = input.nextInt();
			}

		} else {
			System.out.println("incorrect input");
		}
		
		for (int i = 0; i < a.length; i++) {
			max=getMax(a[i],max);
			min=getMin(a[i],min);
		}
		
		System.out.println("the maximum is: "+max);
		System.out.println("thr minimum is: "+min);
	}
	
	public static int getMax(int a,int b) {
		int max=0;
		if(a>b)
			max=a;
		else
			max=b;
		
		return max;
	}
	
	public static int getMin(int a,int b) {
		int min=10000;
		if(a<b)
			min=a;
		else
			min=b;
		
		return min;
	}

}
