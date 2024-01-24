
public class Customer {
	private int id;
	private String name;
	private int discount;
	
	Customer(int id ,String name,int discount){
		this.id = id;
		this.discount = discount;
		this.name = name;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return name+"("+id+")("+discount+"%)";
	}
}
