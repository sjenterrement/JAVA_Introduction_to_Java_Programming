package exam;

/*
 * һ�������������˵�������ȡ��ͬ�۸����Ʊ�����д�����࣬��������ξ����ܹ��������Ʊ�۸������Ȼ��д����������Ը��ࣨ��Ļ���ʵ�֣�
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
		System.out.println("��Ʊ�۸�"+ticketPrice);
	}

}
