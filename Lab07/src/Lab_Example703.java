import java.util.*;
public class Lab_Example703 {

	public static void main(String[] args) {
		
			Scanner scan =new Scanner(System.in);
			int numbers[]=new int[5];
			for(int i=0;i<numbers.length;i++)
			{
				System.out.print("Input number"+(i+1)+": ");
				numbers[i] = scan.nextInt();
			}	
			System.out.println("\nSummation of possitive number is "+sumOfPos(numbers));
	}
	
	public static int sumOfPos(int nums[])
	{
		int sum = 0;
		for(int _Nums : nums) //use foreach Loops
		{
			if(_Nums>0)
			{
				sum+=_Nums;
				
			}
		}
		return sum;
			/* use Loop for
			 for(int i =0 ; i<nums.length;i++)
			  {
			  		if(nums[i]>0)
				{
					sum+=nums[i];
				
				}	
			  }
			  return sum;*/
		
		}//end of sumOfPos method

}
