package chapter_14;

public class TestComparableRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparableRectangle rectangle1=new ComparableRectangle(4, 5);
		ComparableRectangle rectangle2=new ComparableRectangle(3, 6);
		System.out.println(Max.max(rectangle1,rectangle2));

	}

}
