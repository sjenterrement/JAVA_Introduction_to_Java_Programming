package exam;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("input the ten numbers:£º");
		Scanner input=new Scanner(System.in);
		int[] a=new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int) (Math.random()*100);
		}
		/*
		 * if()
		 */

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int[] b=sort(a);
		System.out.println("max:"+b[9]);
		System.out.println("min:"+b[0]);
	}
	
	public static int[] sort(int[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-i-1; j++) {
				if(b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		
		return b; 
	}
}
