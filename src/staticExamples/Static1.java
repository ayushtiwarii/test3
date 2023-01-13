package staticExamples;

public class Static1 {
	
	static int a=10;
	
	static void calc() {
		a+=20;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		System.out.println(a);
		calc();	
	}

}
