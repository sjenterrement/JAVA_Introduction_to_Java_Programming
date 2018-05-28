package exam;

import java.util.Scanner;

public class PaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入10个数：");
		Scanner input=new Scanner(System.in);
		int[] a =new int[10];
		if(input.hasNext()) {
			for (int i = 0; i < a.length; i++) {
				a[i]=input.nextInt();
			}
		}
		else {
			System.out.println("输入不合法");
		}
		
		int b[]=sort(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	
	private static int[] sort(int[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-i-1; j++) {
				if (b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
		
		return b;
	}

}
