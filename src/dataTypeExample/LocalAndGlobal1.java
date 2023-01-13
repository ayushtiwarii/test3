package dataTypeExample;

public class LocalAndGlobal1 {
	
	int i=10;
	int j;
	String str1;
	String str2="TEK";
	
	void method1() {
		i=20;
		System.out.println(i);  //  20 and 20
	}
	
	/**
	 *  i   local(i)
	 *  20   30
	 *  28
	 */
	
	void method2() {
		int i=30;
		this.i = i-2;
		System.out.println(this.i);  // Vikas -8, Sushma -8, Ayush-8, Ayesha/Sushma/Suprita/Pratham/Priya - 28, Mahendra - 10
		System.out.println(i); // 30,  
	}
	
	void method3() {
		String str2 = "Systems";
		System.out.println(j);  // 
		System.out.println(str1); 
		System.out.println(str2); 
		
	}
	
	public static void main(String[] args) {
		LocalAndGlobal1 obj = new LocalAndGlobal1();
		obj.method1();
		obj.method2();
		obj.method3();
	}

}
