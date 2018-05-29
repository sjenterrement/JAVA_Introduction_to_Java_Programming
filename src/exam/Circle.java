package exam;

public class Circle {

	double radius=0;
	
	Circle(){
		
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double newRadius) {
		radius=newRadius;
	}
	
	Circle(double newRadius){
		radius=newRadius;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}
	
	void showArea() {
		System.out.println("the area of circle is: "+getArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		Circle circle1=new Circle();
		System.out.println(circle1.radius);
		circle1.showArea();
		circle1.setRadius(5);
		circle1.showArea();

	}

}
