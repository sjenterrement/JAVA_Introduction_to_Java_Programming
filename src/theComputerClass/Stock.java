package theComputerClass;

public class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String s, String n) {
		symbol = s;
		name = n;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}

	// main
	public static void main(String[] args) {
		String symbol1 = "java";
		String name1 = "Sum Microsystems inc";
		Stock stock1 = new Stock(symbol1, name1);
		stock1.previousClosingPrice = 4.5;
		stock1.currentPrice = 4.35;
		System.out.println(
				stock1.name + " price change: " + ((int) Math.abs(stock1.getChangePercent() * 10000)) / 100.0 + "%");

	}
}
