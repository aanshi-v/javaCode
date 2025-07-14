package oops;

public class BankAccountOverridingMain {

	public static void main(String[] args) {
		
		BankAccountOverriding acc = new SavingsAccount2();
		acc.withdraw(500);  

	}

}
