package theComputerClass;

public class Fan {
	final int SLOW=1,MEDIUM=2,FAST=3;
	private int speed=SLOW;
	private boolean on=false;
	private double radius=5;
	private String color="blue";
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int newSpeed){
		speed=newSpeed;
	}
	
	public boolean getOn(){
		return on;
	}
	
	public void turnOn(){
		on=true;
	}
	public void turnOff(){
		on=false;
	}
	
	public double getRadius(){
		return  radius;
	}
	
	public void setRadius(double newRadius){
		radius=newRadius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String newColor){
		color=newColor;
	}
	
	public Fan() {
		
	}
	
	public String toString() {
		if(on)
			return "speed: "+speed+"  color: "+color+"  radius: "+radius;
		else
			return "fan is off";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		fan1.setSpeed(3);
		fan1.setRadius(0);
		fan1.setColor("yellow");
		fan1.turnOn();
		
		System.out.println("fan1:\n"+fan1.toString());
		System.out.println("fan2:\n"+fan2.toString());

	}


}
