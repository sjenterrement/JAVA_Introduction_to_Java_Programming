package exam;

/*
 * 一个景区根据游人的年龄收取不同价格的门票，请编写游人类，根据年龄段决定能够购买的门票价格并输出，然后写出测试类测试该类（类的基本实现）
 */
public class Tourist {
	int age;
	int ticketPrice;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getTicketPrice() {
		// TODO Auto-generated method stub
		if (age>0&&age<12) 
			ticketPrice=20;
		else if(age<20)
			ticketPrice=20;
		else if(age<50)
			ticketPrice=80;
		else
			ticketPrice=35;
		System.out.println("门票价格："+ticketPrice);
	}

}
