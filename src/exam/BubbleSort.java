package exam;

public class BubbleSort {
	
	//ц╟ещеепР
	private void sort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j]>array[j+1]) {
					int temp=array[j];
					array[j+1]=temp;
				}
			}
			
		}
		
		showArray(array);
	}
	
	

	private void showArray(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {32,4,2,77,87,98,0};
		BubbleSort sortor=new BubbleSort();
		sortor.sort(array);

	}

}
