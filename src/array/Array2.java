package array;

public class Array2 {

	public static void main(String[] args) {
		int a[] = { 10, 11, 12, 13, 14, 15 };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		for (int p : a) {
			System.out.println(p);
		}
	}

}
