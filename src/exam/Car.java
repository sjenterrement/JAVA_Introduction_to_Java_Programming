package exam;

public class Car extends Auto{
	String airConditioner;
	String CD;
	public Car() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Car(int tireNum,String color,double weight,double speed,String airConditioner,String CD) {
		super(tireNum,color,weight,speed);
		this.airConditioner=airConditioner;
		this.CD=CD;
	}
	

}
