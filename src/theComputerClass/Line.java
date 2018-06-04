package theComputerClass;

public class Line {
	Point start, end;

	Line() {

	}

	Line(Point newStart, Point newEnd) {
		start = newStart;
		end = newEnd;
	}

	public void showLine() {
		System.out.println("the start's coordinates is (" + start.x + "," + start.y + ") \n"
				+ "the end's coordinates is (" + end.x + "," + end.y + ") \nthe distance is "
				+ ((int) (Math.sqrt(Math.pow((end.x - start.x), 2) + Math.pow((end.y - start.y), 2))) * 100) / 100.0);
	}

}
