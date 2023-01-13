package operators;

public class PrefixNPostfix {

	int i=10;
//	int j=21;
	
	int calc() {
		int i=30;
		this.i=i;
		i++;
		return this.i++ + --i;
	}
	
	/**
	 *   i  local(i)  k
	 *   10    30     
	 *   30    31
	 *   30    30     60
	 *   31
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		PrefixNPostfix obj = new PrefixNPostfix();
		
		int k = obj.calc();
		System.out.println(k);
	
		System.out.println(obj.i);  
		
	}
}
