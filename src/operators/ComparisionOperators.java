package operators;

public class ComparisionOperators {
	
	int i;
	int j;
	ComparisionOperators(int i, int j){
		this.i=i;
		this.j=j;
	}
	/**
	 * Comparison operators in Java
	 */
	
	void compare() {
			
		if(i!=j) {
			if(i>j)
				System.out.println(i+" is greater than "+j);
			else
				System.out.println(i+" is smaller than "+j);
			
			if(i<j)
				System.out.println(i+" is smaller than "+j);
			else
				System.out.println(i+" is greater than "+j);	
		}
		else
			System.out.println(i+" is equals to "+j);	
		
	}
	
	void compare(int a, int b) {
		
		this.i=a;
		this.j=b;
		
		if(i!=j) {
			if(i>j)
				System.out.println(i+" is greater than "+j);
			else
				System.out.println(i+" is smaller than "+j);
			
			if(i<j)
				System.out.println(i+" is smaller than "+j);
			else
				System.out.println(i+" is greater than "+j);	
			}
		else
			System.out.println(i+" is equals to "+j);	
	}
	
	
	
	public static void main(String[] args) {
		int i=30;
		int j=50;
		
		/**
		 * lines of code from line#11 to 22 
		 * Checking the equality of two numbers  
		 */
		if(i==j)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		
		if(i!=j)
			System.out.println("I is not euqal to J");
		else
			System.out.println("I is equal to J");
		

		ComparisionOperators obj1 = new ComparisionOperators(40, 30);
		obj1.compare();
		
		obj1.compare(10, 11);
		
		obj1.compare(11, 10);
		
		obj1.compare(10, 10);		
		
	}

}
