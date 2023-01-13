package operators;

public class OperatorExample1 {
	
	int i,j,k;
	
	// + operator - this is a method to sum 20 and 30
	
	OperatorExample1(){
		
	}
	
	OperatorExample1(int i, int j){
		this.i = i;
		this.j= j ;
	}
	
	OperatorExample1(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	
	void sum() {
		System.out.println(i+j);
	}
	void sum(String str) {
		System.out.println(str);
		System.out.println(i+j+k);
	}
	
	void sum(int i, int j) {
		this.i=i;
		this.j=j;
		System.out.println("Sum of "+i+" and "+j+" is "+(i+j));
	}
	
	// - Subtraction 
	int diff(int i, int j) {
		return i-j;	
	}
	
	// * Multiplication and div
	/*
	 * int multiplication() {
	 * 
	 * }
	 */
	
	// % modulus operator
	
	int modulus(int i, int j) {
		return i%j;	
	}
	
	public static void main(String[] args) {
		
		OperatorExample1 obj = new OperatorExample1();
		obj.sum();
		obj.sum(10, 30);
		obj.sum(30, 50);
		
		OperatorExample1 obj1 = new OperatorExample1(20, 50);
		obj1.sum();
		
		int sub = obj.diff(10, 5);
		System.out.println("Substraction:"+sub);
		
		int mod = obj.modulus(11, 5);
		System.out.println("Remainder:"+mod);
		
		
		OperatorExample1 obj2 = new OperatorExample1(10, 30, 40);
		obj2.sum("Sum of 3 numbers");
		
	}
	
}
