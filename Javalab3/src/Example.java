import javax.swing.*; // import library for input data from Dialog box
import java.text.*;
public class Example {

	public static void main(String[] args) 
	{
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299 ;
		//input and convert data from Dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many custoer per bill"));
		
		double priceAfterdiscount , totalPrice = 0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using showMessage dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is " + priceAfterdiscount + " baht." );
		//using confirm Dialog box
		int memberCard;
		do 
		{
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice)+" batht."+
					"\nDo you have a member card?");
			
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		if(memberCard == JOptionPane.YES_OPTION) 
		{
			//discount = totalPrice - (totalPrice*10/100);
			priceAfterdiscount = totalPrice * 90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterdiscount) + " baht." );
		}//end of if
		else if (memberCard == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht." );
		}
		
		
		
		
		
		
	}

}
