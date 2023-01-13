package oopsConcepts;

public class StateBankPolicy extends RBIPolicy{
	
	
	int getInterestRate() {
		rateOfInt = 16;
		return rateOfInt;
	}
	
	void getBankBal() {
		System.out.println("Balance");
	}
	
	void cashWithDrawl() {	
		System.out.println("Withdraw cash");
	}
	
	public static void main(String[] args) {
		/*
		 * StateBankPolicy sbi = new StateBankPolicy();
		 * System.out.println("Current interest rate:"+sbi.getInterestRate());
		 * sbi.kycUpdate("Ajit");
		 */
		
		//Up casting - Reference variable of parent will refer to object of child class
		RBIPolicy parentRef = new StateBankPolicy();
		System.out.println(parentRef.getInterestRate()); 
		
	}

}
