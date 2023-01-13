package dataTypeExample;

public class DataTypeMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 98989;
		short s = 32767; //32767 and -32768
		byte b = 10;
		
		float f = 3.12f;
		double d = 23.343434d;
		long l = 9090909098898988L; //literals
		
		
		System.out.println("Size of integer="+Integer.SIZE);
		System.out.println("Minimum value of an integer="+Integer.MIN_VALUE);
		System.out.println("Maximun value of an integer="+Integer.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Size of Short="+Short.SIZE);
		System.out.println("Minimum value of an Short="+Short.MIN_VALUE);
		System.out.println("Maximun value of an Short="+Short.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Size of Byte="+Byte.SIZE);
		System.out.println("Minimum value of an Byte="+Byte.MIN_VALUE);
		System.out.println("Maximun value of an Byte="+Byte.MAX_VALUE);
		
		System.out.println();
		
		System.out.println("Size of Float="+Float.SIZE);
		System.out.println("Minimum value of an Float="+Float.MIN_VALUE);
		System.out.println("Maximun value of an Float="+Float.MAX_VALUE+"\n");
		
		System.out.println("Size of Double="+Double.SIZE);
		System.out.println("Minimum value of an Double="+Double.MIN_VALUE);
		System.out.println("Maximun value of an Double="+Double.MAX_VALUE+"\n");
		
		System.out.println("Size of Long="+Long.SIZE);
		System.out.println("Minimum value of an Long="+Long.MIN_VALUE);
		System.out.println("Maximun value of an Long="+Long.MAX_VALUE+"\n");
	}

}
