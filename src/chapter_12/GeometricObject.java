package chapter_12;

public abstract class GeometricObject {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//construct a default geometic object
	public GeometricObject() {
		dateCreated=new java.util.Date();
	}
	
	//construct a geometric object with the specified color and filled value
	public GeometricObject(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	
	//return color
	public String getColor() {
		return color;
	}
	
	//set a new color
	public void setColor(String color) {
		this.color=color;
	}
	
	//return filled.Since filled is boolean,its get method is named isFilled
	public boolean isFilled() {
		return filled;
	}
	
	//set a new filled 
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	//get dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//return a string represention of this object
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
	
	//abstract method getArea
	public abstract double getArea();
	
	//abstract method getPerimeter
	public abstract double getPerimeter();
}
