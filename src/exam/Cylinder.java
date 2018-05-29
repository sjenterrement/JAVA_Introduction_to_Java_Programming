package exam;

public class Cylinder {
	
	double radius=0;
	double hight=0;
	
	Cylinder(){
	}
	
	Cylinder(double newRadius,double newHeight){
		radius=newRadius;
		hight=newHeight;
	}

	double getRadius() {
		return radius;
	}
	
	void setRadius(double newRadius) {
		radius=newRadius;
	}
	
	double getHeight() {
		return hight;
	}
	
	void setHeight(double newHeight) {
		hight=newHeight;
	}
	
	double getVolume() {
		return radius*radius*Math.PI;
	}
	
	void showVolume() {
		System.out.println("the volume of the cylinder is: "+getVolume());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder1=new Cylinder(2,5);
		cylinder1.showVolume();

	}

}
