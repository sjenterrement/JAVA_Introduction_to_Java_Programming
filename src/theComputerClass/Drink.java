package theComputerClass;

public abstract class Drink {
	public abstract String taste();
	int drinkType;
	int Coffee=1,Beer=2,Milk=3;
	public Drink() {
		// TODO Auto-generated constructor stub
	}
	Drink(int newDrinkType){
		drinkType=newDrinkType;
	}
    static Drink getDrinkType(int drinkType) {
		switch (drinkType) {
		case 1:
			return new Coffee();
		case 2:
			return new Beer();
		case 3:
			return new Milk();
		}
		return null;
	}
}
