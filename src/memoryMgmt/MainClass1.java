package memoryMgmt;

class SubClass {
	int var1; // instance variable or global variable
	 SubClass(){
		 	;
	 }
}

public class MainClass1{
	static void print() {
		int a = 10;
	}
	static void show() {
		int b=11;
		print();
	}
	
	public static void main(String[] args) {
		int c = 12;
		show();
		
		SubClass obj1;
		obj1 = new SubClass(); // #0000222
		System.out.println(obj1.hashCode());
		
		obj1 = new SubClass(); // #121233
		System.out.println(obj1.hashCode());
		
	}
}