package deignPatternJava;

//Factory design pattern
public class PaymentFactory {

	 public static Payment getPaymentMethod(String method) {
		 
	        if (method.equalsIgnoreCase("creditcard")) {
	            return new CreditCardPayment();
	        } else if (method.equalsIgnoreCase("upi")) {
	            return new UPIPayment();
	        } else {
	            throw new IllegalArgumentException("Unknown payment method");
	        }
	    }
}
