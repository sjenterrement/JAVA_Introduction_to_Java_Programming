package chapter_12;

public class ComparableRectangle extends Rectangle implements Comparable {
	// construct a comparableRectangle with specified properties
	public ComparableRectangle(double width, double height) {
		super(width, height);
	}

	// implement the compareTo method defined in Comparable
	public int compareTo(Object o) {
		if (getArea() > ((ComparableRectangle) o).getArea())
			return 1;
		else if (getArea() < ((ComparableRectangle) o).getArea())
			return -1;
		else
			return 0;
	}
}
