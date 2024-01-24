import javax.swing.*;
public class Shop100Baht {
 
	public static void main(String[] args) {
		Product sold = new Product();
		int buttonConfirm = JOptionPane.showConfirmDialog(null,
							"Is the program run on Pattanakarn Branch?",
							"Run Program",
							JOptionPane.YES_NO_OPTION);
 
		if (buttonConfirm == 0) {
			sold = new PattanakarnBranch();
		}
 
		int numberofProduct = Integer.parseInt(
				JOptionPane.showInputDialog("Input the number of product:"));
		sold.setUnite(numberofProduct);
 
		JOptionPane.showMessageDialog(null, sold.toString());	}
 

}
