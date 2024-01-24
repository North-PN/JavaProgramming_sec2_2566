
public class Invoice {
	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id,Customer customer,double amount){
		this.id = id;
		this.customer = new Customer(customer.getID(),customer.getName(),customer.getDiscount());
		this.amount = amount;
	}
	public int getID() {
		return this.id;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return this.amount;
	}
	public void setAmount(double amount) {
		this.amount = amount ;
	}
	public int getCustomerID() {
		return customer.getID();
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	public double getAmountAfterDiscount() {
		return (amount - (amount*customer.getDiscount()/100));
	}
	public String toString() {
		return "Invoice [ id = "+getID()
				+",customer = "+customer.getName()
				+"("+customer.getID()+")("
				+customer.getDiscount()+"%), amount = "
				+getAmountAfterDiscount()+"]";
	}
}
