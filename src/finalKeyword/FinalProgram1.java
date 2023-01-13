package finalKeyword;

// can't be extended
final class A{
	void p1() {
		
	}
	
}

class B{
	// can't be overridden
	final void p2() {
		
	}
	
}


public class FinalProgram1 extends B {
	
	// can't be overridden
	/*
	 * void p2() {
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		final var i = 10;
		// value can't be changed
//		i=10;
		
		System.out.println(i);
		
	}
	
	

}
