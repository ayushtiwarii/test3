package oopsConcepts;

public class RBIPolicy {
	
	// Is-A relationship
	
	int rateOfInt;
	
	int getInterestRate() {
		rateOfInt = 10;
		return rateOfInt;
	}
	
	
	void kycUpdate(String customer) {
		System.out.println("Update the KYC of "+customer);
	}

}
