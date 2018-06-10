package exam;

public class Circle1 {
	private double Radius;
	
	public Circle1() {
		// TODO Auto-generated constructor stub
		this.Radius=0.0;
	}
	
	public Circle1(double r){
		this.Radius=r;
	}
	
	public double getRadius() {
		return Radius;
	}
	
	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double getArea() {
		return getRadius()*getRadius()*3.14;
	}
	
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2.0*getRadius();
	}
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("radius: "+getRadius());
		System.out.println("perimeter: "+getPerimeter());
		System.out.println("area: "+getArea());
		

	}

}
