package theComputerClass;

public class Student {
	String name;
	String stuno;
	float math;
	float english;
	float computer;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String stuno,String name,float math,float english,float computer){
		this.stuno=stuno;
		this.name=name;
		this.math=math;
		this.english=english;
		this.computer=computer;
	}
	public void setStuno(String s){
		stuno=s;
	}
	public void setName(String n){
		name=n;
	}
	public void setMath(float m){
		math=m;
	}
	public void setEnglish(float e){
		english=e;
	}
	public void setComputer(float c){
		computer=c;
	}
	public String getStuno(){
		return stuno;
	}
	public String getName(){
		return name;
	}
	public float getMath(){
		return math;
	}
	public float getEnglish(){
		return english;
	}
	public float getComputer(){
		return computer;
	}
	public float sum(){
		return getMath()+getEnglish()+getComputer();
	}
	public float avg(){
		return sum()/3;
	}
	public float max(){
		return Math.max(Math.max(getMath(), getEnglish()), getComputer());
	}
	public float min(){
		return Math.min(Math.min(getMath(), getEnglish()), getComputer());
	}
}
