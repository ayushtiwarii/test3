package dataTypeExample;

public class LocalAndGloablVariable {
	
	int i=10;
	
	void print() {
		var i=30;
		System.out.println(this.i); // 10
		System.out.println(i); // 30
	}	
	
	int show() {
		return i; // 10
	}
	
	public static void main(String[] args) {
		LocalAndGloablVariable obj = new LocalAndGloablVariable();
		obj.print();
		System.out.println(obj.show());
	}
}
