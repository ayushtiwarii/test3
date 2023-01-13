package operators;

public class LogicalAndOR {
	
	boolean f1,f2;
	
	
	void logicalOps(boolean f1, boolean f2) {
		this.f1=f1;
		this.f2=f2;
		
		if(f1 && f2) {
			
			System.out.println("Exectuing and block statement");
		}
		
		if(f1 || f2) {
			System.out.println("Exectuing or block statement");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		LogicalAndOR obj = new LogicalAndOR();
		obj.logicalOps(true, false);		
		
	}

}
