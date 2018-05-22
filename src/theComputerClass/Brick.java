package theComputerClass;

public class Brick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 36; i++) {
			for (int j = 1; j < 36; j++) {
				for (int k = 1; k < 36; k++) {
					if (i + j + k == 36 && 4 * i + 3 * j + (1.0 / 2.0) * k == 36)
						System.out.println("Men: " + i + " Women: " + j + " Kids: " + k);
				}
			}
		}

	}

}
