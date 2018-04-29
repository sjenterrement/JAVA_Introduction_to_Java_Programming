package chapter_8;

public class Circle_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a circle with radius 1.0
				Circle_1 circle1=new Circle_1();
				System.out.println("The area of the cricle of radius "+circle1.radius+" is "+circle1.getArea());
				
				//create  a circle with radius 25
				Circle_1 circle2=new Circle_1(25);
				System.out.println("The area of the cricle of radius "+circle2.radius+" is "+circle2.getArea());
				
				//create a circle with radius 125
				Circle_1 circle3=new Circle_1(125);
				System.out.println("The area of the cricle of radius "+circle3.radius+" is "+circle3.getArea());
				
				//Modify circle radius
				circle2.radius=100;
				System.out.println("The area of the cricle of radius "+circle2.radius+" is "+circle2.getArea());

	}
	double radius;
	//construct a circle with radius 1
		Circle_1(){
			radius=1.0;
		}
		
		//construct a circle with a specified radius
		Circle_1(double newRadius){
			radius=newRadius;
		}
		
		//return the area of this circle
		double getArea() {
			return radius*radius*Math.PI;
		}

}
