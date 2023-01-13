package controlStatement;

public class ConditionalStatements {

	public static void main(String[] args) {
		int i = 20;
		int j = 10;

		/**
		 * this is if statement
		 * 
		 * @author asamantaroy
		 */
		if (i != j) {
			System.out.println("I is not equals to J");

		}

		/**
		 * this is if else statement
		 * 
		 * @author asamantaroy
		 */
		if (i > j)
			System.out.println("I is greater than j");
		else {
			System.out.println("I is smaller than J");
			System.out.println("I am in else loop");
		}
		
		
		
		/**
		 * if else nested
		 * @author asamantaroy
		 */
		
		if(i!=j) {
			if (i > j)
				System.out.println("I is greater than j");
			else {
				System.out.println("I is smaller than J");
				System.out.println("I am in else loop");
			}
		}
		else
			System.out.println("I is equals to J");
		
		
		
		/**
		 * if else if
		 * @author asamantaroy
		 */	
		
		if(i==j)
			System.out.println("I is equals to J");
		else if(i>j)
			System.out.println("I is greter than J");
		
		else if(i<j)
			System.out.println("I is less than J");
		else
			System.out.println("I is not equals to J");

	}
}
