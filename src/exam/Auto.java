package exam;

public class Auto {
	int tireNum;
	String color;
	double weight;
	double speed;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}
	
	Auto(int tireNum,String color,double weight,double speed){
		this.tireNum=tireNum;
		this.color=color;
		this.weight=weight;
		this.speed=speed;
	}
	
	public void speedUp(double speed) {
		// TODO Auto-generated method stub
		this.speed+=speed;
		System.out.println("������");
	}
	
	public void speedDown(double speed) {
		if(this.speed>=0) {
			this.speed-=speed;
			System.out.println("������");
		}
	}
	
	public void Stop() {
		this.speed=0;
		System.out.println("��ͣ��");
	}
}
