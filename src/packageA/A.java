package packageA;

public class A {

	private int a = 10;
	int b = 11;
	public int c = 12;
	protected int d = 13;

	private void print1() {
		System.out.println("I am in a private method");
	}

	void print2() {
		System.out.println("I am in a method with default access");
	}

	public void print3() {
		System.out.println("I am in a method with public access");
	}

	protected void print4() {
		System.out.println("I am in a method with protected access");
	}

	public static void main(String[] args) {

		A obj = new A();

		// Private access
		System.out.println(obj.a);
		obj.print1();
		
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
