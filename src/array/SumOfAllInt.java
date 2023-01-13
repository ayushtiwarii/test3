package array;

public class SumOfAllInt {
	
	public static void main(String[] args) {
		int[] a = {10,11,12,13,14};
		int sum=0;
		
		/**
		 * b  sum
		 * 10 10
		 * 11 21
		 * 
		 * 
		 */
		
		for(int b:a) {
			sum = sum + b;
		}
		System.out.println(sum);
	}

}
