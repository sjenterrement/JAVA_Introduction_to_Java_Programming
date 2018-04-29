package chapter_5;

public class RandomCharacter {
	// Generate a char get Random character between ch1 and ch2
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	// generate a random lowercase letter
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	// generate a random uppercase letter
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	// generate a random digit character
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
