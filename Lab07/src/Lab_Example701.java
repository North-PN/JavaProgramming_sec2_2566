
public class Lab_Example701 {

	public static void main(String[] args) {
		
		int nums[] = {12, 50, 93, 45, 75, 52, 80 };
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println("nums["+i+"] = "+ nums[i]);
		}
		
		System.out.println("\nusing foreach to display value from array nums");
		int j = 0;
		  for(int _nums : nums)
		  {
		  	System.out.println("nums["+j+"] = "+_nums);
		  	j++;
		  }
		  printArray(nums);//method no return
		  
	}//end of main method()
	
	
	public static void printArray(int[] _nums) 
	{
		System.out.println("\nusing method to display value from array _nums");
		for(int i=0 ; i<_nums.length;i++) 
		{
			System.out.println("nums["+i+"] = "+ _nums[i]);
		}
		
		
		
	}//end of printArray method

}
