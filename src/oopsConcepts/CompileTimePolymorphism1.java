package oopsConcepts;

public class CompileTimePolymorphism1 {
	
	void sum(int a, int b) {
		var sum = a+b;
		System.out.println("Sum of "+a+" and "+ b+" is "+sum);
	}
	
	void sum(int a, int b, int c) {
		var sum = a+b+c;
		System.out.println(String.format("Sum of %s, %s and %s is %s", a,b,c,sum));
	}
	
	
	public static void main(String[] args) {
		CompileTimePolymorphism1 obj = new CompileTimePolymorphism1();
		obj.sum(11, 23, 34);
	}
	
}
