package dataTypeExample;

public class DataTypeExample {
	
	int i=10;
	long l;
	float f;
	double d;
	short s;
	boolean b;
	String str;
	
	
	public static void main(String[] args) {
		DataTypeExample obj = new DataTypeExample();
		
		System.out.println("Default value of an Integer:"+obj.i);
		
		obj.i = obj.i+10;
		
		System.out.println("Default value of an Integer:"+obj.i);
	}

}
