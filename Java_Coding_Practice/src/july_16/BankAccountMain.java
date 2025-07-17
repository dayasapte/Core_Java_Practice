package july_16;

public class BankAccountMain {

	public static void main(String[] args) {
	
		BankAccount acc = new BankAccount();
		
		acc.setAccountNum(1000201);
		int num = acc.getAccountNum();
		System.out.println(num);
		
		acc.setName("Dayanand");
		String name = acc.getName();
		System.out.println(name);
		
		acc.setBalance(1100.55);
		double bal = acc.getBalance();
		System.out.println(bal);

	}

}
