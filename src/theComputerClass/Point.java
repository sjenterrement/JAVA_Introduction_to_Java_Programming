package theComputerClass;

public class Point {
	public double x, y;

	Point() {

	}

	Point(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}

	public void showPoint() {
		System.out.println("(" + getX() + "," + getY() + ")");
	}

}
