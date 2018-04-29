package chapter_11;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create and initialize two objects
		Object object1 = new Circle_4(1);
		Object object2 = new Rectangle_1(1, 1);

		// display circle and rectangle
		displayObject(object1);
		displayObject(object2);

	}

	// a method for displaying an object
	public static void displayObject(Object object) {
		if (object instanceof Circle_4) {
			System.out.println("The circle area is " + ((Circle_4) object).getArea());
			System.out.println("The circle diameter is " + ((Circle_4) object).getDiameter());
		} else if (object instanceof Rectangle_1) {
			System.out.println("The rectangle area is " + ((Rectangle_1) object).getArea());
		}
	}
}
