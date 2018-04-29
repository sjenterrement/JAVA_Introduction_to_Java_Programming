package chapter_11;

public class Circle_4 extends GeometricObject1 {
	private double radius;

	public Circle_4() {
	}

	public Circle_4(double radius) {
		this.radius = radius;
	}

	public Circle_4(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// return radius
	public double getRadius() {
		return radius;
	}

	// set a new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// return area
	public double getArea() {
		return radius * radius * Math.PI;
	}

	// return diameter
	public double getDiameter() {
		return 2 * radius;
	}

	// return perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// print circle info
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
}
