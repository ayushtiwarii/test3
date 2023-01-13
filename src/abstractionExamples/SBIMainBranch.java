package abstractionExamples;

public abstract class SBIMainBranch implements RBI_Bank{

	private void print2() {
		System.out.println("I am inside interface private method");
	}
	
	static void sethomeLoanIntertestRate() {
		System.out.println();
	}
	
	abstract void personalLoan();
	
	void homeLoan() {
		System.out.println("Initiating home loan");
	}
	
	
	
	@Override
	public void getBaseRate() {
		
	}

}
