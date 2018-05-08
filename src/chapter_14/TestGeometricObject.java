package chapter_14;

public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create two geomrtric object
		GeometricObject geoObject1 = new Circle(5);
		GeometricObject geoObject2 = new Rectangle(5, 3);

		System.out.println("The two objects have same area ? " + equalArea(geoObject1, geoObject2));

		// display circle
		displayGeometricObject(geoObject1);

		// display circle
		displayGeometricObject(geoObject2);
	}

	// a method for comaring the areas of two geometric object
	public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}

	// a method for display a Geometric Object()
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
