package abstactionPrograms;

public class SBI implements RBI{
	
	@Override
	public void KYC() {
		System.out.println("KYC to be done in branch");
	}
	
	 public static void main(String[] args) {
		 int rateOfInterest = 19;
		System.out.println(rateOfInterest);
		System.out.println(RBI.rateOfInterest);
	 }

}

class HDFC implements RBI {

	@Override
	public void KYC() {
		// TODO Auto-generated method stub
		System.out.println("KYC to be done in branch or online");
	}
		
}

interface RBI{
	double rateOfInterest= 10.99;
	void KYC();
}


