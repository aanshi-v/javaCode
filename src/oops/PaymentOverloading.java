package oops;

public class PaymentOverloading {
	
	 // Overloaded methods
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in cash");
    }

    public void pay(double amount, String method) {
        System.out.println("Paid ₹" + amount + " via " + method);
    }

    
	public static void main(String[] args) {
		
		PaymentOverloading p = new PaymentOverloading();
		p.pay(500);                     // Paid ₹500 in cash
		p.pay(1000, "Credit Card");     // Paid ₹1000 via Credit Card
		
	}

}
