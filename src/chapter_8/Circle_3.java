package chapter_8;

public class Circle_3 {
	//the radius of circle
	private double radius=1;
	
	//the number of the objects created
	private static int numberOfObjects=0;
	
	//construct a ciecle with radius 1
	public Circle_3() {
		numberOfObjects++;
	}
	
	//construct a circle with specified radius
	public Circle_3(double newRadius) {
		radius=newRadius;
		numberOfObjects++;
	}
	
	//return radius
	public double getRadius() {
		return radius;
	}
	
	//set a new radius
	public void setRadius(double newRadius) {
		radius=(newRadius>=0)?newRadius:0;
	}
	
	//return numberofobjects
	public static int getNumberOfObjects() {
		return numberOfObjects++;
	}
	
	//return of area of this circle
	public double getArea() {
		return radius*radius*Math.PI;
	}

}
