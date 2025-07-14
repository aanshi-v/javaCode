package oops;

//Override
public class BankAccountOverriding {
	
    public void withdraw(double amount) {
        System.out.println("Withdrawing ₹" + amount + " from general account");
    }
}


class SavingsAccount2 extends BankAccountOverriding {
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing ₹" + amount + " from savings account with interest rules");
    }
}
