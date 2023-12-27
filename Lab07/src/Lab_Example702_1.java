import javax.swing.JOptionPane;
public class Lab_Example702_1 {
	
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double itemPrice = 0.0 ;//get price
	static boolean validItem = false ;//check item order (or not)

	public static void main(String[] args)
	{
		inputItem();//method no return	
	}//end of main method
	
	
	public static void inputItem() 
	{
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		
		if(checkItem(itemOrder)) //if(validitem==true)
		{
			System.out.println("Item "+itemOrder+" is "+itemPrice);
		}
		else 
		{
			System.out.println("Invalid Item ");
		}
		
		
	}//end of method inputItem()
	
	public static boolean checkItem(int item)
	{
		for(int i=0 ; i<validValues.length ;i++) //using loop check index 0 - 9
		{
			if(item==validValues[i]) 
			{
				itemPrice = price[i];
				validItem = true;
			}	
		}//end of for loop
		return validItem;
		
	}//end of method checkItem() 
	
}
