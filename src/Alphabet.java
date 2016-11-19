
public class Alphabet {

	public static void main(String[] args) {
		ASCIICodes();
	}

	public static void ASCIICodes() {
		for(int i = 65; i < 91; i++) {
			display((i), "-", (char)i);
		}
	}

	// A method that prints the arguments to the screen 
	public static void display(int x, String msg, char y) {
		System.out.println(x + msg + y);
	}
}
