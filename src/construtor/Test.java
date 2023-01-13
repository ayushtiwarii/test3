package construtor;

public class Test {

	int a;
	String str;
	
	Test(int i, String s){
		a = i;
		str=s;
		System.out.println("Parameterized constructor");
	}
	Test(){
		System.out.println("Default constructor");
	}
	
	public static void main(String[] args) {
		Test obj1 = new Test(11, "TEK");
		obj1 = new Test();
		System.out.println(obj1.a);
		System.out.println(obj1.str);
		
	}	
}