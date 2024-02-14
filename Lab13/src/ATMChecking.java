import java.text.*;
public class ATMChecking extends ATMData {
	private int money;
	
	ATMChecking(String name,String password,int money){
		super(name,password);
		this.money = money;
	}
	public boolean checkBookingBamnk() {
		return true;
	}
	
	public void show(int mBank) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.println("Tou drawing for "+frm.format(this.money)+",get"
				+ "\n1000 = "+(this.money/1000)
				+ "\n500  = "+((this.money%1000)/500)
				+ "\n100  = "+(((this.money%1000)%500)/100)
				+ "\nYour balance is "+frm.format(mBank - this.money)+"Baht.");
	}
}