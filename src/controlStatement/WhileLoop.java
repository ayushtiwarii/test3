package controlStatement;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1;

		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		System.out.println();

		do {
			System.out.println(i);
			i++;
		} while (i >= 200);

	}

}
