package exam;

public class WuMingFen {

	String theMa;
	int quantity;
	boolean likeSoup;

	public String getTheMa() {
		return theMa;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean getLikeSoup() {
		return likeSoup;
	}

	WuMingFen(String theMa, int quantity, boolean likeSoup) {
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}

	WuMingFen(String theMa, int quantity) {
		this.theMa = theMa;
		this.quantity = quantity;
	}

	WuMingFen() {
		this.theMa = "酸辣";
		this.quantity = 2;
		this.likeSoup = true;
	}

	void check() {
		if(getLikeSoup()) {
			System.out.println("面码：" + getTheMa());
			System.out.println("粉的分量：" + getQuantity());
			System.out.println("是否带汤：" + getLikeSoup());
			System.out.println("-----------------------");
		}
		else {
			System.out.println("面码：" + getTheMa());
			System.out.println("粉的分量：" + getQuantity());
			System.out.println("-----------------------");
		}
		
	}

}
