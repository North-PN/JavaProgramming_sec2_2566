import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number[] = {78, 36, 58, 41, 25, 92,75};
		System.out.print("Input index of array : ");
		int index = scan.nextInt();
		while(index<0 || index > number.length-1)
		{
			System.out.print("Input index of array, again : ");
			index = scan.nextInt();
		}
		
		System.out.println("\nValue in current index is "+number[index]);
		
		if(index<number.length-1)
		{
			System.out.println("Value in next    index is "+number[index+1]);
		}
		else
		{
			System.out.println("Sorry, "+index+" is the last index of array.");	
		}
	}

}
