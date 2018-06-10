package exam;

public class Cylinder1 extends Circle1 {
	private double hight;
	
	public Cylinder1(double r,double h) {
		super(r);
		this.hight=h;
	}
	
	public double getHight() {
		return hight;
	}
	
	public double getVolume() {
		// TODO Auto-generated method stub
		return (int)(getArea()*getHight()*100)/100.00;
	}
	
	public void showVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume: "+getVolume());
	}

}
