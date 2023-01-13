package operators;

public class PreIncrementAndPostIncrementOperator {
	
	public static void main(String[] args) {
		
		int i=10, j=20;
		
		/**
		 * i   j   o/p
		 * 10  20
		 * 10  21  31
		 * 11  21  31
		 * 11  20  9
		 * 10  20
		 * 11      22
		 * 10      32
		 * 11      32
		 * 10      42
		 * 10      
		 * 9
		 * 10      19
		 * 10      29
		 * 11      40
		 * 10      40
		 * 11	   51     
	 	 */
		
		int k = i++ + ++j;
		
		System.out.println(k);
		
		
		k = --j - i--;
		System.out.println(k);  // 
		
				
		k = ++i + i-- + i++ + --i;
		System.out.println(k);
		
		
		k = --i + ++i + i++ + i-- + ++i;
		System.out.println(k);
		
	}

}
