package exam;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto=new Auto(4, "Blue", 2000, 120);
		auto.speedUp(5);
		auto.speedDown(5);
		auto.Stop();
		
		Car car=new Car(4, "red", 1000, 150, "º£¶û¿Õµ÷", "bose");
		car.speedUp(10);
		car.speedDown(10);
		car.Stop();

	}

}
