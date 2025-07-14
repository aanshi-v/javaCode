package interview;

public class OrderDto {
	
	double amount;
    boolean isCustomerActive;
    boolean isProductInStock;
    
	public OrderDto(double amount, boolean isCustomerActive, boolean isProductInStock) {
		super();
		this.amount = amount;
		this.isCustomerActive = isCustomerActive;
		this.isProductInStock = isProductInStock;
	}

	@Override
	public String toString() {
		return "OrderDto [amount=" + amount + ", isCustomerActive=" + isCustomerActive + ", isProductInStock="
				+ isProductInStock + "]";
	}
    
    

}
