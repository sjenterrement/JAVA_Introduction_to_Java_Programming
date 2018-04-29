package chapter_11;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a list to store cities
		java.util.ArrayList cityList = new java.util.ArrayList<>();

		// add some cities in the list
		cityList.add("London");
		// cityList now contains [London]
		cityList.add("Denver");
		// cityList now contains [London,Denver]
		cityList.add("Paris");
		// cityList now contains [London,Denver,Paris]
		cityList.add("Miami");
		// cityList now contains [London,Denver,Paris,Miami]
		cityList.add("Seoul");
		// cityList now contains [London,Denver,Paris,Miami,Seoul]
		cityList.add("Tokyo");
		// cityList now contains [London,Denver,Paris,Miami,Seoul,Tokyo]

		System.out.println("List size? " + cityList.size());
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
		System.out.println("Is the list empty? " + cityList.isEmpty());// print false

		// insert a new city at index 2
		cityList.add(2, "Xian");
		// cityList now contains [London,Denver,Xian,Paris,Miami,Seoul,Tokyo]

		// remove a city form the list
		cityList.remove("Miami");
		// cityList now contains [London,Denver,Paris,Seoul,Tokyo,Xian]

		// remove a city at index 1
		cityList.remove(1);
		// cityList now contains [London,Xian,Paris,Miami,Seoul,Tokyo]

		// display the contents in the list
		System.out.println(cityList.toString());

		// display the contents int the list in reverse order
		for (int i = cityList.size() - 1; i >= 0; i--)
			System.out.print(cityList.get(i) + " ");
		System.out.println();

		// create a list to store two circle
		ArrayList list = new ArrayList();

		// add two circle
		list.add(new Circle_4(2));
		list.add(new Circle_4(3));

		// display the area of the forst circle in the list
		System.out.println("The area of the circle? " + ((Circle_4) list.get(0)).getArea());

	}

}
