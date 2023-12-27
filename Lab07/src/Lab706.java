import javax.swing.*;

public class Lab706 {

	public static void main(String[] args) {
		int[] numb = {25, 78, 41, 22, 36, 85, 37 };
		
		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		
		while(checkIndex(numb,indexNumb))
		{
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, agian : "));
		}
		int currentValue = currentData(numb,indexNumb);
		int prevValue = prevData(numb,indexNumb);
		int nextValue = nextData(numb,indexNumb);
		JOptionPane.showMessageDialog(null, "Current data,nums["+indexNumb+"] is "+currentValue
				+((prevData(numb,indexNumb) > 0) ?
						("\nPrevious data, nums[" + prevValue + " is " + numb[prevValue])
						:("\nNo prevoius Data"))
				+( (nextData(numb,indexNumb) < 6)?
						("\nNext data, nums[" + nextValue + " is " + numb[nextValue])
						: ("\nNo next Data"))
				);
		
	}//end of main method

	
	public static boolean checkIndex(int[] nums , int index) 
	{
		/*if(index>=nums.length || index<0) 
		{
			return true ;
		}
		else
		{
			return false;
		}	*/
		return (index>=nums.length || index<0)? true : false ; //using conditionaloperrater
	}//end of checkIndex method

	
	public static int currentData(int[] nums, int index) 
	{
		return nums[index];
	}//end of currentData() method
	
	
	public static int prevData(int[] nums , int index) 
	{
		return index-1;
	}//end of prevData() method
	
	
	public static int nextData(int[] nums , int index) 
	{
		return index+1;
	}//end of nextData() method
	
	
	
}
