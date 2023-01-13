package allTopics;

public class Practice01 {
	public static void main(String[] args){
		
		try{
			int i = 8/0;
		}
		
		
		catch (ArithmeticException ae) {
			throw new RuntimeException("This is a arithmatic execption");
		}
		 
		
		catch (Exception e){
			throw new RuntimeException("This is a run time execption");
		}
		

	}

}
