
public class Product {
private int unit;
	
	public void setUnite(int unit) {
		this.unit = unit;
	}
	public int getUnit() {
		return this.unit;
	}
	public int getTotalPrice() {
		return unit * 100;
	}
	public String toString() {
		return "You buy "+unit+" units ("+getTotalPrice()+").";
	}
}
