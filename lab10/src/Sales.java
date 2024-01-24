import java.text.*;
public class Sales extends Employee {
	private double sales;
	DecimalFormat frm = new DecimalFormat("#,###.00");
	Sales(String id,String name,double sales,double salary){
		super(id,name,salary);
		this.sales = sales;
	}
	Sales(String id,String name,double sales){
		super(id,name);
		this.sales = sales;
	}
	public double getCommission() {
		if(sales < 10000) {
			return 0;
		}
		else if(sales < 50000){
			return (sales - 10000) * 0.10;
		}
		else{
			return (sales - 50000) * 0.15;
		}
	}
	public String toString() {
		return super.getName()+"("+super.getID()+") get commission "+
			   frm.format(getCommission())+" Baht.";
	}
}
