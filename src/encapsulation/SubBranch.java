package encapsulation;

public class SubBranch {
	
	public static void main(String[] args) {
		MainBranch obj = new MainBranch();

		obj.setBankBalance(5000);
		System.out.println(obj.getBankBalance());
	}

}
