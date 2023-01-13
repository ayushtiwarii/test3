package packageA;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		// Default access
		System.out.println(obj.b);
		obj.print2();

		// Protected access
		System.out.println(obj.d);
		obj.print4();

		// Public access
		System.out.println(obj.c);
		obj.print3();
	}

}
