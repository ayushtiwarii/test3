package inheritance;


class A{
	protected static int a=10;
	/*
	 * A(){ System.out.println("I am in class A constrcutor"); }
	 * 
	 * void print() { System.out.println("I am in class print method"); }
	 */
}

class B extends A{
	/*
	 * B(){ System.out.println("I am in class B constrcutor"); }
	 */
	
	public static void show() {
		System.out.println(a);
	}
}

public class Inheritance1 extends B {
	/*
	 * int a=19;
	 * 
	 * void print() { System.out.println("I am in class A print method"); }
	 * 
	 * public Inheritance1() { // TODO Auto-generated constructor stub
	 * System.out.println("I am in class Inheritance1 constrcutor");
	 * System.out.println(super.a); }
	 */

	
	
	public static void main(String[] args) {
		B.show();
	}
}
