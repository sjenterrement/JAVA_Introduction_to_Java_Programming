package chapter_8;

public class TestCircle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+Circle_2.numberOfObjects);
		
		//create c1
		Circle_2 c1=new Circle_2();
		
		//display c1 before c2 is created
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius ("+c1.radius+") and number of Circle objects ("+c1.numberOfObjects+")");
		
		//Create c2
		Circle_2 c2=new Circle_2(5);
		
		//Modify c1
		c1.radius=9;
		
		//display c1 and c2 after c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+") and number of circle objects ("+c1.numberOfObjects+")");
		System.out.println("c2: radius ("+c2.radius+") and number of Circle objects ("+c2.numberOfObjects+")");

	}

}
