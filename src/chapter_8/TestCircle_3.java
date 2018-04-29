package chapter_8;

public class TestCircle_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a circle with radius 5.0
		Circle_3 myCircle = new Circle_3(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		// increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

		System.out.println("The number of objects created is " + Circle_3.getNumberOfObjects());

	}

}
