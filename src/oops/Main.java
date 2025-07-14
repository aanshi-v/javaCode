package oops;

public class Main {

	public static void main(String[] args) {
		
		 SavingsAccount acc = new SavingsAccount("Aanshi", 1000);
	     acc.deposit(200);
	     acc.addInterest();             // Polymorphism: Extended method
	     acc.displayBalance();          // Output: Aanshi's balance: $1300.0
	     
	     BankAccount bacc = new BankAccount("bank account Aanshi", 2000);
	     bacc.withdraw(200);   // Easy to use!
	}

}
