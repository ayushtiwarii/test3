package operators;

public class AssigmentOperators {
	
	public static void main(String[] args) {
		
		
		
		/***
		 *  i    j
		 *  10   21
		 *  40   1
		 *  41   
		 *  82
		 *   
		 *  
		 */ 
		
		int i=10;
		int j=21;
		
		i+=30;
		
		i = ++i + i--;  // 82
		
		System.out.println(i);
		
		
		 j%=2 + --j ;
		  
		  j = j + (j%=2);
		  
		  System.out.println(j);
		
	}

}
