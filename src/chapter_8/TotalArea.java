package chapter_8;

public class TotalArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare circleArray
		Circle_3[] circleArray;
		
		//Create circleArray
		circleArray=createCircleArray();
		
		//print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	
	//create an Array of Circle objects
	public static Circle_3[] createCircleArray() {
		Circle_3[] circleArray=new Circle_3[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i]=new Circle_3(Math.random()*100);
		}
		
		//return Circle Array
		return circleArray;
	}
	
	//print an array of circle and their area
	public static void printCircleArray(Circle_3[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius","Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		
		System.out.println("-----------------------------------------");
		
		//compute and display result
		System.out.printf("%-30s%-15f\n", "The total area of circles is",sum(circleArray));
	}
	
	//add circle area
	public static double sum(Circle_3[] circleArray) {
		//initialize sum
		double sum=0;
		
		//add areas to sum
		for (int i = 0; i < circleArray.length; i++) {
			sum+=circleArray[i].getArea();
		}
		
		return sum;
	}

}
