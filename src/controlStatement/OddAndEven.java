package controlStatement;

public class OddAndEven {
	
	
	void printOdd(int limit) {	
		for(int i=2;i<=limit;i++) {
			if(i%2==0)
				System.out.println(i+" is an even number");
		}
	}
	
	void printEven(int limit) {	
		for(int i=2;i<=limit;i++) {
			if(i%2!=0)
				System.out.println(i+" is an odd number");
		}
	}
	
	void printOddOrEven(int limit) {	
		for(int i=2;i<=limit;i++) {
			if(i%2==0)
				System.out.println(i+" is an even number");
			else
				System.out.println(i+" is an odd number");
		}
	}
	
	public static void main(String[] args) {
		
			OddAndEven obj = new OddAndEven();
			obj.printEven(100);
	}

}
