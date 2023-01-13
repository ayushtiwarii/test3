package packageB;

import packageA.A;

public class D {
	
	public static void main(String[] args) {
		A obj = new A();
		//public access
		System.out.println(obj.c);
		obj.print3();
	}

}
