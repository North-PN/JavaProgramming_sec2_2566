import javax.swing.JOptionPane;
public class Lab705 {

	public static void main(String[] args) {
		int number[] = new int[5];
		for(int i = 0 ; i < number.length ; i++)
		{
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1) ));		
		}
		showEven(number);
		showOdd(number);
	}//end of main method
	
	
	public static void showEven(int[] nums)
	{
		String mBox = "" ;
		for(int _nums : nums)
		{
			if(_nums%2==0)
			{
				mBox += _nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n"+mBox);
	}//end of showEven method
	
	
	public static void showOdd(int[] nums)
	{
		String mBox = "" ;
		for(int _nums : nums)
		{
			if(_nums%2==1)
			{
				mBox += _nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n"+mBox);
		
	}//end of showOdd method

}
