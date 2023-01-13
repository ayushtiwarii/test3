package encapsulation;

public class MainBranch {
	
	private int bankBalance;
	private String customerID;
	
	public void approveMoneyTransfer() {
		System.out.println("Money transfer is approved");
	}
	
	private void updateCustomerID() {
		
	}
		
	public void setBankBalance(int bal) {
		bankBalance=bal;
	}
	
	public int getBankBalance() {
		return bankBalance;
	}
}