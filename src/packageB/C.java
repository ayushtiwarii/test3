package packageB;

import packageA.A;

public class C extends A {
	public static void main(String[] args) {
		C obj = new C();
		
		// Protected access
		System.out.println(obj.d);
		obj.print4();
		
		//Public Access
		System.out.println(obj.c);
		obj.print3();	
	}
}
