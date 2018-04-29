package chapter_8;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a circle objects with radius
		Circle_3 myCircle=new Circle_3(1);
		
		//print area for radius 1,2,3,4 and 5
		int n=5;
		printArea(myCircle,n);
		
		//see myCircle.radius and times
		System.out.println("\n"+"Radius is "+myCircle.getRadius());
		System.out.println("n is "+n);
	}
	
	//print a table of areas for radius
	public static void printArea(Circle_3 c,int times) {
		System.out.println("Radius \t\tArea");
		while (times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}

}
