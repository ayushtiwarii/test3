package wrapperClass;

public class Autoboxing {
	
	public static void main(String[] args) {
		int i = 105;
		
		Integer a = Integer.valueOf(i);
		Integer b = i; // Autoboxing
		
		System.out.println(a);
		System.out.println(b);
		
		String str = "10";
		
		System.out.println(Integer.sum(a, b));
		
//		lambda expressions
	}

}
