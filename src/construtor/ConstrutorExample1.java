package construtor;

public class ConstrutorExample1 {
	
	int a=10;
	String str;
	
	ConstrutorExample1(){
		a = 20;
		str="TGS training";
		System.out.println("Default construtor is called");
		a = a*10;	
	}
	
	ConstrutorExample1(int a, String str){
		this.a = a;
		this.str=str;
	}
		
	public static void main(String[] args) {
		
		ConstrutorExample1 obj = new ConstrutorExample1();
		System.out.println(obj.a);
		System.out.println(obj.str);
		
		ConstrutorExample1 obj2 = new ConstrutorExample1(31, "Systems");
		System.out.println(obj2.a); // 31
		System.out.println(obj2.str); // Systems			
		
	}

}
