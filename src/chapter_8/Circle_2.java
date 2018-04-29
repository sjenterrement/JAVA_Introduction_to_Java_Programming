package chapter_8;

public class Circle_2 {
	
		double radius;

		static int numberOfObjects = 0;

		// the number of objects create
		Circle_2() {
			radius = 1.0;
			numberOfObjects++;
		}

		// construct a circle with specified radius
		Circle_2(double newRadius) {
			radius = newRadius;
			numberOfObjects++;
		}

		// return numberofobjects
		static int getNumberOfObjects() {
			return numberOfObjects;
		}

		// return getArea
		double getArea() {
			return radius * radius * Math.PI;
		}

	}



