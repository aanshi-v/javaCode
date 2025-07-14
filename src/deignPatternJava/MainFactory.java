package deignPatternJava;


//Factory design pattern
public class MainFactory {

	public static void main(String[] args) {
		
		 Payment payment = PaymentFactory.getPaymentMethod("creditcard");
	        payment.pay(1000);

	        Payment upiPayment = PaymentFactory.getPaymentMethod("upi");
	        upiPayment.pay(500);
	}

}
