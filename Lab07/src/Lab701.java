import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		int[] number = new int[7];
		int odd = 0 ;
		Scanner scan = new Scanner(System.in);
		for(int i=0 ; i<number.length;i++)
		{
			System.out.print("input number "+(i+1)+" :");
			number[i] = scan.nextInt();
			if(number[i]%2==1)
			{
				odd++;
			}
		}
		System.out.println("\nThere are "+odd+" of odd number.");
		System.out.print("List of odd number : ");
		for(int _nums:number)
		{
			if(_nums%2==1)
			{
				System.out.print(_nums+" ");
			}
		}
	}

}
