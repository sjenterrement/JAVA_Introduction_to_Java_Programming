package chapter_11;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// display circle and rectangle properties
		displayObject(new Circle_4(1, "red", false));
		displayObject(new Rectangle_1(1, 1, "balck", true));
	}

	// display geometic object properties
	public static void displayObject(GeometricObject1 object) {
		System.out.println("Create on " + object.getDateCreated() + " Color is " + object.getColor());
	}

}
