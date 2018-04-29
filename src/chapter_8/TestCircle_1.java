package chapter_8;

public class TestCircle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a circle with radius 1.0
		Circle1 circle1=new Circle1();
		System.out.println("The area of the cricle of radius "+circle1.radius+" is "+circle1.getArea());
		
		//create  a circle with radius 25
		Circle1 circle2=new Circle1(25);
		System.out.println("The area of the cricle of radius "+circle2.radius+" is "+circle2.getArea());
		
		//create a circle with radius 125
		Circle1 circle3=new Circle1(125);
		System.out.println("The area of the cricle of radius "+circle3.radius+" is "+circle3.getArea());
		
		//Modify circle radius
		circle2.radius=100;
		System.out.println("The area of the cricle of radius "+circle2.radius+" is "+circle2.getArea());

	}

}

//define the circle class with two constructors
class Circle1{
	double radius;
	
	//construct a circle with radius 1
	Circle1(){
		radius=1.0;
	}
	
	//construct a circle with a specified radius
	Circle1(double newRadius){
		radius=newRadius;
	}
	
	//return the area of this circle
	double getArea() {
		return radius*radius*Math.PI;
	}
	

}
