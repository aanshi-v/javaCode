package oops;

class BankAccount {

	private String owner;          // Encapsulation
    private double balance;

    public BankAccount(String owner, double balance) {  // Constructor
        this.owner = owner;
        this.balance = balance;
    }

 //Abstraction   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void withdraw(double amount) {
    	 if (amount <= balance) {
    	        balance -= amount;
    	        System.out.println("Withdrawn ₹" + amount);
    	    } else {
    	        System.out.println("Insufficient balance to withdraw ₹" + amount);
    	    } 
    }

    public void displayBalance() {
        System.out.println(owner + "'s balance: $" + balance);
    }
	
}



//Inheritance Example
class SavingsAccount extends BankAccount {
 public SavingsAccount(String owner, double balance) {
     super(owner, balance);
 }

 public void addInterest() {  // Additional behavior
     deposit(100);  // Fixed interest
 }
 
//Overriding displayBalance() → Polymorphism
 @Override
 public void displayBalance() {
     System.out.println("Savings Account Balance:");
     super.displayBalance();
 }
}



